package nexacro.sample.vo.com;

import java.util.Date;

import nexacro.sample.vo.DefaultVO;

public class ComCodeVO extends DefaultVO{
	
	private int rownum;
	private String classCode ;
	private String className;
	private String useYn;
	private String mainTable;
	private String mainColumn;
	private String classDesc;
	private Date registTime ;
	private String registId;
	private String detailCode;
	private String modifyId;
	private String modifyTime;
	private int rnum;
	
	
	
	public int getRnum() {
		return rnum;
	}
	public void setRnum(int rnum) {
		this.rnum = rnum;
	}
	public String getModifyId() {
		return modifyId;
	}
	public void setModifyId(String modifyId) {
		this.modifyId = modifyId;
	}
	public String getModifyTime() {
		return modifyTime;
	}
	public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
	}
	public int getRownum() {
		return rownum;
	}
	public void setRownum(int rownum) {
		this.rownum = rownum;
	}
	public String getClassCode() {
		return classCode;
	}
	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getUseYn() {
		return useYn;
	}
	public void setUseYn(String useYn) {
		this.useYn = useYn;
	}
	public String getMainTable() {
		return mainTable;
	}
	public void setMainTable(String mainTable) {
		this.mainTable = mainTable;
	}
	public String getMainColumn() {
		return mainColumn;
	}
	public void setMainColumn(String mainColumn) {
		this.mainColumn = mainColumn;
	}
	public String getClassDesc() {
		return classDesc;
	}
	public void setClassDesc(String classDesc) {
		this.classDesc = classDesc;
	}
	public Date getRegistTime() {
		return registTime;
	}
	public void setRegistTime(Date registTime) {
		this.registTime = registTime;
	}
	public String getRegistId() {
		return registId;
	}
	public void setRegistId(String registId) {
		this.registId = registId;
	}
	public String getDetailCode() {
		return detailCode;
	}
	public void setDetailCode(String detailCode) {
		this.detailCode = detailCode;
	}
	
	
}
