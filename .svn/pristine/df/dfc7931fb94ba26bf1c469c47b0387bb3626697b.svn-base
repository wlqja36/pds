package nexacro.sample.web.attitude;

import java.util.List;

import javax.annotation.Resource;

import nexacro.sample.service.administrator.AdmService;
import nexacro.sample.service.attitude.AttitudeBookService;
import nexacro.sample.vo.attitudeVO.AttitudeBookVO;
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
public class AttitudeBookController {

	private static final Logger log = LoggerFactory.getLogger(AttitudeBookController.class);
	
	// Name 정의
	// @Autowired(required = false) // Type 정의
	@Resource(name = "attitudeBookService")
	private AttitudeBookService	attitudeBookService;
	
//
	
	
	

	@Resource
	private Validator	validator;

    @InitBinder
	public void initBinder(WebDataBinder dataBinder){
		dataBinder.setValidator(this.validator);
	}

    
    //대장변동사항(삽입/수정/삭제)
    @RequestMapping(value = "/attitudeBookModifyVO.do")
	public NexacroResult modifyVO(@ParamDataSet(name = "input1") List<AttitudeBookVO> modifyList) throws NexacroException {
		
		validate(modifyList);

		
		attitudeBookService.modifyMultiBookVO(modifyList);
		

		NexacroResult result = new NexacroResult();
		//result.addVariable("yook", attitudeBookService.selectAttitudeSeq());
		
		return result;
	}
    
    //조회
    @RequestMapping(value = "/attitudeBookSelectVO.do")
 	public NexacroResult selectVo(@ParamDataSet(name = "ds_search", required = false) AttitudeBookVO searchVo) {
         
         List<AttitudeBookVO> attitudeBookList = attitudeBookService.selectBookVOList(searchVo);
         
         
         
         
         NexacroResult result = new NexacroResult();
         result.addDataSet("output1", attitudeBookList);
         
         
         
         
         return result;
     }
    
   
    
    
    
    
    
    
    
   
    
    
    
    
	/**
	 * validate
	 * @param modifyList
	 * @throws NexacroException
	 */
	private void validate(List<AttitudeBookVO> modifyList) throws NexacroException {
		BindingResult bindingResult = null;
		for (AttitudeBookVO attitudeBookVO : modifyList) {
			bindingResult = new BeanPropertyBindingResult(attitudeBookVO, "attitudeBookVO");
			validator.validate(attitudeBookVO, bindingResult);
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
