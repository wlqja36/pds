package nexacro.sample.web.btrip_detail;

import java.util.List;

import javax.annotation.Resource;




import nexacro.sample.service.btrip_detail.Btr_DetailService;
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
public class Btr_DetailController {

	private static final Logger log = LoggerFactory.getLogger(Btr_DetailController.class);
	
	// Name 정의
	// @Autowired(required = false) // Type 정의
	@Resource(name = "btr_DetailService")
	private Btr_DetailService	Btr_DetailService;

	@Resource
	private Validator	validator;

    @InitBinder
	public void initBinder(WebDataBinder dataBinder){
		dataBinder.setValidator(this.validator);
	}
    
    @RequestMapping(value = "/btrDetailSelectVO.do")
	public NexacroResult selectVo(@ParamDataSet(name = "ds_search", required = false) Btrip_detailVO searchVo) {
        
        List<Btrip_detailVO> btrdetailList = Btr_DetailService.selectUserVOList(searchVo);
        
        NexacroResult result = new NexacroResult();
        result.addDataSet("output", btrdetailList);
        
        return result;
    }
    

    
	@RequestMapping(value = "/btrDetailModifyVO.do")
	public NexacroResult modifyVO(@ParamDataSet(name = "input") List<Btrip_detailVO> modifyList) throws NexacroException {
		
		validate(modifyList);

		Btr_DetailService.modifyMultiUserVO(modifyList);

		NexacroResult result = new NexacroResult();

		return result;
	}

	/**
	 * validate
	 * @param modifyList
	 * @throws NexacroException
	 */
	private void validate(List<Btrip_detailVO> modifyList) throws NexacroException {
		BindingResult bindingResult = null;
		for (Btrip_detailVO btrDetailVO : modifyList) {
			bindingResult = new BeanPropertyBindingResult(btrDetailVO, "btrDetailVO");
			validator.validate(btrDetailVO, bindingResult);
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
