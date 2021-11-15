package nexacro.sample.vo.emp_eval;

import nexacro.sample.vo.DefaultVO;

public class EmpNoVO extends DefaultVO{
	
	String EMP_NO;
	String EMP_EVAL_BOOK_NO;
	String EMP_EVAL_YN;
	int EVAL_STD_SCORE_SUM;
	int EVAL_HEAD_SCORE_SUM;

	//----------------------------------------------------------
	EmpEvalHeadVO empEvalHeadVO;
	EmpEvalStdVO empEvalStdVO;
	EmpEvalVO empEvalVO;
	
	public String getEMP_NO() {
		return EMP_NO;
	}
	public void setEMP_NO(String eMP_NO) {
		EMP_NO = eMP_NO;
	}
	public String getEMP_EVAL_BOOK_NO() {
		return EMP_EVAL_BOOK_NO;
	}
	public void setEMP_EVAL_BOOK_NO(String eMP_EVAL_BOOK_NO) {
		EMP_EVAL_BOOK_NO = eMP_EVAL_BOOK_NO;
	}
	public String getEMP_EVAL_YN() {
		return EMP_EVAL_YN;
	}
	public void setEMP_EVAL_YN(String eMP_EVAL_YN) {
		EMP_EVAL_YN = eMP_EVAL_YN;
	}
	public int getEVAL_STD_SCORE_SUM() {
		return EVAL_STD_SCORE_SUM;
	}
	public void setEVAL_STD_SCORE_SUM(int eVAL_STD_SCORE_SUM) {
		EVAL_STD_SCORE_SUM = eVAL_STD_SCORE_SUM;
	}
	public int getEVAL_HEAD_SCORE_SUM() {
		return EVAL_HEAD_SCORE_SUM;
	}
	public void setEVAL_HEAD_SCORE_SUM(int eVAL_HEAD_SCORE_SUM) {
		EVAL_HEAD_SCORE_SUM = eVAL_HEAD_SCORE_SUM;
	}
	public EmpEvalHeadVO getEmpEvalHeadVO() {
		return empEvalHeadVO;
	}
	public void setEmpEvalHeadVO(EmpEvalHeadVO empEvalHeadVO) {
		this.empEvalHeadVO = empEvalHeadVO;
	}
	public EmpEvalStdVO getEmpEvalStdVO() {
		return empEvalStdVO;
	}
	public void setEmpEvalStdVO(EmpEvalStdVO empEvalStdVO) {
		this.empEvalStdVO = empEvalStdVO;
	}
	public EmpEvalVO getEmpEvalVO() {
		return empEvalVO;
	}
	public void setEmpEvalVO(EmpEvalVO empEvalVO) {
		this.empEvalVO = empEvalVO;
	}


	
	
	
	
	
	
}
