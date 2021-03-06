package nexacro.sample.service.Oct_eval;

import java.util.List;
import java.util.Map;

import nexacro.sample.vo.Oct_eval.LJH_EmpEvalVO;
import nexacro.sample.vo.Oct_eval.LJH_EmpNoVO;

public interface LJH_EmpEvalService {
	
		//인사평가대장 화면
		 List<LJH_EmpEvalVO> selectEmpEvalVOList(LJH_EmpEvalVO empEvalVO);
		 String editEmpEval(List<LJH_EmpEvalVO> empEvalVoList);
		 int selectEmpEvalBookNo();
		 
		 //인사평가기준
		 public List<Map<String,Object>> selectEmpEval_PopupVOList(String stn);
		 //public String selectEmpEval_PopupTest();
		 public List<Map<String,Object>> selectEmpEval_PopupVOList2(String empEvalBookNo);
		 String editEmpEvalPopUp(List<LJH_EmpNoVO> empEvalVoPopUpList);
		 
		 //구현할것
		 public List<LJH_EmpEvalVO> empEvalNameSetting(List<LJH_EmpEvalVO> empEvalVOList, List<LJH_EmpEvalVO> empEvalName, String type);
		 public List<LJH_EmpEvalVO> selectEmpEvalAccNameList(LJH_EmpEvalVO empEvalVO);
		 public List<LJH_EmpEvalVO> selectEmpEvalModNameList(LJH_EmpEvalVO empEvalVO);
	

}
