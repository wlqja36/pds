package nexacro.sample.web.emp_appo;

import java.util.List;

import javax.annotation.Resource;

import nexacro.sample.service.emp_appo.EmpAppoService;
import nexacro.sample.vo.emp_appo.Emp_appoVO;

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
public class EmpAppoController {

	private static final Logger log = LoggerFactory.getLogger(EmpAppoController.class);
	
	// Name 정의
	// @Autowired(required = false) // Type 정의
	@Resource(name = "EmpAppoService")
	private EmpAppoService	EmpAppoService;

	@Resource
	private Validator validator;

    @InitBinder
	public void initBinder(WebDataBinder dataBinder){
		dataBinder.setValidator(this.validator);
	}
    
    @RequestMapping(value = "/emp_appoSelectVO.do")
	public NexacroResult selectVo(@ParamDataSet(name = "ds_search", required = false) Emp_appoVO searchVO) {
        
        List<Emp_appoVO> userList = EmpAppoService.selectEmp_appoVO(searchVO);
        
        for(int i = 0; i < userList.size(); i++){
        	String emp_name = userList.get(i).getEMP_NO()+"("+userList.get(i).getEMP_NAME()+")";
        	String emp_reg = userList.get(i).getREG_EMP_NO()+"("+userList.get(i).getEMP_REG_NAME()+")";
        	String emp_mod = userList.get(i).getMOD_EMP_NO()+"("+userList.get(i).getEMP_MOD_NAME()+")";
        	String emp_ok = userList.get(i).getACCEPT_EMP_NO()+"("+userList.get(i).getEMP_OK_NAME()+")";
        	
        	userList.get(i).setEMP_NO(emp_name);
        	userList.get(i).setREG_EMP_NO(emp_reg);
        	userList.get(i).setMOD_EMP_NO(emp_mod);
        	userList.get(i).setACCEPT_EMP_NO(emp_ok);

        }
        
        NexacroResult result = new NexacroResult();
        result.addDataSet("output", userList);
        System.out.println("EmpAppoController");
        return result;
    }
    
	@RequestMapping(value = "/emp_appoModifyVO.do")
	public NexacroResult modifyVO(@ParamDataSet(name = "ds_input") List<Emp_appoVO> modifyList) throws NexacroException {
		
		validate(modifyList);
		System.out.println(modifyList.size());
		EmpAppoService.modifyMultiEmp_appoVO(modifyList);

		NexacroResult result = new NexacroResult();

		return result;
	}

	/**
	 * validate
	 * @param modifyList
	 * @throws NexacroException
	 */
	private void validate(List<Emp_appoVO> modifyList) throws NexacroException {
		BindingResult bindingResult = null;
		for (Emp_appoVO Emp_appoVO : modifyList) {
			bindingResult = new BeanPropertyBindingResult(Emp_appoVO, "Emp_appoVO");
			validator.validate(Emp_appoVO, bindingResult);
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
