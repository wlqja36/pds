package nexacro.sample.web.atticode;

import java.util.List;

import javax.annotation.Resource;

import nexacro.sample.service.atticode.AttiCodeService;
import nexacro.sample.vo.atticode.AttiCodeVO;
import nexacro.sample.vo.atticode.VacCodeVO;
import nexacro.sample.vo.vacation.vacationCodeVO;

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
public class AttiCodeController {
	private static final Logger log = LoggerFactory.getLogger(AttiCodeController.class);
	
	//Service
	@Resource(name="attiCodeService") 
	private AttiCodeService attiCodeService;
	
	@Resource
	private Validator validator;
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder){
		dataBinder.setValidator(this.validator);
	}
	
	
	@RequestMapping(value="/loadAtticode.do")
	public NexacroResult getCodeData(){
		
		System.out.println("====attiCode 컨트롤러 들어옴! : load");
		List<AttiCodeVO> attiCodeList = attiCodeService.loadAttiCodeList();
		
		System.out.println("==size: "+ attiCodeList.size());
		
		//넥사크로 객체생성
		NexacroResult result = new NexacroResult();
		result.addDataSet("attiCodeList", attiCodeList);
		return result;
	}
	
	@RequestMapping(value="/loadVaccode.do")
	public NexacroResult getVacCodeData(){
		
		System.out.println("====loadVac 컨트롤러 들어옴! : loadVac");
		List<VacCodeVO> vacCodeList = attiCodeService.loadVacCodeList();
		
		System.out.println("==size: "+ vacCodeList.size());
		
		//넥사크로 객체생성
		NexacroResult result = new NexacroResult();
		result.addDataSet("output2", vacCodeList);
		System.out.println(vacCodeList.get(0).getVACATION_NM());
		return result;
	}
	
	
	@RequestMapping(value="/modifyAttiCode.do")
	public NexacroResult getCodeData(@ParamDataSet(name="ds_atti_code") List<AttiCodeVO> attiCodeList)throws NexacroException{
		System.out.println("====modifyAttiCode 컨트롤러 들어옴! : modify");
		System.out.println("입력 리스트 사이즈: "+attiCodeList.size());
		
		//넥사크로 객체생성
		NexacroResult result = new NexacroResult();
		
		//수정할 값이 없을시 
		if (attiCodeList.size()==0){
			return result;
		}
		
		System.out.println("입력 리스트 내용확인: "+attiCodeList.get(0).getATTITUDE_NM());
		
		validate(attiCodeList);
		System.out.println("=== modifyAttiCodeList 메소드 실행시작!");
		attiCodeService.modifyAttiCodeList(attiCodeList);
		
//		result.addDataSet("attiCodeList", attiCodeList);
		return result;
	}
	
	
	
	private void validate(List<AttiCodeVO> attiCodeList) throws NexacroException {
		BindingResult bindingResult = null; //BindingResult의 경우 매개변수를 Bean에 바인딩할때, 발생한 오류 정보를 받기위해 선언해야하는 어노테이션 
		
		for (AttiCodeVO attiCodeVO : attiCodeList) {
//			System.out.println("atticode validate 시작중: ");
			bindingResult = new BeanPropertyBindingResult(attiCodeVO, "attiCodeVO"); //에러체크
			validator.validate(attiCodeVO, bindingResult); //void validate(Object target, Errors error)
//			System.out.println("=== validate 확인 완료");
			if (bindingResult.hasErrors()) {
				String errorMessages = getErrorMessages(bindingResult);

				NexacroException nexacroException = new NexacroException(errorMessages);
				nexacroException.setErrorCode(NexacroException.DEFAULT_ERROR_CODE);
				nexacroException.setErrorMsg(errorMessages);

				throw nexacroException;
			}
		}
	}
	
	private String getErrorMessages(BindingResult bindingResult) {
		StringBuffer sb = new StringBuffer();
		
		for (ObjectError error : bindingResult.getAllErrors()) {
			sb.append(error.getDefaultMessage()).append("\n");
		}
		
		return sb.toString();
	}
	
	
}
