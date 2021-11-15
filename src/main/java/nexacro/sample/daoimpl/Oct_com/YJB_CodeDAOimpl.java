package nexacro.sample.daoimpl.Oct_com;

import java.util.List;
import java.util.Map;

import nexacro.sample.dao.Oct_com.YJB_CodeDAO;
import nexacro.sample.vo.Oct_com.YJB_ComCodeVO;
import nexacro.sample.vo.Oct_com.YJB_DetailCodeVO;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository("YJB_codeDAO")
public class YJB_CodeDAOimpl implements YJB_CodeDAO{
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	// 공통코드 전체내역 조회하기
	public List<YJB_ComCodeVO> yjb_selectCode(YJB_ComCodeVO comCodeVO){
		return sqlSessionTemplate.selectList("yjb_comCode.yjb_selectCode", comCodeVO);
	}
	
	// 코드마스터 삽입
	public void insertCode(YJB_ComCodeVO comCodeVO){
		sqlSessionTemplate.insert("yjb_comCode.yjb_insertCode", comCodeVO);
	}
	
	
	// 코드마스터 수정
	public void updateCode(YJB_ComCodeVO comCodeVO){
		sqlSessionTemplate.update("yjb_comCode.yjb_updateCode", comCodeVO);
	}
	
	// 코드마스터 삭제
	public void deleteCode(YJB_ComCodeVO comCodeVO){
		sqlSessionTemplate.delete("yjb_comCode.yjb_deleteCode", comCodeVO);
	}
	
	public YJB_ComCodeVO searchCode(String classCode){
		return sqlSessionTemplate.selectOne("yjb_comCode.yjb_searchCode",classCode);
	}
	
	// 상세코드 분류코드 가져오기
	public List<YJB_DetailCodeVO> selectDetailCode(){
		return sqlSessionTemplate.selectList("yjb_comCode.yjb_selectDetailCode");
	}
	
	// 분류코드에 따른 상세코드 가져오기
	public List<YJB_DetailCodeVO> selectDetailList(YJB_DetailCodeVO detailCodeVO){
		return sqlSessionTemplate.selectList("yjb_comCode.yjb_selectDetailList", detailCodeVO);
	}
	
	public YJB_DetailCodeVO selectDRnum(String detailCode){
		return sqlSessionTemplate.selectOne("yjb_comCode.yjb_selectDRnum",detailCode);
	}
	// 상세코드 삽입
	public void insertDetailCode(YJB_DetailCodeVO detailCodeVO){
		sqlSessionTemplate.insert("yjb_comCode.yjb_insertDetailCode", detailCodeVO);
	}
	
	// 상세코드 수정
	public void updateDetailCode(YJB_DetailCodeVO detailCodeVO){
		sqlSessionTemplate.update("yjb_comCode.yjb_updateDetailCode", detailCodeVO);
	}
	
	// 상세코드 삭제
	public void deleteDetailCode(YJB_DetailCodeVO detailCodeVO){
		sqlSessionTemplate.delete("yjb_comCode.yjb_deleteDetailCode", detailCodeVO);
	}
	
	public YJB_DetailCodeVO searchDetailCode(String detailCode){
		return sqlSessionTemplate.selectOne("yjb_comCode.yjb_searchDetailCode",detailCode);
	}
	
	
	/* 아직 안함
	// 분류별 코드번호 또는 코드네임 가져오기
	public List<ComCodeVO> detailCode(Map<String, String> switchMap){
		return (List<ComCodeVO>)list("common.detailCode", switchMap);
	}
	
	
*/
}
