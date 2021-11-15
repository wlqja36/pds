package nexacro.sample.vo.Oct_btrip;

import java.util.Date;

import nexacro.sample.vo.DefaultVO;

public class YJB_Btrip_detailVO extends DefaultVO{
	private String btrip_Dno	   ;
	private String btrip_no	   	   ;
	private String btrip_Dda	   ;
	private String detail	       ;
	private Date ws_Date	       ;
	private Date wf_Date	       ;
	private String hotel	       ;
	private String trans	       ;
	private String visiter	       ;
	private int tex_Expenses	   ;
	private String remark	       ;
	
	
	public String getBtrip_no() {
		return btrip_no;
	}
	public void setBtrip_no(String btrip_no) {
		this.btrip_no = btrip_no;
	}
	public String getBtrip_Dno() {
		return btrip_Dno;
	}
	public void setBtrip_Dno(String btrip_Dno) {
		this.btrip_Dno = btrip_Dno;
	}
	public String getBtrip_Dda() {
		return btrip_Dda;
	}
	public void setBtrip_Dda(String btrip_Dda) {
		this.btrip_Dda = btrip_Dda;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public Date getWs_Date() {
		return ws_Date;
	}
	public void setWs_Date(Date ws_Date) {
		this.ws_Date = ws_Date;
	}
	public Date getWf_Date() {
		return wf_Date;
	}
	public void setWf_Date(Date wf_Date) {
		this.wf_Date = wf_Date;
	}
	public String getHotel() {
		return hotel;
	}
	public void setHotel(String hotel) {
		this.hotel = hotel;
	}
	public String getTrans() {
		return trans;
	}
	public void setTrans(String trans) {
		this.trans = trans;
	}
	public String getVisiter() {
		return visiter;
	}
	public void setVisiter(String visiter) {
		this.visiter = visiter;
	}
	public int getTex_Expenses() {
		return tex_Expenses;
	}
	public void setTex_Expenses(int tex_Expenses) {
		this.tex_Expenses = tex_Expenses;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
	
                                   
}
