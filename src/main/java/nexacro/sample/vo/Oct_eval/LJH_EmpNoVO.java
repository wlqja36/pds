package nexacro.sample.vo.Oct_eval;

import nexacro.sample.vo.DefaultVO;

public class LJH_EmpNoVO extends DefaultVO{
	
	private String EMP_NO;               //직원번호
	private String EMP_EVAL_BOOK_NO;	 //인사평가대장 번호
	private String EMP_EVAL_YN;			 //사용 여부
	private int EVAL_STD_SCORE_SUM;      //부서장평가점수 합계
	private int EVAL_HEAD_SCORE_SUM;     //인사평가점수 합계
	
	private String EMP_EVAL_REG_USER_NO;  //등록자사번
	private String EMP_EVAL_MOD_USER_NO;  //수정자사번
	private String EMP_EVAL_ACC_USER_NO;  //확정자사번
	private String EMP_EVAL_ACC_YN;       //확정여부
	private int EMP_EVAL_SUM; 
	
	private String EMP_NAME;
	private String EMP_ACC_NAME;
	private String EMP_MOD_NAME;
	
	private String EVAL_STD_CODE;          
	private int EVAL_STD_SCORE;  
	private String EVAL_HEAD_CODE;       
	private int EVAL_HEAD_SCORE;  
	
	LJH_EmpEvalHeadVO empEvalHeadVO;
	LJH_EmpEvalStdVO empEvalStdVO;
	LJH_EmpEvalVO empEvalVO;
	
	public LJH_EmpNoVO() {}

	public LJH_EmpNoVO(String eMP_NO, String eMP_EVAL_BOOK_NO,
			String eMP_EVAL_YN, int eVAL_STD_SCORE_SUM,
			int eVAL_HEAD_SCORE_SUM, String eMP_EVAL_REG_USER_NO,
			String eMP_EVAL_MOD_USER_NO, String eMP_EVAL_ACC_USER_NO,
			String eMP_EVAL_ACC_YN, int eMP_EVAL_SUM, String eMP_NAME,
			String eMP_ACC_NAME, String eMP_MOD_NAME, String eVAL_STD_CODE,
			int eVAL_STD_SCORE, String eVAL_HEAD_CODE, int eVAL_HEAD_SCORE,
			LJH_EmpEvalHeadVO empEvalHeadVO, LJH_EmpEvalStdVO empEvalStdVO,
			LJH_EmpEvalVO empEvalVO) {
		super();
		EMP_NO = eMP_NO;
		EMP_EVAL_BOOK_NO = eMP_EVAL_BOOK_NO;
		EMP_EVAL_YN = eMP_EVAL_YN;
		EVAL_STD_SCORE_SUM = eVAL_STD_SCORE_SUM;
		EVAL_HEAD_SCORE_SUM = eVAL_HEAD_SCORE_SUM;
		EMP_EVAL_REG_USER_NO = eMP_EVAL_REG_USER_NO;
		EMP_EVAL_MOD_USER_NO = eMP_EVAL_MOD_USER_NO;
		EMP_EVAL_ACC_USER_NO = eMP_EVAL_ACC_USER_NO;
		EMP_EVAL_ACC_YN = eMP_EVAL_ACC_YN;
		EMP_EVAL_SUM = eMP_EVAL_SUM;
		EMP_NAME = eMP_NAME;
		EMP_ACC_NAME = eMP_ACC_NAME;
		EMP_MOD_NAME = eMP_MOD_NAME;
		EVAL_STD_CODE = eVAL_STD_CODE;
		EVAL_STD_SCORE = eVAL_STD_SCORE;
		EVAL_HEAD_CODE = eVAL_HEAD_CODE;
		EVAL_HEAD_SCORE = eVAL_HEAD_SCORE;
		this.empEvalHeadVO = empEvalHeadVO;
		this.empEvalStdVO = empEvalStdVO;
		this.empEvalVO = empEvalVO;
	}

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

	public String getEMP_EVAL_REG_USER_NO() {
		return EMP_EVAL_REG_USER_NO;
	}

	public void setEMP_EVAL_REG_USER_NO(String eMP_EVAL_REG_USER_NO) {
		EMP_EVAL_REG_USER_NO = eMP_EVAL_REG_USER_NO;
	}

	public String getEMP_EVAL_MOD_USER_NO() {
		return EMP_EVAL_MOD_USER_NO;
	}

	public void setEMP_EVAL_MOD_USER_NO(String eMP_EVAL_MOD_USER_NO) {
		EMP_EVAL_MOD_USER_NO = eMP_EVAL_MOD_USER_NO;
	}

	public String getEMP_EVAL_ACC_USER_NO() {
		return EMP_EVAL_ACC_USER_NO;
	}

	public void setEMP_EVAL_ACC_USER_NO(String eMP_EVAL_ACC_USER_NO) {
		EMP_EVAL_ACC_USER_NO = eMP_EVAL_ACC_USER_NO;
	}

