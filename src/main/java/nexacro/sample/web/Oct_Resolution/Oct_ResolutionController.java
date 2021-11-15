package nexacro.sample.web.Oct_Resolution;

import java.util.List;

import javax.annotation.Resource;

import nexacro.sample.service.Oct_Resolution.Oct_ResolutionService;
import nexacro.sample.vo.Oct_SalaryBook.Oct_SalaryBookVO;
import nexacro.sample.vo.Oct_emp.YJB_EmpVO;
import nexacro.sample.vo.Oct_resolution.Oct_ResolutionVO;

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
public class Oct_ResolutionController {
	private static final Logger log = LoggerFactory.getLogger(Oct_ResolutionController.class);
	
	
	@Resource(name="Oct_ResolutionService")
	private Oct_ResolutionService Oct_ResolutionService;
	
	@Resource
	private Validator validator;
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder){
		dataBinder.setValidator(this.validator);
	}
	

	
	@RequestMapping(value="/Oct_selectResolutionList.do") 
	public NexacroResult Oct_selectResolutionList(@ParamDataSet(name="ds_search") Oct_ResolutionVO Oct_ResolutionVO){
		
		List<Oct_ResolutionVO> Oct_ResolutionList = Oct_ResolutionService.selectOctResolutionVOList(Oct_ResolutionVO);
		
		//넥사크로 객체생성
		NexacroResult result = new NexacroResult();
		result.addDataSet("output", Oct_ResolutionList);
		return result;
	}
	

	
	@RequestMapping(value="Oct_selectSalarybookList.do") 
	public NexacroResult Oct_selectSalarybookList(@ParamDataSet(name="ds_search1") Oct_ResolutionVO Oct_ResolutionVO){
		
		List<Oct_SalaryBookVO> Oct_SalaryBookLsit = Oct_ResolutionService.Oct_selectSalarybookList(Oct_ResolutionVO);
		
		//넥사크로 객체생성
		NexacroResult result = new NexacroResult();
		result.addDataSet("output1", Oct_SalaryBookLsit);
		return result;
	}


	
	@RequestMapping(value="/Oct_ResolutionmodifyVO.do")
	public NexacroResult Oct_ResolutionmodifyVO(@ParamDataSet(name="input") List<Oct_ResolutionVO> modifyList) throws NexacroException{
		
		
		validate(modifyList);
		Oct_ResolutionService.modfiyMultiOctResolutionVO(modifyList);
		
		//넥사크로 객체생성
		NexacroResult result = new NexacroResult();
		return result;
	}
	
	private void validate(List<Oct_ResolutionVO> modifyList) throws NexacroException {
		BindingResult bindingResult = null; //BindingResult의 경우 매개변수를 Bean에 바인딩할때, 발생한 오류 정보를 받기위해 선언해야하는 어노테이션 
		
		for (Oct_ResolutionVO Oct_ResolutionVO : modifyList) {
			bindingResult = new BeanPropertyBindingResult(Oct_ResolutionVO, "Oct_ResolutionVO"); //에러체크
			validator.validate(Oct_ResolutionVO, bindingResult); //void validate(Object target, Errors error)
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
