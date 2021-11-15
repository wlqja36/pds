package nexacro.sample.service.administrator;

import java.util.List;
import java.util.Map;

import nexacro.sample.vo.administrator.AdmVO;


public interface AdmService {
	
	// 로그인
	AdmVO selectLogin(Map<String, String> loginMap);
	
	// 존재하는 아이디인지 검색
	AdmVO selectId(String emp_id);
	
	void insertAdm(AdmVO admVO);
	
	List<AdmVO> selectEmpList(AdmVO searchVo);
	
	AdmVO selectEmp(String emp_no);
	
	void updateAdm(AdmVO admVO);
	
	AdmVO searchEmpId(AdmVO searchVO);
	
	AdmVO searchEmpPw(AdmVO searchVO);
	
	void updateLogin(String emp_no);
	
	void updatePw(AdmVO admVO);
}
