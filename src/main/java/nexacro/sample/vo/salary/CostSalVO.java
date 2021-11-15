package nexacro.sample.vo.salary;

import nexacro.sample.vo.DefaultVO;

public class CostSalVO extends DefaultVO {
	private String salary_book_no    ; 
	private String emp_no            ;
	private int cost_no           ;
	private String cost_code         ;
	private int cost_money        ;
	
	
	//MAP으로 인한 변수명 변경에 따른 추가
   	private String salaryBookNo  ;
   	private String empNo         ;
    private String attitudeBookId  ;
    private int costNo         ;
    private String empName         ;
    private String costCode         ;
    private int costMoney          ;
   	
   	
	private String empUser;	

	public String getEmpUser() {
		return empUser;
	}








	public void setEmpUser(String empUser) {
		this.empUser = empUser;
	}
   	
   	
	public String getAttitudeBookId() {
		return attitudeBookId;
	}
	public void setAttitudeBookId(String attitudeBookId) {
		this.attitudeBookId = attitudeBookId;
	}
	public int getCostNo() {
		return costNo;
	}
	public void setCostNo(int costNo) {
		this.costNo = costNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getCostCode() {
		return costCode;
	}
	public void setCostCode(String costCode) {
		this.costCode = costCode;
	}
	public int getCostMoney() {
		return costMoney;
	}
	public void setCostMoney(int costMoney) {
		this.costMoney = costMoney;
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
	public int getCost_no() {
		return cost_no;
	}
	public void setCost_no(int cost_no) {
		this.cost_no = cost_no;
	}
	public String getCost_code() {
		return cost_code;
	}
	public void setCost_code(String cost_code) {
		this.cost_code = cost_code;
	}
	public int getCost_money() {
		return cost_money;
	}
	public void setCost_money(int cost_money) {
		this.cost_money = cost_money;
	}
	
	

}
