package nexacro.sample.web.resolution;

import java.util.List;

import javax.annotation.Resource;

import nexacro.sample.service.ResolutionService;
import nexacro.sample.vo.atticode.AttiCodeVO;
import nexacro.sample.vo.emp.EmpVO;
import nexacro.sample.vo.resolution.ResCodeVO;
import nexacro.sample.vo.resolution.ResolutionVO;
import nexacro.sample.vo.s_bookVO.S_bookVO;
import nexacro.sample.web.atticode.AttiCodeController;

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
import org.springframework.web.bind.annotation.RequestParam;

import com.nexacro.spring.NexacroException;
import com.nexacro.spring.annotation.ParamDataSet;
import com.nexacro.spring.data.NexacroResult;

@Controller
public class ResolutionController {
	private static final Logger log = LoggerFactory.getLogger(ResolutionController.class);
	
	
	@Resource(name="resolutionService")
	private ResolutionService resolutionService;
	
	@Resource
	private Validator validator;
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder){
		dataBinder.setValidator(this.validator);
	}
	
	@RequestMapping(value="/loadEmpInfo.do")
	public NexacroResult getEmpInfo(@ParamDataSet(name="ds_search_info") ResolutionVO empNo){
		
		System.out.println("====loadEmpInfo 컨트롤러 들어옴! : load empinfo");
		List<EmpVO> empInfo = resolutionService.loadEmpInfo(empNo);
		
		System.out.println("==size: "+ empInfo.size());
		
		//넥사크로 객체생성
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_emp_info", empInfo);
		return result;
	}
	
	
	@RequestMapping(value="/loadResList.do")
	public NexacroResult getResData(@ParamDataSet(name="ds_search_info") ResolutionVO empNo){
		
		
		System.out.println("====loadSResList 컨트롤러 들어옴! : load");
		List<ResolutionVO> resList = resolutionService.loadResList(empNo);
		
		System.out.println("==size: "+ resList.size());
		
		//넥사크로 객체생성
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_spending", resList);
		return result;
	}
	
	
	@RequestMapping(value="/selectResList.do")
	public NexacroResult selectResData(@ParamDataSet(name="ds_search_info") ResolutionVO empNo){
		
		System.out.println("====selectResList 컨트롤러 들어옴! : select");
		List<ResolutionVO> resList = resolutionService.selectResList(empNo);
		
		System.out.println("==size: "+ resList.size());
		
		//넥사크로 객체생성
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_spending", resList);
		return result;
	}
	
	@RequestMapping(value="loadSbookList.do")
	public NexacroResult selectS_BookData(@ParamDataSet(name="ds_search_info") ResolutionVO searchInfo){
		
		System.out.println("====selectS_BookData 컨트롤러 들어옴! : select");
		List<S_bookVO> ds_S_BookCode = resolutionService.selectds_S_BookCode(searchInfo);
		
		System.out.println("==size: "+ ds_S_BookCode.size());
		
		//넥사크로 객체생성
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_S_BookCode", ds_S_BookCode);
		return result;
	}

	@RequestMapping(value="loadWholeEmpList.do")
	public NexacroResult selectEmpList(){
		System.out.println("====selectEmpList 컨트롤러 들어옴! : select");
		List<EmpVO> ds_EmpList = resolutionService.selectEmpList();
		
		System.out.println("==size: "+ ds_EmpList.size());
		
		//넥사크로 객체생성
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_EmpList", ds_EmpList);
		return result;
	}

	@RequestMapping(value="loadResCode.do")
	public NexacroResult loadResCode(){
		System.out.println("====loadResCode 컨트롤러 들어옴! : select");
		List<ResCodeVO> ds_rescode = resolutionService.loadResCode();
		
		System.out.println("==size: "+ ds_rescode.size());
		
		//넥사크로 객체생성
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_rescode", ds_rescode);
		return result;
	}

	
	@RequestMapping(value="/modifyResList.do")
	public NexacroResult modifyResList(@ParamDataSet(name="ds_spending") List<ResolutionVO> resList) throws NexacroException{
		
		System.out.println("====modifyResList 컨트롤러 들어옴! : modify");
		
		validate(resList);
		System.out.println("===modify서비스 함수 호출!");
		resolutionService.modifyResList(resList);
		
		//넥사크로 객체생성
		NexacroResult result = new NexacroResult();
		return result;
	}
	
	private void validate(List<ResolutionVO> resList) throws NexacroException {
		BindingResult bindingResult = null; //BindingResult의 경우 매개변수를 Bean에 바인딩할때, 발생한 오류 정보를 받기위해 선언해야하는 어노테이션 
		
		for (ResolutionVO resolutionVO : resList) {
//			System.out.println("resList validate 시작중: ");
			bindingResult = new BeanPropertyBindingResult(resolutionVO, "resolutionVO"); //에러체크
			validator.validate(resolutionVO, bindingResult); //void validate(Object target, Errors error)
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
