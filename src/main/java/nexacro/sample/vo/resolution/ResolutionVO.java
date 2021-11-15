package nexacro.sample.vo.resolution;

import java.util.Date;

import nexacro.sample.vo.DefaultVO;

public class ResolutionVO extends DefaultVO{
	
	private String EMP_NO;
	private String EMP_NAME;
	private Date REG_DATE;
	private String SALARY_BOOK_NO;
	private String RESOLUTION_CODE;
	private int TOTAL_COST;
	private String REG_EMP_NO;
	private String MODIFY_EMP_NO;
	private Date MODIFY_DATE;
	private String CONFIRM_EMP_NO;
	private Date CONFIRM_DATE;
	private String CONFIRM_YN;
	
	
	
	public String getEMP_NO() {
		return EMP_NO;
	}
	public void setEMP_NO(String eMP_NO) {
		EMP_NO = eMP_NO;
	}
	public String getEMP_NAME() {
		return EMP_NAME;
	}
	public void setEMP_NAME(String eMP_NAME) {
		EMP_NAME = eMP_NAME;
	}
	public Date getREG_DATE() {
		return REG_DATE;
	}
	public void setREG_DATE(Date rEG_DATE) {
		REG_DATE = rEG_DATE;
	}
	public String getATTITUDE_BOOK_ID() {
		return SALARY_BOOK_NO;
	}
	public void setATTITUDE_BOOK_ID(String sALARY_BOOK_NO) {
		SALARY_BOOK_NO = sALARY_BOOK_NO;
	}
	public String getRESOLUTION_CODE() {
		return RESOLUTION_CODE;
	}
	public void setRESOLUTION_CODE(String rESOLUTION_CODE) {
		RESOLUTION_CODE = rESOLUTION_CODE;
	}
	public int getTOTAL_COST() {
		return TOTAL_COST;
	}
	public void setTOTAL_COST(int tOTAL_COST) {
		TOTAL_COST = tOTAL_COST;
	}
	public String getREG_EMP_NO() {
		return REG_EMP_NO;
	}
	public void setREG_EMP_NO(String rEG_EMP_NO) {
		REG_EMP_NO = rEG_EMP_NO;
	}
	public String getMODIFY_EMP_NO() {
		return MODIFY_EMP_NO;
	}
	public void setMODIFY_EMP_NO(String mODIFY_EMP_NO) {
		MODIFY_EMP_NO = mODIFY_EMP_NO;
	}
	public Date getMODIFY_DATE() {
		return MODIFY_DATE;
	}
	public void setMODIFY_DATE(Date mODIFY_DATE) {
		MODIFY_DATE = mODIFY_DATE;
	}
	public String getCONFIRM_EMP_NO() {
		return CONFIRM_EMP_NO;
	}
	public void setCONFIRM_EMP_NO(String cONFIRM_EMP_NO) {
		CONFIRM_EMP_NO = cONFIRM_EMP_NO;
	}
	public Date getCONFIRM_DATE() {
		return CONFIRM_DATE;
	}
	public void setCONFIRM_DATE(Date cONFIRM_DATE) {
		CONFIRM_DATE = cONFIRM_DATE;
	}
	public String getCONFIRM_YN() {
		return CONFIRM_YN;
	}
	public void setCONFIRM_YN(String cONFIRM_YN) {
		CONFIRM_YN = cONFIRM_YN;
	}

	
}
