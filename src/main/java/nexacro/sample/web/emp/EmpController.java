package nexacro.sample.web.emp;

import java.util.List;

import javax.annotation.Resource;







import nexacro.sample.service.UserService;
import nexacro.sample.service.emp.CareerService;
import nexacro.sample.service.emp.EmpService;
import nexacro.sample.vo.emp.EmpVO;







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
public class EmpController {
	private static final Logger log = LoggerFactory.getLogger(EmpController.class);

	@Resource(name = "empService")
	private EmpService empService;
	
	@Resource
	private Validator	validator;

    @InitBinder
	public void initBinder(WebDataBinder dataBinder){
		dataBinder.setValidator(this.validator);
	}
    
    @RequestMapping(value = "/empSelectVO.do")
	public NexacroResult selectVo(@ParamDataSet(name = "ds_search", required = false) EmpVO searchVo) {
	    List<EmpVO> empList = empService.SelectEmpVOList(searchVo);
        NexacroResult result = new NexacroResult();
        result.addDataSet("output1", empList);
        
        return result;
    }
    
	@RequestMapping(value = "/empModifyVO.do")
	public NexacroResult modifyVO(@ParamDataSet(name = "input1") List<EmpVO> modifyList) throws NexacroException {
		
		validate(modifyList);

		empService.modifyMultiEmpVO(modifyList);

		NexacroResult result = new NexacroResult();

		return result;
	}
    
    /**
	 * validate
	 * @param modifyList
	 * @throws NexacroException
	 */
    private void validate(List<EmpVO> modifyList) throws NexacroException {
		BindingResult bindingResult = null;
		for (EmpVO EmpVO : modifyList) {
			bindingResult = new BeanPropertyBindingResult(EmpVO, "EmpVO");
			validator.validate(EmpVO, bindingResult);
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
