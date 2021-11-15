package nexacro.sample.service.dao.ibatis.emp_eval;

import java.util.List;

import java.util.Map;

import nexacro.sample.vo.com.CmmCodeVO;
import nexacro.sample.vo.emp_eval.EmpEvalHeadVO;
import nexacro.sample.vo.emp_eval.EmpEvalVO;
import nexacro.sample.vo.emp_eval.EmpNoVO;

import org.springframework.stereotype.Repository;

import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;

@Repository("empEvalDAO")
public class EmpEvalDAO extends NexacroIbatisAbstractDAO {
	
	//인사평가 모든 목록 불러오기
	public List<EmpEvalVO> selectEmpEvalVOList(EmpEvalVO empEvalVo){
		return (List<EmpEvalVO>)list("empEval.selectEmpEvalVOList", empEvalVo);		
	}
	
	//삽입
	public void insertEmpEval(EmpEvalVO empEvalVo){
		insert("empEval.insertEmpEval", empEvalVo);
	}
	
	
	//아직 미구현
	public void updateEmpEval(EmpEvalVO empEvalVo){
		update("empEval.updateEmpEval", empEvalVo);
	}
	
	public void deleteEmpEval(EmpEvalVO empEvalVo){
		delete("empEval.deleteEmpEval", empEvalVo);
	}
	
	public int selectEmpEvalBookNo(){
		return (Integer)select("empEval.selectEmpEvalBookNo");		
	}
	
	public List<EmpEvalVO> selectEmpEvalAccNameList(EmpEvalVO empEvalName){
		return (List<EmpEvalVO>)list("empEval.selectEmpEvalAccName", empEvalName);
	}
	
	public List<EmpEvalVO> selectEmpEvalModNameList(EmpEvalVO empEvalName){
		return (List<EmpEvalVO>)list("empEval.selectEmpEvalModName", empEvalName);
	}
	
	////////////////////////////////////////////////////////////////
	public List<Map<String,Object>> selectEmpEval_PopupVOList(String tn){
		return (List<Map<String,Object>>)list("empEval_popup.selectEmpEval_PopupVOList", tn);
	}
	
	public List<Map<String,Object>> selectEmpEval_PopupVOList2(String empEvalBookNo){
		return (List<Map<String,Object>>)list("empEval_popup.selectEmpEval_PopupVOList2", empEvalBookNo);
	}
	
	//인서트는 통합?
	public void insertEmpEvalPopUp(EmpNoVO empNoVO){
		insert("empEval_popup.insertEmpEval", empNoVO);
	}
	
	//-----------------------------------
	public void updateEmpNoPopUp(EmpNoVO empNoVO){
		update("empEval_popup.updateEmpNo", empNoVO);
	}
	
	public void updateEmpEvalHeadPopUp(EmpNoVO empNoVO){
		update("empEval_popup.updateEmpEvalHead", empNoVO);
	}
	
	public void updateEmpEvalStdPopUp(EmpNoVO empNoVO){
		update("empEval_popup.updateEmpEvalStd", empNoVO);
	}
	
	public void updateEmpEval(EmpNoVO empNoVO){
		update("empEval_popup.updateEmpEval", empNoVO);
	}
	
	//-------------------------------------------
	public void deleteEmpEvalPopUp(EmpNoVO empNoVO){
		delete("empEval_popup.deleteEmpEval", empNoVO);
	}
	
	public String selectEmpEval_PopupTest(){
		return (String)select("empEval_popup.selectEmpEval_PopupTest");
	}
	
	public void deleteEmpNoPopUp(EmpNoVO empNoVO){
		
		delete("empEval_popup.deleteEmpNo", empNoVO);
	}
	
	public void deleteEmpEvalHeadPopUp(EmpNoVO empNoVO){
		
		delete("empEval_popup.deleteEmpEvalHead", empNoVO);
	}
	
	public void deleteEmpEvalStdPopUp(EmpNoVO empNoVO){
		
		delete("empEval_popup.deleteEmpEvalStd", empNoVO);
	}
	

	
	
	
}
