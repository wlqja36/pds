package nexacro.sample.dao.impl.Oct_eval;

import java.util.List;
import java.util.Map;

import nexacro.sample.dao.Oct_eval.LJH_EmpEvalDAO;
import nexacro.sample.vo.Oct_eval.LJH_EmpEvalVO;
import nexacro.sample.vo.Oct_eval.LJH_EmpNoVO;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("ljhEmpEvalDAO")
public class LJH_EmpEvalDAOImpl implements LJH_EmpEvalDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
		//인사평가 모든 목록 불러오기
		@Override
		public List<LJH_EmpEvalVO> selectEmpEvalVOList(LJH_EmpEvalVO empEvalVO){
			List<LJH_EmpEvalVO> list = sqlSessionTemplate.selectList("EmpEval.LJH_selectEmpEvalVOList", empEvalVO);
			return (List<LJH_EmpEvalVO>)list;	
		}
		
		//삽입
		@Override
		public int insertEmpEval(LJH_EmpEvalVO empEvalVo){
			return sqlSessionTemplate.insert("EmpEval.LJH_insertEmpEval", empEvalVo);
		}
		
		
		@Override
		public int updateEmpEval(LJH_EmpEvalVO empEvalVo){
			return sqlSessionTemplate.update("EmpEval.LJH_updateEmpEval", empEvalVo);
		}
		
		@Override
		public int deleteEmpEval(LJH_EmpEvalVO empEvalVo){
			return sqlSessionTemplate.delete("EmpEval.LJH_deleteEmpEval", empEvalVo);
		}
		
		// 그리드에서 인사평가번호가 시퀀스 처리되는 곳
		@Override
		public int selectEmpEvalBookNo(){
			return (Integer)(sqlSessionTemplate.selectOne("EmpEval.LJH_selectEmpEvalBookNo"));
			//(Integer) 로  int로 형변환을 해주어야 그리드 번호에 시퀀스 적용된 번호가 보임 		
		}
		
		
	@Override
		public List<LJH_EmpEvalVO> selectEmpEvalAccNameList(LJH_EmpEvalVO empEvalName){
			List<LJH_EmpEvalVO> list = sqlSessionTemplate.selectList("EmpEval.LJH_selectEmpEvalAccName", empEvalName);
			return (List<LJH_EmpEvalVO>) list;
			
			//return (List<LJH_EmpEvalVO>)list("empEval.LJH_selectEmpEvalAccName", empEvalName);
		}
		@Override
		public List<LJH_EmpEvalVO> selectEmpEvalModNameList(LJH_EmpEvalVO empEvalName){
			List<LJH_EmpEvalVO> list = sqlSessionTemplate.selectList("EmpEval.LJH_selectEmpEvalModName", empEvalName);
			return (List<LJH_EmpEvalVO>) list;
			//return (List<LJH_EmpEvalVO>)list("empEval.LJH_selectEmpEvalModName", empEvalName);
		}
		
		
		/*팝업부분*/
		// 팝업이 열렸을때 각 항목에 내용이 보이게 함
		@Override
		public List<Map<String,Object>> selectEmpEval_PopupVOList(String stn){
			List<Map<String, Object>> list = sqlSessionTemplate.selectList("EmpEval_Popup.LJH_selectEmpEval_PopupVOList", stn);
			return (List<Map<String,Object>>)list;
		}
		
		//이미 한번 저장 후 다시 수정하기 위해 눌렀을때 앞에 적었던 점수가 그대로 보이도록 하는 것
		@Override
		public List<Map<String,Object>> selectEmpEval_PopupVOList2(String empEvalBookNo){
			List<Map<String,Object>> list = sqlSessionTemplate.selectList("EmpEval_Popup.LJH_selectEmpEval_PopupVOList2", empEvalBookNo);
			return (List<Map<String,Object>>)list;
		}
		
		// 팝업에 값을 인서트
		@Override
		public int insertEmpEvalPopUp(LJH_EmpNoVO empNoVO){
			return sqlSessionTemplate.insert("EmpEval_Popup.LJH_insertEmpEval", empNoVO);
		}
		
		// 팝업에 값을 바꾸고 수정
		@Override
		public int updateEmpNoPopUp(LJH_EmpNoVO empNoVO){
			return sqlSessionTemplate.update("EmpEval_Popup.LJH_updateEmpNo", empNoVO);
		}
		@Override
		public int updateEmpEvalHeadPopUp(LJH_EmpNoVO empNoVO){
			return sqlSessionTemplate.update("EmpEval_Popup.LJH_updateEmpEvalHead", empNoVO);
		}
		@Override
		public int updateEmpEvalStdPopUp(LJH_EmpNoVO empNoVO){
			return sqlSessionTemplate.update("EmpEval_Popup.LJH_updateEmpEvalStd", empNoVO);
		}
		@Override
		public int updateEmpEval(LJH_EmpNoVO empNoVO){
			return sqlSessionTemplate.update("EmpEval_Popup.LJH_updateEmpEval", empNoVO);
		}
		
		// 팝업에서 삭제를 누를 경우 작성되어 있는 내용들이 초기화처럼 없어짐 (해당하는 인사평가대장이 없어지는 것 아님)
		@Override
		public int deleteEmpEvalPopUp(LJH_EmpNoVO empNoVO){
			return sqlSessionTemplate.delete("EmpEval_Popup.LJH_deleteEmpEval", empNoVO);
			//delete("empEval_popup.LJH_deleteEmpEval", empNoVO);
		}
		/*@Override
		public String selectEmpEval_PopupTest(){
			return sqlSessionTemplate.selectOne("EmpEval_Popup.LJH_selectEmpEval_PopupTest");
			
			//return (String)select("empEval_popup.LJH_selectEmpEval_PopupTest");
		}*/

		@Override
		public int deleteEmpNoPopUp(LJH_EmpNoVO empNoVO){
			return sqlSessionTemplate.delete("EmpEval_Popup.LJH_deleteEmpNo", empNoVO);
		}
		@Override
		public int deleteEmpEvalHeadPopUp(LJH_EmpNoVO empNoVO){
			return sqlSessionTemplate.delete("EmpEval_Popup.LJH_deleteEmpEvalHead", empNoVO);
		}
		@Override
		public int deleteEmpEvalStdPopUp(LJH_EmpNoVO empNoVO){
			return sqlSessionTemplate.delete("EmpEval_Popup.LJH_deleteEmpEvalStd", empNoVO);
		}
	
	

}
