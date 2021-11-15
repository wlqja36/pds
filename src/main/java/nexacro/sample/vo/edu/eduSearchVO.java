package nexacro.sample.vo.edu;

import java.util.Date;

import nexacro.sample.vo.DefaultVO;
import nexacro.sample.vo.emp.EdulevelVO;
import nexacro.sample.vo.emp.EmpVO;

public class eduSearchVO extends DefaultVO{
	private String EMP_NO;	
	private String EMP_NAME;
	private String EDUCATION_NAME;

	public String getEMP_NO() {
		return EMP_NO;
	}

	public void setEMP_NO(String eMP_NO) {
		EMP_NO = eMP_NO;
	}

	public String getEMP_NAME() {
		return EMP_NAME;
	}

	public void setEMP_NAME(String eMP_NAME) {
		EMP_NAME = eMP_NAME;
	}

	public String getEDUCATION_NAME() {
		return EDUCATION_NAME;
	}

	public void setEDUCATION_NAME(String eDUCATION_NAME) {
		EDUCATION_NAME = eDUCATION_NAME;
	}
	
	

}
