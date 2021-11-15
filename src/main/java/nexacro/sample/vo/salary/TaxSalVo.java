package nexacro.sample.vo.salary;

import nexacro.sample.vo.DefaultVO;

public class TaxSalVo extends DefaultVO {//검색
	//세금테이블
	private String salary_book_no     ;
	private String emp_no             ;
	private String tax_code           ;
	private int tax_money             ;
	
	
	
	//MAP으로 인한 변수명 변경에 따른 추가
   	private String salaryBookNo  ;
   	private String empNo         ;
    private String attitudeBookId  ;
    private String empName         ;
    private String taxCode         ;
    
   	
	private String empUser;	

	public String getEmpUser() {
		return empUser;
	}








	public void setEmpUser(String empUser) {
		this.empUser = empUser;
	}
    public String getTaxCode() {
		return taxCode;
	}
	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}
	public int getTaxMoney() {
		return taxMoney;
	}
	public void setTaxMoney(int taxMoney) {
		this.taxMoney = taxMoney;
	}
	private int taxMoney         ;
   	
   	
   	
	public String getAttitudeBookId() {
		return attitudeBookId;
	}
	public void setAttitudeBookId(String attitudeBookId) {
		this.attitudeBookId = attitudeBookId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getSalaryBookNo() {
		return salaryBookNo;
	}
	public void setSalaryBookNo(String salaryBookNo) {
		this.salaryBookNo = salaryBookNo;
	}
	public String getEmpNo() {
		return empNo;
	}
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	public String getSalary_book_no() {
		return salary_book_no;
	}
	public void setSalary_book_no(String salary_book_no) {
		this.salary_book_no = salary_book_no;
	}
	public String getEmp_no() {
		return emp_no;
	}
	public void setEmp_no(String emp_no) {
		this.emp_no = emp_no;
	}
	public String getTax_code() {
		return tax_code;
	}
	public void setTax_code(String tax_code) {
		this.tax_code = tax_code;
	}
	public int getTax_money() {
		return tax_money;
	}
	public void setTax_money(int tax_money) {
		this.tax_money = tax_money;
	}

}
