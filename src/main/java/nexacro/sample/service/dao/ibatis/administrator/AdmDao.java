package nexacro.sample.service.dao.ibatis.administrator;

import java.util.List;
import java.util.Map;

import nexacro.sample.vo.administrator.AdmVO;

import org.springframework.stereotype.Repository;

import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;


@Repository("admDao")
public class AdmDao extends NexacroIbatisAbstractDAO{

	// 로그인
	public AdmVO selectLogin(Map<String, String> loginMap){
		return (AdmVO)select("administrator.admlogin", loginMap);
	}
	
	// 존재하는 아이디인지 조회
	public AdmVO selectId(String id){
		return (AdmVO)select("administrator.selectid", id);
		//AdmVO에 id 값이 담기지 않는다?!
	}
	
	public void insertAdm(AdmVO admVO){
		insert("administrator.admInsert", admVO);
	}
	
    public List<AdmVO> selectEmpList(AdmVO searchVo) {
        return (List<AdmVO>) list("administrator.selectEmpList", searchVo);
    }
    
	public AdmVO selectEmp(String emp_no){
		return (AdmVO)select("administrator.selectEmp", emp_no);
	}
	public void updateAdm(AdmVO admVO){
		update("administrator.admUpdate", admVO);
	}
	
	public AdmVO searchEmpId(AdmVO searchVO){
		return (AdmVO)select("administrator.searchEmpId",searchVO);
	}
	
	public AdmVO searchEmpPw(AdmVO searchVO){
		return (AdmVO)select("administrator.searchEmpPw",searchVO);
	}
	
	public void updateLogin(String emp_no){
		update("administrator.loginUpdate", emp_no);
	}
	
	public void updatePw(AdmVO admVO){
		update("administrator.pwUpdate", admVO);
	}
}
