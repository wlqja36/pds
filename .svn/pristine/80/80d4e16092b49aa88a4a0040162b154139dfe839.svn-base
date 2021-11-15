package nexacro.sample.web.emp_eval;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.sample.service.com.CmmCodeService;
import nexacro.sample.service.emp_eval.EmpEvalService;
import nexacro.sample.vo.DefaultVO;
import nexacro.sample.vo.com.CmmCodeVO;
import nexacro.sample.vo.emp_eval.EmpEvalHeadVO;
import nexacro.sample.vo.emp_eval.EmpEvalStdVO;
import nexacro.sample.vo.emp_eval.EmpEvalVO;
import nexacro.sample.vo.emp_eval.EmpNoVO;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.spring.annotation.ParamDataSet;
import com.nexacro.spring.annotation.ParamVariable;
import com.nexacro.spring.data.NexacroResult;

@Controller
public class EmpEvalController {
	
	@Resource(name="empEvalService")
	EmpEvalService empEvalService;
	
	
	//검색
	@RequestMapping(value = "/empEvalBookSelectVO.do")
	public NexacroResult empEvalBookSelect(
			@ParamDataSet(name = "ds_search") EmpEvalVO empEvalVO){
		
		List<EmpEvalVO> empEvalList = empEvalService.selectEmpEvalVOList(empEvalVO);
		List<EmpEvalVO> empEvalModName = empEvalService.selectEmpEvalModNameList(empEvalVO);
		List<EmpEvalVO> empEvalAccName = empEvalService.selectEmpEvalAccNameList(empEvalVO);
		
		System.out.println("empEvalList 사이즈 : " + empEvalList.size());
		System.out.println("empEvalModName 사이즈 : " + empEvalModName.size());
		System.out.println("empEvalAccName 사이즈 : " + empEvalAccName.size());
		//수정자, 확정자 사번 이름 넣기
		empEvalService.empEvalNameSetting(empEvalList, empEvalModName, "mod");
		empEvalService.empEvalNameSetting(empEvalList, empEvalAccName, "acc");
		
		for(int i = 0; i < empEvalList.size(); i++){
			System.out.println("수정자 이름 : " + empEvalList.get(i).getEMP_MOD_NAME());
			System.out.println("확정자 이름 : " + empEvalList.get(i).getEMP_ACC_NAME());
		}
		
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_output", empEvalList);
		return result;
	}
	

	@RequestMapping(value = "empEvalBookModifyVO.do")
	public NexacroResult empEvalBookModify(
			//@ParamVariable(name = "updateId") String updateId,
			@ParamDataSet(name = "ds_input", required = false) List<EmpEvalVO> empEvalVoList){
		
		String confirmStr = empEvalService.editEmpEval(empEvalVoList);
		
		NexacroResult result = new NexacroResult();
		result.addVariable("confirmStr", confirmStr);

		return result;
		
	}
	
	
	@RequestMapping(value = "selectEmpEvalBookNo.do")
	public NexacroResult selectEmpEvalBookNo(
			//@ParamVariable(name = "updateId") String updateId,
			@ParamDataSet(name = "ds_input", required = false) List<EmpEvalVO> empEvalVoList){
	
		NexacroResult result = new NexacroResult();
		result.addVariable("test", empEvalService.selectEmpEvalBookNo());

		return result;
		
	}
	
	@RequestMapping(value = "selectEmpEval_PopupVO.do")
	public NexacroResult selectEmpEval_PopupVO(
			@ParamDataSet(name = "ds_search", required = false) DefaultVO searchVO){
		System.out.println("서치키워드" + searchVO.getSearchKeyword());
		List<Map<String,Object>> mapEmpEvalHead = empEvalService.selectEmpEval_PopupVOList("EMP_EVAL_HEAD");
		List<Map<String,Object>> mapEmpNo = empEvalService.selectEmpEval_PopupVOList("EMP_NO");
		List<Map<String,Object>> mapFull = empEvalService.selectEmpEval_PopupVOList2(searchVO.getSearchKeyword());
	
	
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_emp_eval_head", mapEmpEvalHead );
		result.addDataSet("ds_emp_no", mapEmpNo);
		result.addDataSet("ds_emp_full",  mapFull);
		

		return result;
		
	}
	
	
	@RequestMapping(value = "empEvalPopUpModifyVO.do")
	public NexacroResult empEvalPopUpModify(
			//@ParamVariable(name = "updateId") String updateId,
			@ParamDataSet(name = "ds_input", required = false) List<EmpEvalHeadVO> ds_eh,
			@ParamDataSet(name = "ds_input", required = false) List<EmpEvalStdVO> ds_es,
			@ParamDataSet(name = "ds_input", required = false) List<EmpNoVO> ds_en,
			@ParamDataSet(name = "ds_input", required = false) List<EmpEvalVO> ds_eb){
	
		for(int i = 0; i < ds_en.size(); i++){
			ds_en.get(i).setEmpEvalHeadVO(ds_eh.get(i));
			ds_en.get(i).setEmpEvalStdVO(ds_es.get(i));
			ds_en.get(i).setEmpEvalVO(ds_eb.get(i));
		}
		
		String confirmStr = empEvalService.editEmpEvalPopUp(ds_en);
		
		NexacroResult result = new NexacroResult();

		return result;
		
	}
	
	
	
	//----------------------------------------------임시----------------------------------
	@RequestMapping(value = "sBookSearch.do")
	public NexacroResult sBookSearch(
			//@ParamVariable(name = "updateId") String updateId,
			@ParamDataSet(name = "ds_input", required = false) List<EmpEvalHeadVO> ds_eh,
			@ParamDataSet(name = "ds_input", required = false) List<EmpEvalStdVO> ds_es,
			@ParamDataSet(name = "ds_input", required = false) List<EmpNoVO> ds_en,
			@ParamDataSet(name = "ds_input", required = false) List<EmpEvalVO> ds_eb){
	
		for(int i = 0; i < ds_en.size(); i++){
			ds_en.get(i).setEmpEvalHeadVO(ds_eh.get(i));
			ds_en.get(i).setEmpEvalStdVO(ds_es.get(i));
			ds_en.get(i).setEmpEvalVO(ds_eb.get(i));
		}
		
		String confirmStr = empEvalService.editEmpEvalPopUp(ds_en);
		
		NexacroResult result = new NexacroResult();

		return result;
		
	}
	
	
}
