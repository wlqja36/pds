package nexacro.sample.web.Oct_SalaryTest;

import java.util.List;

import javax.annotation.Resource;





import nexacro.sample.service.Oct_SalaryTest.Oct_SalaryTestService;
import nexacro.sample.service.btrip_detail.Btr_DetailService;
import nexacro.sample.service.r_standard.R_standardService;
import nexacro.sample.vo.Oct_SalaryTest.Oct_SalaryTestVO;
import nexacro.sample.vo.btrip_detailVO.Btrip_detailVO;



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
public class SalaryTestController {

	private static final Logger log = LoggerFactory.getLogger(SalaryTestController.class);
	
	// Name 정의
	// @Autowired(required = false) // Type 정의
	@Resource(name = "Oct_SalaryTestService")
	private Oct_SalaryTestService	Oct_SalaryTestService;

	@Resource
	private Validator validator;

    @InitBinder
	public void initBinder(WebDataBinder dataBinder){
		dataBinder.setValidator(this.validator);
	}
    
    @RequestMapping(value = "/Oct_SalaryTestSelectVO.do")
	public NexacroResult Oct_SalaryTestSelectVO(@ParamDataSet(name = "ds_search", required = false) Oct_SalaryTestVO Oct_SalaryTestVO) {
        
        List<Oct_SalaryTestVO> rsList = Oct_SalaryTestService.selectOctSalaryTestVOList(Oct_SalaryTestVO);
        
        NexacroResult result = new NexacroResult();
        result.addDataSet("output", rsList);
        
        return result;
    }
    

    
	@RequestMapping(value = "/Oct_SalaryTestModifyVO.do")
	public NexacroResult Oct_SalaryTestmodifyVO(@ParamDataSet(name = "input") List<Oct_SalaryTestVO> modifyList) throws NexacroException {
		
		validate(modifyList);

		Oct_SalaryTestService.modifyMultiOctSalaryTestVO(modifyList);

		NexacroResult result = new NexacroResult();

		return result;
	}

	/**
	 * validate
	 * @param modifyList
	 * @throws NexacroException
	 */
	private void validate(List<Oct_SalaryTestVO> modifyList) throws NexacroException {
		BindingResult bindingResult = null;
		for (Oct_SalaryTestVO Oct_SalaryTestVO : modifyList) {
			bindingResult = new BeanPropertyBindingResult(Oct_SalaryTestVO, "Oct_SalaryTestVO");
			validator.validate(Oct_SalaryTestVO, bindingResult);
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
