package nexacro.sample.web.Oct_vacation;

import java.util.List;

import javax.annotation.Resource;

import nexacro.sample.service.Oct_vacation.Oct_vacationService;
import nexacro.sample.service.vacation.vacationSerivce;
import nexacro.sample.vo.Oct_vacation.Oct_vacationCodeVO;
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
public class Oct_VacationCodeController {
	private static final Logger log = LoggerFactory.getLogger(CareerController.class);

	@Resource(name = "Oct_vacationService")
	private Oct_vacationService Oct_vacationService;
	
	@Resource
	private Validator validator;
	
	@RequestMapping(value = "Oct_vacationSelectVO.do")
	public NexacroResult Oct_vacationSelectVO(@ParamDataSet(name = "ds_search", required = false) Oct_vacationCodeVO Oct_vacationCodeVO) throws Exception{

		List<Oct_vacationCodeVO> Oct_vacationList = Oct_vacationService.selectOctVacationCodeVOList(Oct_vacationCodeVO);
		
		NexacroResult result = new NexacroResult();
		result.addDataSet("output1",Oct_vacationList );
		
		return result;
	}


	@RequestMapping(value = "/Oct_vacationModifyVO.do")
	public NexacroResult Oct_vacationModifyVO(@ParamDataSet(name = "input2") List<Oct_vacationCodeVO> modifyList) throws NexacroException {

		validate(modifyList);	
		Oct_vacationService.modfiyMultiOctVacationCodeVO(modifyList);
		NexacroResult result = new NexacroResult();
		return result;
	}
	
    private void validate(List<Oct_vacationCodeVO> modifyList) throws NexacroException {
		BindingResult bindingResult = null;
		for (Oct_vacationCodeVO Oct_vacationCodeVO : modifyList) {
			bindingResult = new BeanPropertyBindingResult(Oct_vacationCodeVO, "Oct_vacationCodeVO");
			validator.validate(Oct_vacationCodeVO, bindingResult);
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
