package nexacro.sample.web.btrip;

import java.util.List;

import javax.annotation.Resource;

import nexacro.sample.service.UserService;
import nexacro.sample.service.btrip.BtrService;
import nexacro.sample.vo.UserVO;
import nexacro.sample.vo.btripVO.Btrip_ManagementVO;
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
public class BtrController {

	private static final Logger log = LoggerFactory.getLogger(BtrController.class);
	
	// Name 정의
	// @Autowired(required = false) // Type 정의
	@Resource(name = "btrService")
	private BtrService	btrService;

	@Resource
	private Validator	validator;

    @InitBinder
	public void initBinder(WebDataBinder dataBinder){
		dataBinder.setValidator(this.validator);
	}
  /*  @RequestMapping(value = "/btrDetailconfirmVO.do")
    public NexacroResult confirmVo(@ParamDataSet(name = "ds_search", required = false) Btrip_ManagementVO searchVo) {
    	
    	List<Btrip_ManagementVO> btrdetailList = btrService.confirmVOList(searchVo);
    	
    	NexacroResult result = new NexacroResult();
    	result.addDataSet("output2", btrdetailList);
    	
    	return result;
    }*/
    
    @RequestMapping(value = "/btrSelectVO.do")
	public NexacroResult selectVo(@ParamDataSet(name = "ds_search", required = false) Btrip_ManagementVO searchVo) {
        
        List<Btrip_ManagementVO> btrList = btrService.selectUserVOList(searchVo);
        
        NexacroResult result = new NexacroResult();
        result.addDataSet("output1", btrList);
        
        return result;
    }
    
	@RequestMapping(value = "/btrModifyVO.do")
	public NexacroResult modifyVO(@ParamDataSet(name = "input1") List<Btrip_ManagementVO> modifyList) throws NexacroException {
		
		validate(modifyList);

		btrService.modifyMultiUserVO(modifyList);

		NexacroResult result = new NexacroResult();

		return result;
	}

	/**
	 * validate
	 * @param modifyList
	 * @throws NexacroException
	 */
	private void validate(List<Btrip_ManagementVO> modifyList) throws NexacroException {
		BindingResult bindingResult = null;
		for (Btrip_ManagementVO btrVO : modifyList) {
			bindingResult = new BeanPropertyBindingResult(btrVO, "btrVO");
			validator.validate(btrVO, bindingResult);
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
