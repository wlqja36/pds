package nexacro.sample.service.impl.administrator;


import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.sample.service.administrator.AdmService;
import nexacro.sample.service.dao.ibatis.administrator.AdmDao;
import nexacro.sample.util.Sha256;
import nexacro.sample.vo.administrator.AdmVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;


@Service("admService")
public class AdmServiceImpl extends EgovAbstractServiceImpl implements AdmService {
	
	@Resource(name = "admDao")
	private AdmDao admDao;
	
	// 로그인
	@Override
	public AdmVO selectLogin(Map<String, String> loginMap) {
		
		AdmVO admVO = new AdmVO();
		
		admVO = admDao.selectId(loginMap.get("emp_id"));
		
		if(admVO.getEmp_id().equals("NONE") || admVO.getEmp_id() == null){
			admVO.setMsg("none");
			return admVO;
		}else{
			admVO = admDao.selectLogin(loginMap);
			
			if(admVO != null){
				
				String insertPwd = loginMap.get("emp_pw");
				String dbPwd = admVO.getEmp_pw();
				
				if(!Sha256.encrypt(dbPwd).equals(Sha256.encrypt(insertPwd))){
					admVO.setMsg("password");
				}else{
					admVO.setMsg("ok");
				}
			}
			return admVO;
		}
	}
	
	// 존재하는 아이디인지 검색
	@Override
	public AdmVO selectId(String emp_id) {
		AdmVO admVO = admDao.selectId(emp_id);
		
		if(admVO.getEmp_id().equals("NONE") || admVO.getEmp_id() == null){
			admVO.setMsg("none");
		}
		return admVO;
	}
	@Override
	public void insertAdm(AdmVO admVO) {
			
		admDao.insertAdm(admVO);
		
	}
	
    @Override
    public List<AdmVO> selectEmpList(AdmVO searchVo) {
        return admDao.selectEmpList(searchVo);
    }
    
	@Override
	public AdmVO selectEmp(String emp_no) {
		AdmVO admVO = admDao.selectEmp(emp_no);
		
		return admVO;
	}
	@Override
	public void updateAdm(AdmVO admVO) {
			
		admDao.updateAdm(admVO);
		
	}
	
	@Override
	public AdmVO searchEmpId(AdmVO searchVO) {
			
		return admDao.searchEmpId(searchVO);
		
	}
	
	@Override
	public AdmVO searchEmpPw(AdmVO searchVO) {
			
		return admDao.searchEmpPw(searchVO);
		
	}
	
	@Override
	public void updateLogin(String emp_no){
		
		admDao.updateLogin(emp_no);
	}
	
	@Override
	public void updatePw(AdmVO admVO){
		admDao.updatePw(admVO);
	}
}//end class
