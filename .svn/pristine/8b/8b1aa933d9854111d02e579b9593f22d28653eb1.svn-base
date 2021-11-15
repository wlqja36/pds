package nexacro.sample.web.emp;

import java.util.List;

import javax.annotation.Resource;





import nexacro.sample.service.emp.Language_abilityService;



import nexacro.sample.vo.emp.Language_abilityVO;

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
public class Language_abilityController {
	
	private static final Logger log = LoggerFactory.getLogger(Language_abilityController.class);

	@Resource(name = "language_abilityService")
	private Language_abilityService language_abilityService;
	
	@Resource
	private Validator	validator;

	@RequestMapping(value = "/language_abilitySelectVO.do")
	public NexacroResult selectVo(@ParamDataSet(name = "ds_search", required = false) Language_abilityVO language_abilityVO) {
        
		List<Language_abilityVO> language_abilityList = language_abilityService.selectLanguage_abilityVOList(language_abilityVO);
        NexacroResult result = new NexacroResult();
        result.addDataSet("output2", language_abilityList);
        
        
        return result;
    }
	
	@RequestMapping(value = "/language_abilityModifyVO.do")
	public NexacroResult modifyVO(@ParamDataSet(name = "input2") List<Language_abilityVO> modifyList) throws NexacroException {
		
		validate(modifyList);

		language_abilityService.modifyMultiLanguage_abilityVO(modifyList);

		NexacroResult result = new NexacroResult();

		return result;
	}
	
	private void validate(List<Language_abilityVO> modifyList) throws NexacroException {
		BindingResult bindingResult = null;
		for (Language_abilityVO Language_abilityVO : modifyList) {
			bindingResult = new BeanPropertyBindingResult(Language_abilityVO, "Language_abilityVO");
			validator.validate(Language_abilityVO, bindingResult);
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