	public String getEMP_EVAL_ACC_YN() {
		return EMP_EVAL_ACC_YN;
	}

	public void setEMP_EVAL_ACC_YN(String eMP_EVAL_ACC_YN) {
		EMP_EVAL_ACC_YN = eMP_EVAL_ACC_YN;
	}

	public int getEMP_EVAL_SUM() {
		return EMP_EVAL_SUM;
	}

	public void setEMP_EVAL_SUM(int eMP_EVAL_SUM) {
		EMP_EVAL_SUM = eMP_EVAL_SUM;
	}

	public String getEMP_NAME() {
		return EMP_NAME;
	}

	public void setEMP_NAME(String eMP_NAME) {
		EMP_NAME = eMP_NAME;
	}

	public String getEMP_ACC_NAME() {
		return EMP_ACC_NAME;
	}

	public void setEMP_ACC_NAME(String eMP_ACC_NAME) {
		EMP_ACC_NAME = eMP_ACC_NAME;
	}

	public String getEMP_MOD_NAME() {
		return EMP_MOD_NAME;
	}

	public void setEMP_MOD_NAME(String eMP_MOD_NAME) {
		EMP_MOD_NAME = eMP_MOD_NAME;
	}

	public String getEVAL_STD_CODE() {
		return EVAL_STD_CODE;
	}

	public void setEVAL_STD_CODE(String eVAL_STD_CODE) {
		EVAL_STD_CODE = eVAL_STD_CODE;
	}

	public int getEVAL_STD_SCORE() {
		return EVAL_STD_SCORE;
	}

	public void setEVAL_STD_SCORE(int eVAL_STD_SCORE) {
		EVAL_STD_SCORE = eVAL_STD_SCORE;
	}

	public String getEVAL_HEAD_CODE() {
		return EVAL_HEAD_CODE;
	}

	public void setEVAL_HEAD_CODE(String eVAL_HEAD_CODE) {
		EVAL_HEAD_CODE = eVAL_HEAD_CODE;
	}

	public int getEVAL_HEAD_SCORE() {
		return EVAL_HEAD_SCORE;
	}

	public void setEVAL_HEAD_SCORE(int eVAL_HEAD_SCORE) {
		EVAL_HEAD_SCORE = eVAL_HEAD_SCORE;
	}

	public LJH_EmpEvalHeadVO getEmpEvalHeadVO() {
		return empEvalHeadVO;
	}

	public void setEmpEvalHeadVO(LJH_EmpEvalHeadVO empEvalHeadVO) {
		this.empEvalHeadVO = empEvalHeadVO;
	}

	public LJH_EmpEvalStdVO getEmpEvalStdVO() {
		return empEvalStdVO;
	}

	public void setEmpEvalStdVO(LJH_EmpEvalStdVO empEvalStdVO) {
		this.empEvalStdVO = empEvalStdVO;
	}

	public LJH_EmpEvalVO getEmpEvalVO() {
		return empEvalVO;
	}

	public void setEmpEvalVO(LJH_EmpEvalVO empEvalVO) {
		this.empEvalVO = empEvalVO;
	}

	@Override
	public String toString() {
		return "LJH_EmpNoVO [EMP_NO=" + EMP_NO + ", EMP_EVAL_BOOK_NO="
				+ EMP_EVAL_BOOK_NO + ", EMP_EVAL_YN=" + EMP_EVAL_YN
				+ ", EVAL_STD_SCORE_SUM=" + EVAL_STD_SCORE_SUM
				+ ", EVAL_HEAD_SCORE_SUM=" + EVAL_HEAD_SCORE_SUM
				+ ", EMP_EVAL_REG_USER_NO=" + EMP_EVAL_REG_USER_NO
				+ ", EMP_EVAL_MOD_USER_NO=" + EMP_EVAL_MOD_USER_NO
				+ ", EMP_EVAL_ACC_USER_NO=" + EMP_EVAL_ACC_USER_NO
				+ ", EMP_EVAL_ACC_YN=" + EMP_EVAL_ACC_YN + ", EMP_EVAL_SUM="
				+ EMP_EVAL_SUM + ", EMP_NAME=" + EMP_NAME + ", EMP_ACC_NAME="
				+ EMP_ACC_NAME + ", EMP_MOD_NAME=" + EMP_MOD_NAME
				+ ", EVAL_STD_CODE=" + EVAL_STD_CODE + ", EVAL_STD_SCORE="
				+ EVAL_STD_SCORE + ", EVAL_HEAD_CODE=" + EVAL_HEAD_CODE
				+ ", EVAL_HEAD_SCORE=" + EVAL_HEAD_SCORE + ", empEvalHeadVO="
				+ empEvalHeadVO + ", empEvalStdVO=" + empEvalStdVO
				+ ", empEvalVO=" + empEvalVO + "]";
	}
	
}
	

