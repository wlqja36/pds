package nexacro.sample.web.Oct_vacation;

import java.util.List;

import javax.annotation.Resource;

import nexacro.sample.service.Oct_vacation.Oct_vacationInfoService;
import nexacro.sample.vo.Oct_vacation.Oct_vacationInfoVO;
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
public class Oct_VacationInfoController {
	private static final Logger log = LoggerFactory.getLogger(CareerController.class);

	@Resource(name = "Oct_vacationInfoService")
	private Oct_vacationInfoService Oct_vacationInfoService;
	
	@Resource
	private Validator validator;
	
	@RequestMapping(value = "/Oct_vacationInfoSelectVO.do")
	public NexacroResult Oct_vacationInfoSelectVO(@ParamDataSet(name = "ds_search", required = false) Oct_vacationInfoVO Oct_vacationInfoVO) throws Exception{
		
		List<Oct_vacationInfoVO> Oct_vacationList = Oct_vacationInfoService.selectOctVacationInfoVOList(Oct_vacationInfoVO);
		
		
		NexacroResult result = new NexacroResult();
		result.addDataSet("output2",Oct_vacationList);
		
		return result;
	}
	


	@RequestMapping(value = "/Oct_vacationInfoModifyVO.do")
	public NexacroResult Oct_vacationInfoModifyVO(@ParamDataSet(name = "input2") List<Oct_vacationInfoVO> modifyList) throws Exception {

		validate(modifyList);		
		Oct_vacationInfoService.modfiyMultiOctVacationInfoVO(modifyList);
		
		NexacroResult result = new NexacroResult();
		return result;
	}
	
    private void validate(List<Oct_vacationInfoVO> modifyList) throws NexacroException {
		BindingResult bindingResult = null;
		for (Oct_vacationInfoVO Oct_vacationInfoVO : modifyList) {
			bindingResult = new BeanPropertyBindingResult(Oct_vacationInfoVO, "Oct_vacationInfoVO");
			validator.validate(Oct_vacationInfoVO, bindingResult);
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
