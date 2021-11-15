package nexacro.sample.web.Oct_SalaryBook;

import java.util.List;

import javax.annotation.Resource;




import nexacro.sample.service.Oct_SalaryBook.Oct_SalarybookService;
import nexacro.sample.service.s_book.S_bookService;


import nexacro.sample.vo.Oct_SalaryBook.Oct_SalaryBookVO;
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

@Controller
public class Oct_SalarybookController {

	private static final Logger log = LoggerFactory.getLogger(Oct_SalarybookController.class);
	
	@Resource(name = "Oct_SalarybookService")
	private Oct_SalarybookService Oct_SalarybookService;

	@Resource
	private Validator	validator;

    @InitBinder
	public void initBinder(WebDataBinder dataBinder){
		dataBinder.setValidator(this.validator);
	}
    
    @RequestMapping(value = "/Oct_SalaryBookSelectVO.do")
	public NexacroResult Oct_SalaryBookselectVo(@ParamDataSet(name = "ds_search", required = false) Oct_SalaryBookVO Oct_SalaryBookVo) {
        
        List<Oct_SalaryBookVO> Oct_SalaryBookList = Oct_SalarybookService.selectOctSalaryBookVOList(Oct_SalaryBookVo);
        
        NexacroResult result = new NexacroResult();
        result.addDataSet("output1", Oct_SalaryBookList);
        
        return result;
    }
    
	@RequestMapping(value = "/Oct_SalaryBookModifyVO.do")
	public NexacroResult Oct_SalaryBookmodifyVO(@ParamDataSet(name = "input1") List<Oct_SalaryBookVO> modifyList) throws NexacroException {
		
		validate(modifyList);

		Oct_SalarybookService.modifyMultiOctSalaryBookVO(modifyList);

		NexacroResult result = new NexacroResult();


		return result;
	}
	
	/**
	 * validate
	 * @param modifyList
	 * @throws NexacroException
	 */
	private void validate(List<Oct_SalaryBookVO> modifyList) throws NexacroException {
		BindingResult bindingResult = null;
		for (Oct_SalaryBookVO Oct_SalaryBookVO : modifyList) {
			bindingResult = new BeanPropertyBindingResult(Oct_SalaryBookVO, "Oct_SalaryBookVO");
			validator.validate(Oct_SalaryBookVO, bindingResult);
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
