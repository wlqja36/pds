package nexacro.sample.vo.s_bookVO;

import java.util.Date;

import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;

import nexacro.sample.vo.DefaultVO;


public class S_bookCodeVO extends NexacroIbatisAbstractDAO{
	
	//선언
	private String attitude_book_id;
	private String attitude_book_nm;
	private String keyword;
	private String search_condition;
	
	
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getSearch_condition() {
		return search_condition;
	}
	public void setSearch_condition(String search_condition) {
		this.search_condition = search_condition;
	}
	
	//게터세터
	public String getAttitude_book_id() {
		return attitude_book_id;
	}
	public void setAttitude_book_id(String attitude_book_id) {
		this.attitude_book_id = attitude_book_id;
	}
	public String getAttitude_book_nm() {
		return attitude_book_nm;
	}
	public void setAttitude_book_nm(String attitude_book_nm) {
		this.attitude_book_nm = attitude_book_nm;
	}
	
	
	
	
	


}

