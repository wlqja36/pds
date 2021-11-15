package nexacro.sample.service.impl.emp_eval;

import java.util.HashMap;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.sample.service.UserService;
import nexacro.sample.service.dao.ibatis.UserDAO;
import nexacro.sample.service.dao.ibatis.edu.EduDAO;
import nexacro.sample.service.dao.ibatis.emp_eval.EmpEvalDAO;
import nexacro.sample.service.edu.EduService;
import nexacro.sample.service.emp_eval.EmpEvalService;
import nexacro.sample.vo.UserVO;
import nexacro.sample.vo.com.CmmCodeVO;
import nexacro.sample.vo.edu.EduVO;
import nexacro.sample.vo.emp_eval.EmpEvalHeadVO;
import nexacro.sample.vo.emp_eval.EmpEvalVO;
import nexacro.sample.vo.emp_eval.EmpNoVO;

import org.springframework.stereotype.Service;

import com.nexacro.spring.data.DataSetRowTypeAccessor;
import com.nexacro.xapi.data.DataSet;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("empEvalService")
public class EmpEvalServiceImpl extends EgovAbstractServiceImpl implements
		EmpEvalService {

	@Resource(name = "empEvalDAO")
	private EmpEvalDAO empEvalDAO;

	@Override
	public List<EmpEvalVO> selectEmpEvalVOList(EmpEvalVO empEvalVO) {
		return empEvalDAO.selectEmpEvalVOList(empEvalVO);
	}

	@Override
	public String editEmpEval(List<EmpEvalVO> empEvalVoList) {

		String confirm = null;

		for (int i = 0; i < empEvalVoList.size(); i++) {

			EmpEvalVO empEval = empEvalVoList.get(i);
			EmpNoVO empNoVO = new EmpNoVO();

			empNoVO.setEMP_EVAL_BOOK_NO(empEval.getEMP_EVAL_BOOK_NO());

			DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) empEval;

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

	@Override
	public int selectEmpEvalBookNo() {
		return empEvalDAO.selectEmpEvalBookNo();
	}

	// ///////////////////////////////////////////////////////
	@Override
	public List<Map<String, Object>> selectEmpEval_PopupVOList(String tn) {
		return empEvalDAO.selectEmpEval_PopupVOList(tn);
	}

	@Override
	public String selectEmpEval_PopupTest() {
		return empEvalDAO.selectEmpEval_PopupTest();
	}

	@Override
	public List<Map<String, Object>> selectEmpEval_PopupVOList2(
			String empEvalBookNo) {
		return empEvalDAO.selectEmpEval_PopupVOList2(empEvalBookNo);
	}

	@Override
	public String editEmpEvalPopUp(List<EmpNoVO> empEvalVoPopUpList) {

		String confirm = null;

		for (int i = 0; i < empEvalVoPopUpList.size(); i++) {

			EmpNoVO empNoVO = empEvalVoPopUpList.get(i);
			DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) empNoVO;

			if (accessor.getRowType() == DataSet.ROW_TYPE_INSERTED) {
				empEvalDAO.insertEmpEvalPopUp(empNoVO);
				empEvalDAO.updateEmpEval(empNoVO);
			} else if (accessor.getRowType() == DataSet.ROW_TYPE_UPDATED) {
				empEvalDAO.updateEmpNoPopUp(empNoVO);
				empEvalDAO.updateEmpEvalHeadPopUp(empNoVO);
				empEvalDAO.updateEmpEvalStdPopUp(empNoVO);
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
	public List<EmpEvalVO> empEvalNameSetting(List<EmpEvalVO> empEvalVOList, List<EmpEvalVO> empEvalVO, String type) {
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
	public List<EmpEvalVO> selectEmpEvalAccNameList(EmpEvalVO empEvalVO) {

		return empEvalDAO.selectEmpEvalAccNameList(empEvalVO);
	}

	@Override
	public List<EmpEvalVO> selectEmpEvalModNameList(EmpEvalVO empEvalVO) {

		return empEvalDAO.selectEmpEvalModNameList(empEvalVO);
	}

}
