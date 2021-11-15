package nexacro.sample.vo.Oct_com;

import java.util.Date;

import nexacro.sample.vo.DefaultVO;

public class YJB_ComCodeVO extends DefaultVO{
	
	private int rownum;
	private String classCode ;
	private String className;
	private String use;
	private String mainTable;
	private String useCol;
	private String classCodeInfo;
	private Date addDate ;
	private String detailCode;
	private String addEnum;
	private String updateEnum;
	private String updateDate;
	
	
	
	public String getDetailCode() {
		return detailCode;
	}
	public void setDetailCode(String detailCode) {
		this.detailCode = detailCode;
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
	public String getUse() {
		return use;
	}
	public void setUse(String use) {
		this.use = use;
	}
	public String getMainTable() {
		return mainTable;
	}
	public void setMainTable(String mainTable) {
		this.mainTable = mainTable;
	}
	public String getUseCol() {
		return useCol;
	}
	public void setUseCol(String useCol) {
		this.useCol = useCol;
	}
	public String getClassCodeInfo() {
		return classCodeInfo;
	}
	public void setClassCodeInfo(String classCodeInfo) {
		this.classCodeInfo = classCodeInfo;
	}
	public Date getAddDate() {
		return addDate;
	}
	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}
	public String getAddEnum() {
		return addEnum;
	}
	public void setAddEnum(String addEnum) {
		this.addEnum = addEnum;
	}
	public String getUpdateEnum() {
		return updateEnum;
	}
	public void setUpdateEnum(String updateEnum) {
		this.updateEnum = updateEnum;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	
	
}