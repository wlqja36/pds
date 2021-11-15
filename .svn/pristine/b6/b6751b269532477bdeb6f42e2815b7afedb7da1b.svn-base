package nexacro.sample.web.administrator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.sample.service.administrator.AdmService;
import nexacro.sample.vo.administrator.AdmVO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.spring.annotation.ParamDataSet;
import com.nexacro.spring.annotation.ParamVariable;
import com.nexacro.spring.data.NexacroResult;

@Controller
public class AdmController {
	
	private static final Logger logger = LoggerFactory.getLogger(AdmController.class);
	
	@Resource(name = "admService")
	private AdmService admService;
	
	// 로그인 체크
	@RequestMapping(value = "administrator/login.do")
	public NexacroResult logincheck(
				@ParamVariable(name = "emp_id") String emp_id,
				@ParamVariable(name = "emp_pw") String emp_pw) {
		
		Map<String, String> loginMap = new HashMap<String, String>();
		loginMap.put("emp_id", emp_id);
		loginMap.put("emp_pw", emp_pw);
		
		AdmVO admVO = admService.selectLogin(loginMap);
		String emp_no = admVO.getEmp_no();
		admService.updateLogin(emp_no);
		
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_output", admVO);
		logger.info("logincheck 잘 작동하는지 확인");
		
		return result;
	}
	
	// 존재하는 아이디인지 검색
	@RequestMapping(value = "administrator/selectId.do")
	public NexacroResult selectId(
			@ParamVariable(name = "emp_id") String emp_id){
		
		AdmVO admVO = admService.selectId(emp_id);
		
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_output", admVO);
		
		return result;
	}
	
	@RequestMapping(value = "administrator/insertAdm.do")
	public NexacroResult insertAdm(
			@ParamDataSet(name = "ds_input", required = false) AdmVO admVO){
		
		admService.insertAdm(admVO);
		
		NexacroResult result = new NexacroResult();
		
		return result;
	}
	
    @RequestMapping(value = "administrator/selectEmp.do")
	public NexacroResult selectEmp(@ParamDataSet(name = "ds_search", required = false) AdmVO searchVo) {
        
        List<AdmVO> empList = admService.selectEmpList(searchVo);
        
        NexacroResult result = new NexacroResult();
        result.addDataSet("ds_output", empList);
        
        return result;
    }
	@RequestMapping(value = "administrator/selectInfo.do")
	public NexacroResult selectEmpInfo(
			@ParamVariable(name = "emp_no") String emp_no){
		
		AdmVO admVO = admService.selectEmp(emp_no);
		
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_output", admVO);
		
		return result;
	}
	
	@RequestMapping(value = "administrator/updateAdm.do")
	public NexacroResult updateAdm(
			@ParamDataSet(name = "ds_input", required = false) AdmVO admVO){
		
		admService.updateAdm(admVO);
		
		NexacroResult result = new NexacroResult();
		
		return result;
	}
	
	@RequestMapping(value = "administrator/searchId.do")
	public NexacroResult searchEmpId(
			@ParamDataSet(name = "ds_search", required = false) AdmVO searchVO){
		
		AdmVO emp_id = admService.searchEmpId(searchVO);
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_output", emp_id);
		
		return result;
	}
	
	@RequestMapping(value = "administrator/searchPw.do")
	public NexacroResult searchEmpPw(
			@ParamDataSet(name = "ds_search", required = false) AdmVO searchVO){
		
		AdmVO emp_pw = admService.searchEmpPw(searchVO);
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_output", emp_pw);
		
		return result;
	}
	
	@RequestMapping(value = "administrator/updatePw.do")
	public NexacroResult updatePw(
			@ParamDataSet(name = "ds_input", required = false) AdmVO admVO){
		
		admService.updatePw(admVO);
		
		NexacroResult result = new NexacroResult();
		
		return result;
	}
	
}
