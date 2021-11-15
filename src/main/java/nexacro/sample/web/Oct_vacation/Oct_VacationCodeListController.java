package nexacro.sample.web.Oct_vacation;

import java.util.List;

import javax.annotation.Resource;

import nexacro.sample.service.Oct_vacation.Oct_vacationCodeListService;
import nexacro.sample.vo.Oct_vacation.Oct_vacationCodeListVO;
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
public class Oct_VacationCodeListController {
	private static final Logger log = LoggerFactory.getLogger(CareerController.class);

	@Resource(name = "Oct_vacationCodeListService")
	private Oct_vacationCodeListService Oct_vacationCodeListService;
	
	@Resource
	private Validator validator;
	
	@RequestMapping(value = "/Oct_vacationCodeListSelectVO.do")
	public NexacroResult Oct_vacationCodeListSelectVO(@ParamDataSet(name = "ds_search", required = false) Oct_vacationCodeListVO Oct_vacationCodeListVO){
		
		System.out.println(Oct_vacationCodeListVO.getSearchKeyword());
		System.out.println(Oct_vacationCodeListVO.getSearchCondition());
		List<Oct_vacationCodeListVO> Oct_vacationCodeList = Oct_vacationCodeListService.selectOctVacationCodeListVOList(Oct_vacationCodeListVO);
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_output",Oct_vacationCodeList);
		
		return result;
	}


	@RequestMapping(value = "/Oct_vacationCodeListModifyVO.do")
	public NexacroResult Oct_vacationCodeListModifyVO(@ParamDataSet(name = "input2") List<Oct_vacationCodeListVO> modifyList) throws NexacroException {

		validate(modifyList);	
		Oct_vacationCodeListService.modfiyMultiOctVacationCodeListVO(modifyList);
		NexacroResult result = new NexacroResult();
		return result;
	}
	
    private void validate(List<Oct_vacationCodeListVO> modifyList) throws NexacroException {
		BindingResult bindingResult = null;
		for (Oct_vacationCodeListVO Oct_vacationCodeListVO : modifyList) {
			bindingResult = new BeanPropertyBindingResult(Oct_vacationCodeListVO, "Oct_vacationCodeListVO");
			validator.validate(Oct_vacationCodeListVO, bindingResult);
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
