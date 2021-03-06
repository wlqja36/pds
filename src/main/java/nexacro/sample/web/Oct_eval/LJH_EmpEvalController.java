package nexacro.sample.web.Oct_eval;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.sample.service.Oct_eval.LJH_EmpEvalService;
import nexacro.sample.vo.DefaultVO;
import nexacro.sample.vo.Oct_eval.LJH_EmpEvalHeadVO;
import nexacro.sample.vo.Oct_eval.LJH_EmpEvalStdVO;
import nexacro.sample.vo.Oct_eval.LJH_EmpEvalVO;
import nexacro.sample.vo.Oct_eval.LJH_EmpNoVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.spring.annotation.ParamDataSet;
import com.nexacro.spring.data.NexacroResult;



@Controller
public class LJH_EmpEvalController {
	
	//@Autowired(required = false)
	
	@Resource(name="ljhEmpEvalService")
	private LJH_EmpEvalService empEvalService;
	
	// 화면 켜지자마자 혹은 검색했을때 그리드에 보이는 부분
		@RequestMapping(value = "/ljhempEvalBookSelectVO.do")
		public NexacroResult empEvalBookSelect(
				@ParamDataSet(name = "ds_search") LJH_EmpEvalVO empEvalVO){
			
			// 검색되는 것들이 화면에 리스트로 보이도록 변수를 만들어 넣어줌
			List<LJH_EmpEvalVO> empEvalList = empEvalService.selectEmpEvalVOList(empEvalVO);
			List<LJH_EmpEvalVO> empEvalModName = empEvalService.selectEmpEvalModNameList(empEvalVO);
			List<LJH_EmpEvalVO> empEvalAccName = empEvalService.selectEmpEvalAccNameList(empEvalVO);
				
			//System.out.println("empEvalList 사이즈 : " + empEvalList.size());
			//System.out.println("empEvalModName 사이즈 : " + empEvalModName.size());
			//System.out.println("empEvalAccName 사이즈 : " + empEvalAccName.size());
			
			//수정자, 확정자 사번 이름 넣기
			empEvalService.empEvalNameSetting(empEvalList, empEvalModName, "mod");
			empEvalService.empEvalNameSetting(empEvalList, empEvalAccName, "acc");
			
			/*for(int i = 0; i < empEvalList.size(); i++){
				System.out.println("수정자 이름 : " + empEvalList.get(i).getEMP_MOD_NAME());
				System.out.println("확정자 이름 : " + empEvalList.get(i).getEMP_ACC_NAME());
			}
			*/
			NexacroResult result = new NexacroResult();
			result.addDataSet("ds_output", empEvalList);
			return result;
		}
		

		@RequestMapping(value = "ljhempEvalBookModifyVO.do")
		public NexacroResult empEvalBookModify(
				//@ParamVariable(name = "updateId") String updateId,
				@ParamDataSet(name = "ds_input", required = false) List<LJH_EmpEvalVO> empEvalVoList){
			
			String confirmStr = empEvalService.editEmpEval(empEvalVoList);
			
			NexacroResult result = new NexacroResult();
			result.addVariable("confirmStr", confirmStr);

			return result;
			
		}
		
		
		@RequestMapping(value = "ljhselectEmpEvalBookNo.do")
		public NexacroResult selectEmpEvalBookNo(
				//@ParamVariable(name = "updateId") String updateId,
				//@ParamDataSet(name = "ds_input", required = false) List<LJH_EmpEvalVO> empEvalVoList){
				
				@ParamDataSet(name = "ds_input", required = false) List<LJH_EmpEvalVO> empEvalVoList){
			
			
			NexacroResult result = new NexacroResult();
			result.addVariable("test", empEvalService.selectEmpEvalBookNo());

			return result;
			
		}
		
		@RequestMapping(value = "ljhselectEmpEval_PopupVO.do")
		public NexacroResult selectEmpEval_PopupVO(
				@ParamDataSet(name = "ds_search", required = false) DefaultVO searchVO){
			
			//System.out.println("서치키워드 : " + searchVO.getSearchKeyword());
			//List<Map<String,Object>> mapEmpEvalHead = empEvalService.selectEmpEval_PopupVOList("EMP_EVAL_HEAD");
			List<Map<String,Object>> mapEmpNo = empEvalService.selectEmpEval_PopupVOList("EMP_NO");
			List<Map<String,Object>> mapFull = empEvalService.selectEmpEval_PopupVOList2(searchVO.getSearchKeyword());
		
		
			NexacroResult result = new NexacroResult();
			//result.addDataSet("ds_emp_eval_head", mapEmpEvalHead );
			result.addDataSet("ds_emp_no", mapEmpNo);
			result.addDataSet("ds_emp_full",  mapFull);
			

			return result;
			
		}
		
		
		@RequestMapping(value = "ljhempEvalPopUpModifyVO.do")
		public NexacroResult empEvalPopUpModify(
				//@ParamVariable(name = "updateId") String updateId,
				@ParamDataSet(name = "ds_input", required = false) List<LJH_EmpEvalHeadVO> ds_eh,
				@ParamDataSet(name = "ds_input", required = false) List<LJH_EmpEvalStdVO> ds_es,
				@ParamDataSet(name = "ds_input", required = false) List<LJH_EmpNoVO> ds_en,
				@ParamDataSet(name = "ds_input", required = false) List<LJH_EmpEvalVO> ds_eb){
		
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

