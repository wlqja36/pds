package nexacro.sample.web.vacation;

import java.util.List;

import javax.annotation.Resource;

import nexacro.sample.service.vacation.vacationSerivce;
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
public class VacationCodeController {
	private static final Logger log = LoggerFactory.getLogger(CareerController.class);

	@Resource(name = "vacationService")
	private vacationSerivce vacationService;
	
	@Resource
	private Validator validator;
	
	@RequestMapping(value = "vacationSelectVO.do")
	public NexacroResult vacationSelectVO(@ParamDataSet(name = "ds_search", required = false) vacationCodeVO vacationCodeVO){

		List<vacationCodeVO> vacationList = vacationService.selectVacationCodeVOList(vacationCodeVO);
		
		for(int i = 0; i < vacationList.size(); i++){
			
			String reg = vacationList.get(i).getReg_emp_id()+"("+vacationList.get(i).getEmp_reg_name()+")";	
			String mod = vacationList.get(i).getModify_emp_id()+"("+vacationList.get(i).getEmp_mod_name()+")";
			String ok = vacationList.get(i).getConfirm_emp_id()+"("+vacationList.get(i).getEmp_ok_name()+")";
			
			System.out.println(reg);
			System.out.println(mod);
			System.out.println(ok);
			vacationList.get(i).setReg_emp_id(reg);
			vacationList.get(i).setModify_emp_id(mod);
			vacationList.get(i).setConfirm_emp_id(ok);
			
			
			
		}
		NexacroResult result = new NexacroResult();
		result.addDataSet("output1",vacationList );
		
		return result;
	}


	@RequestMapping(value = "/vacationModifyVO.do")
	public NexacroResult vacationModifyVO(@ParamDataSet(name = "input2") List<vacationCodeVO> modifyList) throws NexacroException {

		validate(modifyList);	
		vacationService.modfiyMultiVacationCodeVO(modifyList);
		NexacroResult result = new NexacroResult();
		return result;
	}
	
    private void validate(List<vacationCodeVO> modifyList) throws NexacroException {
		BindingResult bindingResult = null;
		for (vacationCodeVO vacationCodeVO : modifyList) {
			bindingResult = new BeanPropertyBindingResult(vacationCodeVO, "vacationCodeVO");
			validator.validate(vacationCodeVO, bindingResult);
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
