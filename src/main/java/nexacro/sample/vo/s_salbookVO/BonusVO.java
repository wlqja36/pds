package nexacro.sample.vo.s_salbookVO;

import nexacro.sample.vo.DefaultVO;

public class BonusVO extends DefaultVO {
	
	private String salarybookno;
	private String empno;
	private String bonuscode;
	private long bonusmoney;
	
	//게터 세터
	public String getSalarybookno() {
		return salarybookno;
	}
	public void setSalarybookno(String salarybookno) {
		this.salarybookno = salarybookno;
	}
	public String getEmpno() {
		return empno;
	}
	public void setEmpno(String empno) {
		this.empno = empno;
	}
	public String getBonuscode() {
		return bonuscode;
	}
	public void setBonuscode(String bonuscode) {
		this.bonuscode = bonuscode;
	}
	public long getBonusmoney() {
		return bonusmoney;
	}
	public void setBonusmoney(long bonusmoney) {
		this.bonusmoney = bonusmoney;
	}
	
	

	
	
	
	

}
