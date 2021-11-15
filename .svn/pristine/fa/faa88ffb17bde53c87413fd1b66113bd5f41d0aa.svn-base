package nexacro.sample.dao.Oct_eval;

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
import nexacro.sample.vo.Oct_eval.LJH_EmpEvalVO;
import nexacro.sample.vo.Oct_eval.LJH_EmpNoVO;




public interface LJH_EmpEvalDAO{
	
	public List<LJH_EmpEvalVO> selectEmpEvalVOList(LJH_EmpEvalVO empEvalVo);
	public int insertEmpEval(LJH_EmpEvalVO empEvalVo);
	
	public int updateEmpEval(LJH_EmpEvalVO empEvalVo);
	public int deleteEmpEval(LJH_EmpEvalVO empEvalVo);
	public int selectEmpEvalBookNo();
	public List<LJH_EmpEvalVO> selectEmpEvalAccNameList(LJH_EmpEvalVO empEvalName);
	public List<LJH_EmpEvalVO> selectEmpEvalModNameList(LJH_EmpEvalVO empEvalName);
	
	public List<Map<String,Object>> selectEmpEval_PopupVOList(String stn);
	public List<Map<String,Object>> selectEmpEval_PopupVOList2(String empEvalBookNo);
	
	public int insertEmpEvalPopUp(LJH_EmpNoVO empNoVO);
	public int updateEmpNoPopUp(LJH_EmpNoVO empNoVO);
	public int updateEmpEvalHeadPopUp(LJH_EmpNoVO empNoVO);
	public int updateEmpEvalStdPopUp(LJH_EmpNoVO empNoVO);
	public int updateEmpEval(LJH_EmpNoVO empNoVO);
	
	public int deleteEmpEvalPopUp(LJH_EmpNoVO empNoVO);
	//public String selectEmpEval_PopupTest();
	public int deleteEmpNoPopUp(LJH_EmpNoVO empNoVO);
	public int deleteEmpEvalHeadPopUp(LJH_EmpNoVO empNoVO);
	public int deleteEmpEvalStdPopUp(LJH_EmpNoVO empNoVO);


	

}
