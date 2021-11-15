package nexacro.sample.vo.s_salbookVO;

import nexacro.sample.vo.DefaultVO;

public class TaxVO extends DefaultVO {
	
	private String salarybookno;
	private String empno;
	private String taxcode;
	private long taxmoney;
	
	
	
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
	public String getTaxcode() {
		return taxcode;
	}
	public void setTaxcode(String taxcode) {
		this.taxcode = taxcode;
	}
	public long getTaxmoney() {
		return taxmoney;
	}
	public void setTaxmoney(long taxmoney) {
		this.taxmoney = taxmoney;
	}
	
	
	
	
	

	
	
	
	

}

