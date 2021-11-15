package nexacro.sample.web.attiInfo;

import java.util.List;

import javax.annotation.Resource;

import nexacro.sample.service.attiInfoService.AttiInfoService;
import nexacro.sample.vo.DefaultVO;
import nexacro.sample.vo.atticode.Attend_InfoVO;
import nexacro.sample.vo.atticode.AttitudeInfoVO;
import nexacro.sample.vo.attitudeVO.AttitudeBookVO;
import nexacro.sample.vo.emp.EmpVO;
import nexacro.sample.vo.resolution.ResolutionVO;
import nexacro.sample.web.resolution.ResolutionController;

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

@Controller
public class AttiInfoController {
	private static final Logger log = LoggerFactory.getLogger(ResolutionController.class);
	
	@Resource(name="attiInfoService")
	private AttiInfoService attiInfoService; 
	
	@Resource
	private Validator validator;
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder){
		dataBinder.setValidator(this.validator);
	}
	
	@RequestMapping(value="/loadAttendInfo.do")
	public NexacroResult loadAttendInfo(@ParamDataSet(name="ds_search_info") Attend_InfoVO searchKeyword){
		
		System.out.println("====loadAttendanceInfo 컨트롤러 들어옴!");
		List<Attend_InfoVO> attiInfoList = attiInfoService.loadAttendInfo(searchKeyword);
		
		System.out.println("==size: "+ attiInfoList.size());
		
		//넥사크로 객체생성
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_atti_info", attiInfoList);
		return result;
	}

	@RequestMapping(value="/loadAttitudeInfo.do")
	public NexacroResult loadAttitudeInfo(@ParamDataSet(name="ds_search_info") Attend_InfoVO searchKeyword){
		
		System.out.println("====loadAttitudeInfo 컨트롤러 들어옴!");
		List<AttitudeInfoVO> attitudeInfoList = attiInfoService.loadAttitudeInfo(searchKeyword);
		
		System.out.println("==size: "+ attitudeInfoList.size());
		
		//넥사크로 객체생성
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_atti_summury", attitudeInfoList);
		return result;
	}
	
	@RequestMapping(value="/loadAttendBookNo.do")
	public NexacroResult loadAttendInfo(){
		
		System.out.println("====loadAttendBookNo 컨트롤러 들어옴!");
		List<AttitudeBookVO> attiBookList = attiInfoService.loadAttendBookNo();
		
		System.out.println("==size: "+ attiBookList.size());
		
		//넥사크로 객체생성
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_attitude_book", attiBookList);
		return result;
	}

	@RequestMapping(value="/searchEmp.do")
	public NexacroResult searchEmp(@ParamDataSet(name="ds_search_info1") Attend_InfoVO searchKeyword){
		
		System.out.println("====searchEmp 컨트롤러 들어옴!");
		List<EmpVO> empNoInfo = attiInfoService.searchEmp(searchKeyword);
		
		System.out.println("==size: "+ empNoInfo.size());
		
		//넥사크로 객체생성
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_EmpList", empNoInfo);
		return result;
	}
	
	
	
	
	private void validate(List<Attend_InfoVO> attiInfoList) throws NexacroException {
		BindingResult bindingResult = null; //BindingResult의 경우 매개변수를 Bean에 바인딩할때, 발생한 오류 정보를 받기위해 선언해야하는 어노테이션 
		
		for (Attend_InfoVO attiInfoVO : attiInfoList) {
//			System.out.println("resList validate 시작중: ");
			bindingResult = new BeanPropertyBindingResult(attiInfoVO, "attiInfoVO"); //에러체크
			validator.validate(attiInfoVO, bindingResult); //void validate(Object target, Errors error)
//			System.out.println("=== validate 확인 완료");
			if (bindingResult.hasErrors()) {
				String errorMessages = getErrorMessages(bindingResult);

				NexacroException nexacroException = new NexacroException(errorMessages);
				nexacroException.setErrorCode(NexacroException.DEFAULT_ERROR_CODE);
				nexacroException.setErrorMsg(errorMessages);

				throw nexacroException;
			}
		}
	}
	
	private String getErrorMessages(BindingResult bindingResult) {
		StringBuffer sb = new StringBuffer();
		
		for (ObjectError error : bindingResult.getAllErrors()) {
			sb.append(error.getDefaultMessage()).append("\n");
		}
		
		return sb.toString();
	}
	
}
