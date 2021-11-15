package nexacro.sample.vo.salary;

public class SalSalaryBookVO {
	
	private String salary_book_no ;
	private String salary_book_nm  ;
	private String attitude_book_id;
	

	
	public SalSalaryBookVO(String salary_book_no, String salary_book_nm,
			String attitude_book_id) {
		super();
		this.salary_book_no = salary_book_no;
		this.salary_book_nm = salary_book_nm;
		this.attitude_book_id = attitude_book_id;
	}
	
	public String getSalary_book_no() {
		return salary_book_no;
	}
	public void setSalary_book_no(String salary_book_no) {
		this.salary_book_no = salary_book_no;
	}
	public String getSalary_book_nm() {
		return salary_book_nm;
	}
	public void setSalary_book_nm(String salary_book_nm) {
		this.salary_book_nm = salary_book_nm;
	}

	public String getAttitude_book_id() {
		return attitude_book_id;
	}

	public void setAttitude_book_id(String attitude_book_id) {
		this.attitude_book_id = attitude_book_id;
	}
	
	
}
