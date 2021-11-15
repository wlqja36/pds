package nexacro.sample.vo.emp;

import java.util.Date;

import nexacro.sample.vo.DefaultVO;

public class CareerVO extends DefaultVO{
	
	private String EMP_NO;
	private Date JOIN_DATE;
	private Date RETIRE_DATE;
	private String COMPANY_NAME;
	private String POSITION;
	private String DEPT_NAME;
	private String RETIRE_REASON;
	private String CAREER_NO;
	
	
	public String getEMP_NO() {
		return EMP_NO;
	}
	public void setEMP_NO(String eMP_NO) {
		EMP_NO = eMP_NO;
	}
	public Date getJOIN_DATE() {
		return JOIN_DATE;
	}
	public void setJOIN_DATE(Date jOIN_DATE) {
		JOIN_DATE = jOIN_DATE;
	}
	public Date getRETIRE_DATE() {
		return RETIRE_DATE;
	}
	public void setRETIRE_DATE(Date rETIRE_DATE) {
		RETIRE_DATE = rETIRE_DATE;
	}
	public String getCOMPANY_NAME() {
		return COMPANY_NAME;
	}
	public void setCOMPANY_NAME(String cOMPANY_NAME) {
		COMPANY_NAME = cOMPANY_NAME;
	}
	public String getPOSITION() {
		return POSITION;
	}
	public void setPOSITION(String pOSITION) {
		POSITION = pOSITION;
	}
	public String getDEPT_NAME() {
		return DEPT_NAME;
	}
	public void setDEPT_NAME(String dEPT_NAME) {
		DEPT_NAME = dEPT_NAME;
	}
	public String getRETIRE_REASON() {
		return RETIRE_REASON;
	}
	public void setRETIRE_REASON(String rETIRE_REASON) {
		RETIRE_REASON = rETIRE_REASON;
	}
	public String getCAREER_NO() {
		return CAREER_NO;
	}
	public void setCAREER_NO(String cAREER_NO) {
		CAREER_NO = cAREER_NO;
	}
	
	

}
