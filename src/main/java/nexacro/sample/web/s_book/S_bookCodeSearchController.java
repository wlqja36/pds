package nexacro.sample.web.s_book;

import java.util.List;

import javax.annotation.Resource;

import nexacro.sample.service.s_book.S_bookCodeService;
import nexacro.sample.service.vacation.vacationCodeSearchService;
import nexacro.sample.service.vacation.vacationSerivce;
import nexacro.sample.vo.emp.CareerVO;
import nexacro.sample.vo.s_bookVO.S_bookCodeVO;
import nexacro.sample.vo.vacation.vacationCodeSearchVO;
import nexacro.sample.vo.vacation.vacationCodeVO;
import nexacro.sample.web.emp.CareerController;

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
public class S_bookCodeSearchController {
	private static final Logger log = LoggerFactory.getLogger(CareerController.class);

	@Resource(name = "s_bookCodeService")
	private S_bookCodeService s_bookCodeService;
	
	@Resource
	private Validator validator;
	
	@RequestMapping(value = "/s_bookSelectSearchVO.do")
	public NexacroResult vacationSearchSelectVO(@ParamDataSet(name = "ds_search", required = false) S_bookCodeVO SearchVO){
		
		
		List<S_bookCodeVO> s_codeList = s_bookCodeService.selectS_bookSearchCodeVOList(SearchVO);
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_output",s_codeList);
		
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

