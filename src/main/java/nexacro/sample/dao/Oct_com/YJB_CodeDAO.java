package nexacro.sample.dao.Oct_com;

import java.util.List;
import java.util.Map;

import nexacro.sample.vo.Oct_com.YJB_ComCodeVO;
import nexacro.sample.vo.Oct_com.YJB_DetailCodeVO;


public interface YJB_CodeDAO  {
	
	// 공통코드 전체내역 조회하기
	public List<YJB_ComCodeVO> yjb_selectCode(YJB_ComCodeVO comCodeVO) throws Exception;
	
	/* 아직 안함
	// 분류별 코드번호 또는 코드네임 가져오기
	public List<YJB_ComCodeVO> detailCode(Map<String, String> switchMap)throws Exception;
	*/
	
	 
	 // 코드마스터 삽입
	public void insertCode(YJB_ComCodeVO comCodeVO) throws Exception;
	
	// 코드마스터 수정
	public void updateCode(YJB_ComCodeVO comCodeVO) throws Exception;
	
	// 코드마스터 삭제
	public void deleteCode(YJB_ComCodeVO comCodeVO) throws Exception;
	
	public YJB_ComCodeVO searchCode(String classCode) throws Exception;
	
	// 상세코드 분류코드 가져오기
	public List<YJB_DetailCodeVO> selectDetailCode() throws Exception;
	
	// 분류코드에 따른 상세코드 가져오기
	public List<YJB_DetailCodeVO> selectDetailList(YJB_DetailCodeVO detailCodeVO) throws Exception;
	
	public YJB_DetailCodeVO selectDRnum(String detailCode) throws Exception;
	
	// 상세코드 삽입
	public void insertDetailCode(YJB_DetailCodeVO detailCodeVO) throws Exception;
	
	// 상세코드 수정
	public void updateDetailCode(YJB_DetailCodeVO detailCodeVO) throws Exception;
	
	// 상세코드 삭제
	public void deleteDetailCode(YJB_DetailCodeVO detailCodeVO) throws Exception;
	
	public YJB_DetailCodeVO searchDetailCode(String detailCode) throws Exception;
	
	
}
