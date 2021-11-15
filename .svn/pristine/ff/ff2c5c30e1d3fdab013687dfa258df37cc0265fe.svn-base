package nexacro.sample.web.s_book;

import java.util.List;

import javax.annotation.Resource;


import nexacro.sample.service.s_book.S_bookService;


import nexacro.sample.vo.s_bookVO.S_bookVO;


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

/**
 * Test를 위한 Controller Sample Class
 * 
 * @author Park SeongMin
 * @since 08.12.2015
 * @version 1.0
 * @see
 */
@Controller
public class S_bookController {

	private static final Logger log = LoggerFactory.getLogger(S_bookController.class);
	
	// Name 정의
	// @Autowired(required = false) // Type 정의
	@Resource(name = "sbService")
	private S_bookService	sbService;

	@Resource
	private Validator	validator;

    @InitBinder
	public void initBinder(WebDataBinder dataBinder){
		dataBinder.setValidator(this.validator);
	}
    
    @RequestMapping(value = "/sbSelectVO.do")
	public NexacroResult selectVo(@ParamDataSet(name = "ds_search", required = false) S_bookVO searchVo) {
        
        List<S_bookVO> sbList = sbService.selectUserVOList(searchVo);
        
        NexacroResult result = new NexacroResult();
        result.addDataSet("output1", sbList);
        
        return result;
    }
    
	@RequestMapping(value = "/sbModifyVO.do")
	public NexacroResult modifyVO(@ParamDataSet(name = "input1") List<S_bookVO> modifyList) throws NexacroException {
		
		validate(modifyList);

		sbService.modifyMultiUserVO(modifyList);

		NexacroResult result = new NexacroResult();


		return result;
	}
	
	

	/**
	 * validate
	 * @param modifyList
	 * @throws NexacroException
	 */
	private void validate(List<S_bookVO> modifyList) throws NexacroException {
		BindingResult bindingResult = null;
		for (S_bookVO sbVO : modifyList) {
			bindingResult = new BeanPropertyBindingResult(sbVO, "sbVO");
			validator.validate(sbVO, bindingResult);
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
