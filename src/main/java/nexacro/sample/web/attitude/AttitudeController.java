package nexacro.sample.web.attitude;

import java.util.List;

import javax.annotation.Resource;

import nexacro.sample.service.administrator.AdmService;
import nexacro.sample.service.attitude.AttitudeBookService;
import nexacro.sample.service.attitude.AttitudeService;
import nexacro.sample.service.vacation.vacationInfoService;
import nexacro.sample.vo.attitudeVO.AttitudeBookVO;
import nexacro.sample.vo.attitudeVO.AttitudeVO;
import nexacro.sample.vo.btripVO.Btrip_ManagementVO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.spring.NexacroException;
import com.nexacro.spring.annotation.ParamDataSet;
import com.nexacro.spring.data.NexacroResult;

/**
 * Test를 위한 Controller Sample Class
 * 
 * @author Park SeongMin
 * @since 08.12.2015
 * @version 1.0
 * @see
 */
@Controller
public class AttitudeController {

	private static final Logger log = LoggerFactory.getLogger(AttitudeController.class);
	
	// Name 정의
	// @Autowired(required = false) // Type 정의
	@Resource(name = "attitudeService")
	private AttitudeService	attitudeService;
		
	
	@Resource(name="vacationInfoService")
	private vacationInfoService vacationInfoService;
	
	

	@Resource
	private Validator	validator;

    @InitBinder
	public void initBinder(WebDataBinder dataBinder){
		dataBinder.setValidator(this.validator);
	}

    
    //변동사항(삽입/수정/삭제)
    @RequestMapping(value = "/attitudeModifyVO.do")
	public NexacroResult modifyVO(@ParamDataSet(name = "input1") List<AttitudeVO> modifyList) throws NexacroException {
		
		validate(modifyList);

		
		attitudeService.modifyMultiAttitudeVO(modifyList);
		

		NexacroResult result = new NexacroResult();
		
		
		return result;
	}
    
    
    //조회
    @RequestMapping(value = "/attitudeSelectVO.do")
 	public NexacroResult selectVo(@ParamDataSet(name = "ds_search", required = false) AttitudeVO searchVo) {
         
         List<AttitudeVO> attitudeList = attitudeService.selectAttitudeVOList(searchVo);
         
           
         NexacroResult result = new NexacroResult();
         result.addDataSet("output1", attitudeList);         
         
         return result;
     }
    
   
    // 남은 연차정보유무 조회
    @RequestMapping(value = "/selectVacationLeft.do")
 	public NexacroResult selectVacationLeft(@ParamDataSet(name = "ds_search", required = false) AttitudeVO searchVo) {
         
    	System.out.println("=====EmpNo: "+searchVo.getSearchKeyword());
    	
         int vacationLeft = attitudeService.selectVacationLeft(searchVo);
         System.out.println("attitudeService.selectVacationLeft 서비스 실행");
           
         NexacroResult result = new NexacroResult();
         result.addVariable("vacationLeft", vacationLeft);       
         
         return result;
     }
     
   
    
    
    
    
	/**
	 * validate
	 * @param modifyList
	 * @throws NexacroException
	 */
	private void validate(List<AttitudeVO> modifyList) throws NexacroException {
		BindingResult bindingResult = null;
		for (AttitudeVO attitudeVO : modifyList) {
			bindingResult = new BeanPropertyBindingResult(attitudeVO, "attitudeVO");
			validator.validate(attitudeVO, bindingResult);
			if (bindingResult.hasErrors()) {
				String errorMessages = getErrorMessages(bindingResult);

				NexacroException nexacroException = new NexacroException(errorMessages);
				nexacroException.setErrorCode(NexacroException.DEFAULT_ERROR_CODE);
				nexacroException.setErrorMsg(errorMessages);

				throw nexacroException;
			}
		}
	}
	
	/**
	 * getErrorMessages
	 * @param bindingResult
	 */
	private String getErrorMessages(BindingResult bindingResult) {
		StringBuffer sb = new StringBuffer();
		
		for (ObjectError error : bindingResult.getAllErrors()) {
			sb.append(error.getDefaultMessage()).append("\n");
		}
		
		return sb.toString();
	}
}
