package nexacro.sample.vo.attendanceVO;

import java.util.Date;

import nexacro.sample.vo.DefaultVO;

public class AttendanceDetailVO extends DefaultVO{
	
 private String empNo;
 private Date attendDate;
 private String attitudeBookId;
 private Date startTime;
 private Date endTime;
 private String holidayYn;
 private String attendCode;
 
 private String REG_EMP_ID;
 
 private int isExist;
 private String EMP_REAL;
 
 private Date searchMonth;
 private Date searchDate;
 private String searchEmpNo;
 
 
 
 

public String getSearchEmpNo() {
	return searchEmpNo;
}
public void setSearchEmpNo(String searchEmpNo) {
	this.searchEmpNo = searchEmpNo;
}
public Date getSearchDate() {
	return searchDate;
}
public void setSearchDate(Date searchDate) {
	this.searchDate = searchDate;
}
public Date getSearchMonth() {
	return searchMonth;
}
public void setSearchMonth(Date searchMonth) {
	this.searchMonth = searchMonth;
}
public String getEMP_REAL() {
	return EMP_REAL;
}
public void setEMP_REAL(String eMP_REAL) {
	EMP_REAL = eMP_REAL;
}
public int getIsExist() {
	return isExist;
}
public void setIsExist(int isExist) {
	this.isExist = isExist;
	
	
}
public String getREG_EMP_ID() {
	return REG_EMP_ID;
}
public void setREG_EMP_ID(String rEG_EMP_ID) {
	REG_EMP_ID = rEG_EMP_ID;
}
public String getEmpNo() {
	return empNo;
}
public void setEmpNo(String empNo) {
	this.empNo = empNo;
}
public Date getAttendDate() {
	return attendDate;
}
public void setAttendDate(Date attendDate) {
	this.attendDate = attendDate;
}
public String getAttitudeBookId() {
	return attitudeBookId;
}
public void setAttitudeBookId(String attitudeBookId) {
	this.attitudeBookId = attitudeBookId;
}
public Date getStartTime() {
	return startTime;
}
public void setStartTime(Date startTime) {
	this.startTime = startTime;
}
public Date getEndTime() {
	return endTime;
}
public void setEndTime(Date endTime) {
	this.endTime = endTime;
}
public String getHolidayYn() {
	return holidayYn;
}
public void setHolidayYn(String holidayYn) {
	this.holidayYn = holidayYn;
}
public String getAttendCode() {
	return attendCode;
}
public void setAttendCode(String attendCode) {
	this.attendCode = attendCode;
}
 
 
 
 
	
	

}
