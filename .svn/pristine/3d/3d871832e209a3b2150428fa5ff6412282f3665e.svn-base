package nexacro.sample.service.impl.Oct_eval;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.sample.dao.Oct_eval.LJH_EmpEvalDAO;
import nexacro.sample.service.Oct_eval.LJH_EmpEvalService;
import nexacro.sample.vo.Oct_eval.LJH_EmpEvalVO;
import nexacro.sample.vo.Oct_eval.LJH_EmpNoVO;

import org.springframework.stereotype.Service;

import com.nexacro.spring.data.DataSetRowTypeAccessor;
import com.nexacro.xapi.data.DataSet;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("ljhEmpEvalService")
public class LJH_EmpEvalServiceImpl extends EgovAbstractServiceImpl implements LJH_EmpEvalService{
	
	@Resource(name = "ljhEmpEvalDAO")
	private LJH_EmpEvalDAO empEvalDAO;
	
	
	// 화면이 로딩되면 보이는 목록을 리스트로 보이게 하는 곳
	@Override
	public List<LJH_EmpEvalVO> selectEmpEvalVOList(LJH_EmpEvalVO empEvalVO) {
		return empEvalDAO.selectEmpEvalVOList(empEvalVO);
	}
	
	// 화면에서 삽입 추가 삭제 저장이 되는 곳
	@Override
	public String editEmpEval(List<LJH_EmpEvalVO> empEvalVoList) {

		String confirm = null;

		for (int i = 0; i < empEvalVoList.size(); i++) {

			LJH_EmpEvalVO empEval = empEvalVoList.get(i);
			
			LJH_EmpNoVO empNoVO = new LJH_EmpNoVO();

			empNoVO.setEMP_EVAL_BOOK_NO(empEval.getEMP_EVAL_BOOK_NO());

			//데이터셋 로우 타입을 변수로 만들어서
			DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) empEval;

			// get한 로우 타입이 데이터셋의 인서트와 맞으면 DAO에서 인서트 메소드 부분을 통해 인서트가 진행
			if (accessor.getRowType() == DataSet.ROW_TYPE_INSERTED) {
				empEvalDAO.insertEmpEval(empEval);
				confirm = "insert";
			} else if (accessor.getRowType() == DataSet.ROW_TYPE_UPDATED) {
				empEvalDAO.updateEmpEval(empEval);
				confirm = "update";
			} else if (accessor.getRowType() == DataSet.ROW_TYPE_DELETED) {
				empEvalDAO.deleteEmpEvalHeadPopUp(empNoVO);
				empEvalDAO.deleteEmpEvalStdPopUp(empNoVO);
				empEvalDAO.deleteEmpNoPopUp(empNoVO);
				empEvalDAO.deleteEmpEval(empEval);
				confirm = "delete";
			}

		}

		return confirm;
	}
	
	//그리드에서 인사평가대장번호가 시퀀스로 처리되는 곳
	@Override
	public int selectEmpEvalBookNo() {
		return empEvalDAO.selectEmpEvalBookNo();
	}

	/*팝업 부분*/
	//팝업을 처음 열었을때 인사평가대장, 사원번호 가 보이는 것
	@Override
	public List<Map<String, Object>> selectEmpEval_PopupVOList(String stn) {
		return empEvalDAO.selectEmpEval_PopupVOList(stn);
	}

	/*@Override
	public String selectEmpEval_PopupTest() {
		return empEvalDAO.selectEmpEval_PopupTest();
	}*/
	
	//팝업을 두번이상 열었을경우 첫번째에 작성했던 사용여부, 코드, 점수, 합계가 보여짐
	@Override
	public List<Map<String, Object>> selectEmpEval_PopupVOList2(
			String empEvalBookNo) {
		return empEvalDAO.selectEmpEval_PopupVOList2(empEvalBookNo);
	}
	
	// 팝업에서 삽입 수정 삭제가 진행됨
	@Override
	public String editEmpEvalPopUp(List<LJH_EmpNoVO> empEvalVoPopUpList) {

		String confirm = null;

		for (int i = 0; i < empEvalVoPopUpList.size(); i++) {

			LJH_EmpNoVO empNoVO = empEvalVoPopUpList.get(i);
			
			DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) empNoVO;

			if (accessor.getRowType() == DataSet.ROW_TYPE_INSERTED) {
				empEvalDAO.insertEmpEvalPopUp(empNoVO);
				empEvalDAO.updateEmpEval(empNoVO);
			} else if (accessor.getRowType() == DataSet.ROW_TYPE_UPDATED) {
				empEvalDAO.updateEmpNoPopUp(empNoVO);
				//empEvalDAO.updateEmpEvalHeadPopUp(empNoVO);
				//empEvalDAO.updateEmpEvalStdPopUp(empNoVO);
				empEvalDAO.updateEmpEval(empNoVO);
			} else if (accessor.getRowType() == DataSet.ROW_TYPE_DELETED) {
				empEvalDAO.deleteEmpEvalHeadPopUp(empNoVO);
				empEvalDAO.deleteEmpEvalStdPopUp(empNoVO);
				empEvalDAO.deleteEmpNoPopUp(empNoVO);

			}

		}
		return confirm;
	}

	@Override
	public List<LJH_EmpEvalVO> empEvalNameSetting(List<LJH_EmpEvalVO> empEvalVOList, List<LJH_EmpEvalVO> empEvalVO, String type) {
		if (type.equals("mod")) {
			for (int i = 0; i < empEvalVOList.size(); i++) {
				empEvalVOList.get(i).setEMP_MOD_NAME(empEvalVO.get(i).getEMP_NAME());
			}
		}else if (type.equals("acc")){
			for (int i = 0; i < empEvalVOList.size(); i++) {
				empEvalVOList.get(i).setEMP_ACC_NAME(empEvalVO.get(i).getEMP_NAME());
			}
		}
		
		return empEvalVOList;
	}

	@Override
	public List<LJH_EmpEvalVO> selectEmpEvalAccNameList(LJH_EmpEvalVO empEvalVO) {
		return empEvalDAO.selectEmpEvalAccNameList(empEvalVO);
	}

	@Override
	public List<LJH_EmpEvalVO> selectEmpEvalModNameList(LJH_EmpEvalVO empEvalVO) {
		return empEvalDAO.selectEmpEvalModNameList(empEvalVO);
	}

	/*@Override
	public String selectEmpEval_PopupTest() {
		// TODO Auto-generated method stub
		return null;
	}*/

	




}
