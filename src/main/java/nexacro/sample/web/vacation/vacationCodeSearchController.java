package nexacro.sample.web.vacation;

import java.util.List;

import javax.annotation.Resource;

import nexacro.sample.service.vacation.vacationCodeSearchService;
import nexacro.sample.service.vacation.vacationSerivce;
import nexacro.sample.vo.emp.CareerVO;
import nexacro.sample.vo.vacation.vacationCodeSearchVO;
import nexacro.sample.vo.vacation.vacationCodeVO;
import nexacro.sample.web.emp.CareerController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.spring.NexacroException;
import com.nexacro.spring.annotation.ParamDataSet;
import com.nexacro.spring.data.NexacroResult;

@Controller
public class vacationCodeSearchController {
	private static final Logger log = LoggerFactory.getLogger(CareerController.class);

	@Resource(name = "vacationCodeSearchService")
	private vacationCodeSearchService vacationCodeSearchService;
	
	@Resource
	private Validator validator;
	
	@RequestMapping(value = "/vacationSelectSearchVO.do")
	public NexacroResult vacationSearchSelectVO(@ParamDataSet(name = "ds_search", required = false) vacationCodeSearchVO vacationCodeSearchVO){
		
		System.out.println(vacationCodeSearchVO.getSearchKeyword());
		System.out.println(vacationCodeSearchVO.getSearchCondition());
		List<vacationCodeSearchVO> vacationSearchList = vacationCodeSearchService.selectVacationSearchCodeVOList(vacationCodeSearchVO);
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_output",vacationSearchList);
		
		return result;
	}


	@RequestMapping(value = "/vacationSearchModifyVO.do")
	public NexacroResult vacationSearchModifyVO(@ParamDataSet(name = "input2") List<vacationCodeSearchVO> modifyList) throws NexacroException {

		validate(modifyList);	
		vacationCodeSearchService.modfiyMultiVacationSearchCodeVO(modifyList);
		NexacroResult result = new NexacroResult();
		return result;
	}
	
    private void validate(List<vacationCodeSearchVO> modifyList) throws NexacroException {
		BindingResult bindingResult = null;
		for (vacationCodeSearchVO vacationCodeSearchVO : modifyList) {
			bindingResult = new BeanPropertyBindingResult(vacationCodeSearchVO, "vacationCodeSearchVO");
			validator.validate(vacationCodeSearchVO, bindingResult);
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
