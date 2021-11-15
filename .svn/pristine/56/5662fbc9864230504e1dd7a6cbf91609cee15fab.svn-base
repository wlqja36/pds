package nexacro.sample.web.Oct_btrip;

import java.util.List;

import javax.annotation.Resource;








import nexacro.sample.service.Oct_btrip.YJB_Btr_DetailService;
import nexacro.sample.vo.Oct_btrip.YJB_Btrip_detailVO;

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
public class YJB_Btr_DetailController {

	private static final Logger log = LoggerFactory.getLogger(YJB_Btr_DetailController.class);
	
	// Name 정의
	// @Autowired(required = false) // Type 정의
	@Resource(name = "YJB_btr_DetailService")
	private YJB_Btr_DetailService Btr_DetailService;

	@Resource
	private Validator	validator;

    @InitBinder
	public void initBinder(WebDataBinder dataBinder){
		dataBinder.setValidator(this.validator);
	}
    
    @RequestMapping(value = "/YJB_btrDetailSelectVO.do")
	public NexacroResult selectVo(@ParamDataSet(name = "ds_search", required = false) YJB_Btrip_detailVO searchVo) {
        
        List<YJB_Btrip_detailVO> btrdetailList;
		try {
			btrdetailList = Btr_DetailService.selectUserVOList(searchVo);
			NexacroResult result = new NexacroResult();
			result.addDataSet("output", btrdetailList);
			
			return result;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
    }
    

    
	@RequestMapping(value = "/YJB_btrDetailModifyVO.do")
	public NexacroResult modifyVO(@ParamDataSet(name = "input") List<YJB_Btrip_detailVO> modifyList) throws NexacroException {
		
		validate(modifyList);

		try {
			Btr_DetailService.modifyMultiUserVO(modifyList);
			NexacroResult result = new NexacroResult();
			
			return result;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * validate
	 * @param modifyList
	 * @throws NexacroException
	 */
	private void validate(List<YJB_Btrip_detailVO> modifyList) throws NexacroException {
		BindingResult bindingResult = null;
		for (YJB_Btrip_detailVO btrDetailVO : modifyList) {
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
