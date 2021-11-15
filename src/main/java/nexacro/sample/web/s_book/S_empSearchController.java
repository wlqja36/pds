package nexacro.sample.web.s_book;

import java.util.List;

import javax.annotation.Resource;

import nexacro.sample.service.s_book.S_bookCodeService;
import nexacro.sample.service.s_book.S_empSearchService;
import nexacro.sample.service.vacation.vacationCodeSearchService;
import nexacro.sample.service.vacation.vacationSerivce;
import nexacro.sample.vo.emp.CareerVO;
import nexacro.sample.vo.s_bookVO.S_bookCodeVO;
import nexacro.sample.vo.s_bookVO.S_empSearchVO;
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
public class S_empSearchController {
	private static final Logger log = LoggerFactory.getLogger(CareerController.class);

	@Resource(name = "s_empSearchService")
	private S_empSearchService s_empSearchService;
	
	@Resource
	private Validator validator;
	
	@RequestMapping(value = "/s_empSearchVO.do")
	public NexacroResult s_empSearchSelectVO(@ParamDataSet(name = "ds_search", required = false) S_empSearchVO SearchVO){
		
		
		List<S_empSearchVO> s_empSearchList = s_empSearchService.selectS_empSearchVOList(SearchVO);
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_output",s_empSearchList);
		
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

