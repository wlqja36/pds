package nexacro.sample.service.emp_eval;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import nexacro.sample.service.dao.ibatis.UserDAO;
import nexacro.sample.service.dao.ibatis.edu.EduDAO;
import nexacro.sample.vo.UserVO;
import nexacro.sample.vo.com.ComCodeVO;
import nexacro.sample.vo.com.DetailCodeVO;
import nexacro.sample.vo.edu.EduVO;
import nexacro.sample.vo.emp_eval.EmpEvalHeadVO;
import nexacro.sample.vo.emp_eval.EmpEvalVO;
import nexacro.sample.vo.emp_eval.EmpNoVO;


public interface EmpEvalService {
	
	 //인사평가대장 화면
	 List<EmpEvalVO> selectEmpEvalVOList(EmpEvalVO empEvalVO);
	 String editEmpEval(List<EmpEvalVO> empEvalVoList);
	 int selectEmpEvalBookNo();
	 
	 //인사평가기준
	 public List<Map<String,Object>>  selectEmpEval_PopupVOList(String tn);
	 public String selectEmpEval_PopupTest();
	 public List<Map<String,Object>> selectEmpEval_PopupVOList2(String empEvalBookNo);
	 String editEmpEvalPopUp(List<EmpNoVO> empEvalVoPopUpList);
	 
	 //구현할것
	 public List<EmpEvalVO>empEvalNameSetting(List<EmpEvalVO> empEvalVOList, List<EmpEvalVO> empEvalName, String type);
	 public List<EmpEvalVO> selectEmpEvalAccNameList(EmpEvalVO empEvalVO);
	 public List<EmpEvalVO> selectEmpEvalModNameList(EmpEvalVO empEvalVO);
	 
}
