package nexacro.sample.web.Oct_btrip;

import java.util.List;

import javax.annotation.Resource;







import nexacro.sample.service.Oct_btrip.YJB_BtrService;
import nexacro.sample.vo.Oct_btrip.YJB_Btrip_ManagementVO;

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
public class YJB_BtrController {

	private static final Logger log = LoggerFactory.getLogger(YJB_BtrController.class);
	
	// Name 정의
	// @Autowired(required = false) // Type 정의
	@Resource(name = "YJB_btrService")
	private YJB_BtrService	btrService;

	@Resource
	private Validator validator;

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
    
    @RequestMapping(value = "/YJB_btrSelectVO.do")
	public NexacroResult selectVo(@ParamDataSet(name = "ds_search", required = false) YJB_Btrip_ManagementVO searchVo) {
        
        List<YJB_Btrip_ManagementVO> btrList;
		try {
			btrList = btrService.selectUserVOList(searchVo);
			NexacroResult result = new NexacroResult();
			result.addDataSet("output1", btrList);
			
			return result;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
    }
    
	@RequestMapping(value = "/YJB_btrModifyVO.do")
	public NexacroResult modifyVO(@ParamDataSet(name = "input1") List<YJB_Btrip_ManagementVO> modifyList) throws NexacroException {
		
		validate(modifyList);

		try {
			btrService.modifyMultiUserVO(modifyList);
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
	private void validate(List<YJB_Btrip_ManagementVO> modifyList) throws NexacroException {
		BindingResult bindingResult = null;
		for (YJB_Btrip_ManagementVO btrVO : modifyList) {
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
