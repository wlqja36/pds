package nexacro.sample.web.s_salbook;

import java.util.List;

import javax.annotation.Resource;







import nexacro.sample.service.s_salbook.S_tax_Service;
import nexacro.sample.vo.s_salbookVO.BonusVO;
import nexacro.sample.vo.s_salbookVO.SalaryVO;
import nexacro.sample.vo.s_salbookVO.TaxVO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
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
public class S_taxController {

	private static final Logger log = LoggerFactory.getLogger(S_taxController.class);
	
	// Name 정의
	// @Autowired(required = false) // Type 정의
	@Resource(name = "sbtax_Service")
	private S_tax_Service sbtax_Service;
    

	// 택스 생성
		@RequestMapping(value = "/sb_s_taxVO.do")
		public NexacroResult modifytaxUserVO(@ParamDataSet(name = "ds_search") List<TaxVO> t_modifyList) throws NexacroException {
			
			System.out.println("택스택스컨트롤러 --------");
			sbtax_Service.modifytax_User(t_modifyList);
			System.out.println("택스 인설트 ------------");

			NexacroResult result = new NexacroResult();
			

			return result;
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

