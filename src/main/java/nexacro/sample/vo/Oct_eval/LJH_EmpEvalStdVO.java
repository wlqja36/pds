package nexacro.sample.vo.Oct_eval;

public class LJH_EmpEvalStdVO {
     
	String EMP_NO;                //직원번호
    String EMP_EVAL_BOOK_NO;	  //인사평가대장 번호
    String EVAL_STD_CODE;         //인사평가코드
    int EVAL_STD_SCORE;           //인사평가점수
	
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
	
}
