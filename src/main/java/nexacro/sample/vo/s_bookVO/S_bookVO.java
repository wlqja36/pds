package nexacro.sample.vo.s_bookVO;

import java.util.Date;

import nexacro.sample.vo.DefaultVO;


public class S_bookVO extends DefaultVO{
	
	//선언
	private String  salary_book_no       ;
	private String  salary_book_code     ;
	private String  salary_book_nm        ;
	
	private Date    salary_book_reg_date        ;
	private Date  	salary_send_date        ;
	
	private String  salary_reg_user_no         ;
	
	private Date	salary_mod_date        ;
	
	private String  salary_mod_user_no    ;
	
	private Date 	salary_acc_date      ;
	
	private String 	salary_acc_user_no		   ;	
	private String  salary_acc_yn      ;
	
	private Date  	salary_cal_sta_date   ;
	private Date	salary_cal_end_date         ;
	
	private long 	salary_total	;
	private String 	attitude_book_id	;
	//getter setter
	public String getSalary_book_no() {
		return salary_book_no;
	}
	public void setSalary_book_no(String salary_book_no) {
		this.salary_book_no = salary_book_no;
	}
	public String getSalary_book_code() {
		return salary_book_code;
	}
	public void setSalary_book_code(String salary_book_code) {
		this.salary_book_code = salary_book_code;
	}
	public String getSalary_book_nm() {
		return salary_book_nm;
	}
	public void setSalary_book_nm(String salary_book_nm) {
		this.salary_book_nm = salary_book_nm;
	}
	public Date getSalary_book_reg_date() {
		return salary_book_reg_date;
	}
	public void setSalary_book_reg_date(Date salary_book_reg_date) {
		this.salary_book_reg_date = salary_book_reg_date;
	}
	public Date getSalary_send_date() {
		return salary_send_date;
	}
	public void setSalary_send_date(Date salary_send_date) {
		this.salary_send_date = salary_send_date;
	}
	public String getSalary_reg_user_no() {
		return salary_reg_user_no;
	}
	public void setSalary_reg_user_no(String salary_reg_user_no) {
		this.salary_reg_user_no = salary_reg_user_no;
	}
	public Date getSalary_mod_date() {
		return salary_mod_date;
	}
	public void setSalary_mod_date(Date salary_mod_date) {
		this.salary_mod_date = salary_mod_date;
	}
	public String getSalary_mod_user_no() {
		return salary_mod_user_no;
	}
	public void setSalary_mod_user_no(String salary_mod_user_no) {
		this.salary_mod_user_no = salary_mod_user_no;
	}
	public Date getSalary_acc_date() {
		return salary_acc_date;
	}
	public void setSalary_acc_date(Date salary_acc_date) {
		this.salary_acc_date = salary_acc_date;
	}
	public String getSalary_acc_user_no() {
		return salary_acc_user_no;
	}
	public void setSalary_acc_user_no(String salary_acc_user_no) {
		this.salary_acc_user_no = salary_acc_user_no;
	}
	public String getSalary_acc_yn() {
		return salary_acc_yn;
	}
	public void setSalary_acc_yn(String salary_acc_yn) {
		this.salary_acc_yn = salary_acc_yn;
	}
	public Date getSalary_cal_sta_date() {
		return salary_cal_sta_date;
	}
	public void setSalary_cal_sta_date(Date salary_cal_sta_date) {
		this.salary_cal_sta_date = salary_cal_sta_date;
	}
	public Date getSalary_cal_end_date() {
		return salary_cal_end_date;
	}
	public void setSalary_cal_end_date(Date salary_cal_end_date) {
		this.salary_cal_end_date = salary_cal_end_date;
	}
	public long getSalary_total() {
		return salary_total;
	}
	public void setSalary_total(long salary_total) {
		this.salary_total = salary_total;
	}
	public String getAttitude_book_id() {
		return attitude_book_id;
	}
	public void setAttitude_book_id(String attitude_book_id) {
		this.attitude_book_id = attitude_book_id;
	}

	
	


}