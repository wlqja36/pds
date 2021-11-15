package nexacro.sample.vo.Oct_btrip;

import java.util.Date;

import nexacro.sample.vo.DefaultVO;


public class YJB_Btrip_ManagementVO extends DefaultVO{
	
	//선언
	private String  btrip_No       ;
	private String  btrip_Name     ;
	private String  country        ;
	private String  area           ;
	private String  purpose        ;
	
	private String 	s_Date         ;
	private String	f_Date         ;
	
	private String  ex_Expenses    ;
	private String  re_Emp_No      ;
	
	private String	ok_Date		   ;
	
	private String  ok_Emp_No      ;
	private String  ok_Ascertain   ;
	private String  emp_No         ;
	
	
	//getter setter
	public String getBtrip_No() {
		return btrip_No;
	}
	public void setBtrip_No(String btrip_No) {
		this.btrip_No = btrip_No;
	}
	public String getBtrip_Name() {
		return btrip_Name;
	}
	public void setBtrip_Name(String btrip_Name) {
		this.btrip_Name = btrip_Name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	
	public String getEx_Expenses() {
		return ex_Expenses;
	}
	public void setEx_Expenses(String ex_Expenses) {
		this.ex_Expenses = ex_Expenses;
	}
	public String getRe_Emp_No() {
		return re_Emp_No;
	}
	public void setRe_Emp_No(String re_Emp_No) {
		this.re_Emp_No = re_Emp_No;
	}
	
	public String getS_Date() {
		return s_Date;
	}
	public void setS_Date(String s_Date) {
		this.s_Date = s_Date;
	}
	public String getF_Date() {
		return f_Date;
	}
	public void setF_Date(String f_Date) {
		this.f_Date = f_Date;
	}
	public String getOk_Date() {
		return ok_Date;
	}
	public void setOk_Date(String ok_Date) {
		this.ok_Date = ok_Date;
	}
	public String getOk_Emp_No() {
		return ok_Emp_No;
	}
	public void setOk_Emp_No(String ok_Emp_No) {
		this.ok_Emp_No = ok_Emp_No;
	}
	public String getOk_Ascertain() {
		return ok_Ascertain;
	}
	public void setOk_Ascertain(String ok_Ascertain) {
		this.ok_Ascertain = ok_Ascertain;
	}
	public String getEmp_No() {
		return emp_No;
	}
	public void setEmp_No(String emp_No) {
		this.emp_No = emp_No;
	}
	


}
