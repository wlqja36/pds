package nexacro.sample.vo.s_salbookVO;

import nexacro.sample.vo.DefaultVO;

public class SalaryVO extends DefaultVO {
	
	private String salarybookno;
	private String empno;
	private long basicmoney;
	private long bonussum ;
	private long costsum;
	private long taxsum;
	private long minustax;
	
	//게터세터
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
	public long getBasicmoney() {
		return basicmoney;
	}
	public void setBasicmoney(long basicmoney) {
		this.basicmoney = basicmoney;
	}
	public long getBonussum() {
		return bonussum;
	}
	public void setBonussum(long bonussum) {
		this.bonussum = bonussum;
	}
	public long getCostsum() {
		return costsum;
	}
	public void setCostsum(long costsum) {
		this.costsum = costsum;
	}
	public long getTaxsum() {
		return taxsum;
	}
	public void setTaxsum(long taxsum) {
		this.taxsum = taxsum;
	}
	public long getMinustax() {
		return minustax;
	}
	public void setMinustax(long minustax) {
		this.minustax = minustax;
	}
	
	

}