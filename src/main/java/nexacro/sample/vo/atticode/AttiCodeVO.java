package nexacro.sample.vo.atticode;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import nexacro.sample.vo.DefaultVO;

public class AttiCodeVO extends DefaultVO{
	
//	@NotNull(message = "근태코드를 기입해 주세요.")
//	@Size(min = 4, max = 4, message = "근태코드는 4글자로 입력해야 합니다.")
	private String ATTITUDE_ID;
	private String ATTITUDE_NM;
	private String HOL_USEYN;
	private String BRIFE;
	private String VACATION_CODE_ID;
	
	
	
	
	public String getATTITUDE_ID() {
		return ATTITUDE_ID;
	}
	public void setATTITUDE_ID(String aTTITUDE_ID) {
		ATTITUDE_ID = aTTITUDE_ID;
	}
	public String getATTITUDE_NM() {
		return ATTITUDE_NM;
	}
	public void setATTITUDE_NM(String aTTITUDE_NM) {
		ATTITUDE_NM = aTTITUDE_NM;
	}
	public String getHOL_USEYN() {
		return HOL_USEYN;
	}
	public void setHOL_USEYN(String hOL_USEYN) {
		HOL_USEYN = hOL_USEYN;
	}
	public String getBRIFE() {
		return BRIFE;
	}
	public void setBRIFE(String bRIFE) {
		BRIFE = bRIFE;
	}
	public String getVACATION_CODE_ID() {
		return VACATION_CODE_ID;
	}
	public void setVACATION_CODE_ID(String vACATION_CODE_ID) {
		VACATION_CODE_ID = vACATION_CODE_ID;
	}
	
	

}
