package nexacro.sample.service.Oct_com;

import java.util.List;
import java.util.Map;

import nexacro.sample.vo.Oct_com.YJB_ComCodeVO;
import nexacro.sample.vo.Oct_com.YJB_DetailCodeVO;



public interface YJB_CodeService {
	
	// 코드마스터 전체내역 조회하기
	List<YJB_ComCodeVO> yjb_selectCode(YJB_ComCodeVO comCodeVO) throws Exception;
	
	// 코드마스터 입력/수정/삭제
	String editCode(List<YJB_ComCodeVO> comCodeVO) throws Exception;

	YJB_ComCodeVO searchCode(String classCode) throws Exception;
	// 상세코드 분류코드 조회하기
	List<YJB_DetailCodeVO> selectDetailCode() throws Exception;
	
	// 분류코드에 따른 상세코드 가져오기
	List<YJB_DetailCodeVO> selectDetailList(YJB_DetailCodeVO detailCodeVO) throws Exception;
	
	YJB_DetailCodeVO selectDRnum(String detailCode) throws Exception;
	
	// 상세코드 입력, 수정, 삭제
	String editDetailCode(List<YJB_DetailCodeVO> detailCodeVO) throws Exception;
	
	YJB_DetailCodeVO searchDetailCode(String detailCode) throws Exception;
	/*아직안함
	// 분류별 코드번호 또는 코드네임 가져오기
	List<ComCodeVO> detailCode(Map<String, String> switchMap);
	
	
	ComCodeVO selectRnum(String classCode);
	
	
	
	*/
}
