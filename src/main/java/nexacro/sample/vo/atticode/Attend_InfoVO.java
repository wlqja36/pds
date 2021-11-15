package nexacro.sample.vo.atticode;

import java.util.Date;

import nexacro.sample.vo.DefaultVO;

public class Attend_InfoVO extends DefaultVO{
	private String EMP_NO;
	private Date ATTEND_DATE;
	private String ATTITUDE_BOOK_ID;
	private Date START_TIME;
	private Date END_TIME;
	private String HOLIDAYYN;
	private String ATTEND_CODE;
	
	
	public String getEMP_NO() {
		return EMP_NO;
	}
	public void setEMP_NO(String eMP_NO) {
		EMP_NO = eMP_NO;
	}
	public Date getATTEND_DATE() {
		return ATTEND_DATE;
	}
	public void setATTEND_DATE(Date aTTEND_DATE) {
		ATTEND_DATE = aTTEND_DATE;
	}
	public String getATTITUDE_BOOK_ID() {
		return ATTITUDE_BOOK_ID;
	}
	public void setATTITUDE_BOOK_ID(String aTTITUDE_BOOK_ID) {
		ATTITUDE_BOOK_ID = aTTITUDE_BOOK_ID;
	}
	public Date getSTART_TIME() {
		return START_TIME;
	}
	public void setSTART_TIME(Date sTART_TIME) {
		START_TIME = sTART_TIME;
	}
	public Date getEND_TIME() {
		return END_TIME;
	}
	public void setEND_TIME(Date eND_TIME) {
		END_TIME = eND_TIME;
	}
	public String getHOLIDAYYN() {
		return HOLIDAYYN;
	}
	public void setHOLIDAYYN(String hOLIDAYYN) {
		HOLIDAYYN = hOLIDAYYN;
	}
	public String getATTEND_CODE() {
		return ATTEND_CODE;
	}
	public void setATTEND_CODE(String aTTEND_CODE) {
		ATTEND_CODE = aTTEND_CODE;
	}
	
}









