package nexacro.sample.web.emp;

import java.util.List;

import javax.annotation.Resource;








import nexacro.sample.service.emp.MilitaryService;
import nexacro.sample.vo.emp.MilitaryVO;

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
public class MilitaryController {
	private static final Logger log = LoggerFactory.getLogger(MilitaryController.class);

	@Resource(name = "militaryService")
	private MilitaryService militaryService;
	
	@Resource
	private Validator	validator;

	@RequestMapping(value = "/militarySelectVO.do")
	public NexacroResult selectVo(@ParamDataSet(name = "ds_search", required = false) MilitaryVO militaryVO) {
        
		List<MilitaryVO> militaryList = militaryService.selectMilitaryVOList(militaryVO);
        NexacroResult result = new NexacroResult();
        result.addDataSet("output2", militaryList);
        
        
        return result;
    }
	@RequestMapping(value = "/militaryModifyVO.do")
	public NexacroResult modifyVO(@ParamDataSet(name = "input2") List<MilitaryVO> modifyList) throws NexacroException {
		
		validate(modifyList);

		militaryService.modifyMultiMilitaryVO(modifyList);

		NexacroResult result = new NexacroResult();

		return result;
	}
	
	private void validate(List<MilitaryVO> modifyList) throws NexacroException {
		BindingResult bindingResult = null;
		for (MilitaryVO MilitaryVO : modifyList) {
			bindingResult = new BeanPropertyBindingResult(MilitaryVO, "MilitaryVO");
			validator.validate(MilitaryVO, bindingResult);
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
