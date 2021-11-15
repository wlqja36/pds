package nexacro.sample.vo.salary;

import nexacro.sample.vo.DefaultVO;

public class BonusSalVo extends DefaultVO {
	//alt Shift a // alt Shift s r
	private String salary_book_no  ; 
	private String emp_no          ;
	private String bonus_code      ;
	private int bonus_money     ;
	
	//MAP으로 인한 변수명 변경에 따른 추가
   	private String salaryBookNo  ;
	private String empNo         ;
    private String attitudeBookId  ;
    private String empName         ;
    private String bonusCode       ;
    private int bonusMoney      ;
   
   	
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
    public String getEmpName() {
    	return empName;
    }
    public void setEmpName(String empName) {
    	this.empName = empName;
    }
    public String getBonusCode() {
    	return bonusCode;
    }
    public void setBonusCode(String bonusCode) {
    	this.bonusCode = bonusCode;
    }
    public int getBonusMoney() {
    	return bonusMoney;
    }
    public void setBonusMoney(int bonusMoney) {
    	this.bonusMoney = bonusMoney;
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
	public String getBonus_code() {
		return bonus_code;
	}
	public void setBonus_code(String bonus_code) {
		this.bonus_code = bonus_code;
	}
	public int getBonus_money() {
		return bonus_money;
	}
	public void setBonus_money(int bonus_money) {
		this.bonus_money = bonus_money;
	}
	
	
	
}
