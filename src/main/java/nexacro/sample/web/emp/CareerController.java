package nexacro.sample.web.emp;

import java.util.List;

import javax.annotation.Resource;

import nexacro.sample.service.emp.CareerService;
import nexacro.sample.vo.emp.CareerVO;



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
import com.nexacro.spring.data.DataSetRowTypeAccessor;
import com.nexacro.spring.data.NexacroResult;
import com.nexacro.xapi.data.DataSet;

@Controller
public class CareerController {
	private static final Logger log = LoggerFactory.getLogger(CareerController.class);

	@Resource(name = "careerService")
	private CareerService careerService;
	
	@Resource
	private Validator	validator;

	@RequestMapping(value = "/careerSelectVO.do")
	public NexacroResult selectVo(@ParamDataSet(name = "ds_search", required = false) CareerVO careerVO) {
        
		List<CareerVO> careerList = careerService.SelectCareerVOList(careerVO);
        NexacroResult result = new NexacroResult();
        result.addDataSet("output2", careerList);
        
        
        
        return result;
    }
	@RequestMapping(value = "/careerModifyVO.do")
	public NexacroResult modifyVO(@ParamDataSet(name = "input2") List<CareerVO> modifyList) throws NexacroException {
		
		validate(modifyList);

		careerService.modifyMultiCareerVO(modifyList);

		NexacroResult result = new NexacroResult();

		return result;
	}
    
    /**
	 * validate
	 * @param modifyList
	 * @throws NexacroException
	 */
    private void validate(List<CareerVO> modifyList) throws NexacroException {
		BindingResult bindingResult = null;
		for (CareerVO CareerVO : modifyList) {
			bindingResult = new BeanPropertyBindingResult(CareerVO, "CareerVO");
			validator.validate(CareerVO, bindingResult);
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
