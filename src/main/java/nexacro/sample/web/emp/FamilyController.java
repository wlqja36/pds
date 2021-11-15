package nexacro.sample.web.emp;

import java.util.List;

import javax.annotation.Resource;









import nexacro.sample.service.emp.FamilyService;
import nexacro.sample.service.emp.LicenseService;




import nexacro.sample.vo.emp.FamilyVO;
import nexacro.sample.vo.emp.LicenseVO;

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
public class FamilyController {
	private static final Logger log = LoggerFactory.getLogger(FamilyController.class);

	@Resource(name = "familyService")
	private FamilyService familyService;
	
	@Resource
	private Validator	validator;

	@RequestMapping(value = "/familySelectVO.do")
	public NexacroResult selectVo(@ParamDataSet(name = "ds_search", required = false) FamilyVO familyVO) {
        
		List<FamilyVO> familylList = familyService.selectFamilyVOList(familyVO);
        NexacroResult result = new NexacroResult();
        result.addDataSet("output2", familylList);
        
        
        return result;
    }
	@RequestMapping(value = "/familyModifyVO.do")
	public NexacroResult modifyVO(@ParamDataSet(name = "input2") List<FamilyVO> modifyList) throws NexacroException {
		
		validate(modifyList);

		familyService.modifyMultiFamilyVO(modifyList);

		NexacroResult result = new NexacroResult();

		return result;
	}
	
	private void validate(List<FamilyVO> modifyList) throws NexacroException {
		BindingResult bindingResult = null;
		for (FamilyVO FamilyVO : modifyList) {
			bindingResult = new BeanPropertyBindingResult(FamilyVO, "FamilyVO");
			validator.validate(FamilyVO, bindingResult);
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
