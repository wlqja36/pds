package nexacro.sample.service.impl.attiInfo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.sample.service.attiInfoService.AttiInfoService;
import nexacro.sample.service.dao.ibatis.attiInfo.AttiInfoDAO;
import nexacro.sample.vo.DefaultVO;
import nexacro.sample.vo.atticode.Attend_InfoVO;



import nexacro.sample.vo.atticode.AttitudeInfoVO;
import nexacro.sample.vo.attitudeVO.AttitudeBookVO;
import nexacro.sample.vo.emp.EmpVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("attiInfoService")
public class AttiInfoServiceImpl extends EgovAbstractServiceImpl implements AttiInfoService{
	
	@Resource(name="attiInfoDAO")
	AttiInfoDAO attiInfoDAO;
	
	public List<Attend_InfoVO> loadAttendInfo(Attend_InfoVO searchKeyword){
		return attiInfoDAO.loadAttendInfo(searchKeyword);
	}
	
	public List<AttitudeInfoVO> loadAttitudeInfo(Attend_InfoVO searchKeyword){
		return attiInfoDAO.loadAttitudeInfo(searchKeyword);
	}
	
	
	public List<EmpVO> searchEmp(Attend_InfoVO searchKeyword){
		return attiInfoDAO.searchEmp(searchKeyword);
	}
	
	public List<AttitudeBookVO> loadAttendBookNo(){
		return attiInfoDAO.loadAttendBookNo();
	}
	
/*	//프로시져 테스트 
	public Map<String, Object> testMethod(){
		Map<String, Object> param = new HashMap<>();
		param.put("","");
		
		Map<String,Object> receiceMap = attiInfoDAO.getList("procedureDAO.getList", param);
		
		return receiceMap;
	}*/
	
}
