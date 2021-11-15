package nexacro.sample.service.dao.ibatis.attiInfo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import nexacro.sample.vo.DefaultVO;
import nexacro.sample.vo.atticode.Attend_InfoVO;
import nexacro.sample.vo.atticode.AttitudeInfoVO;
import nexacro.sample.vo.attitudeVO.AttitudeBookVO;
import nexacro.sample.vo.emp.EmpVO;
import nexacro.sample.vo.resolution.ResolutionVO;

import org.springframework.stereotype.Repository;

import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;

@Repository("attiInfoDAO")
public class AttiInfoDAO extends NexacroIbatisAbstractDAO{
	
	public List<Attend_InfoVO> loadAttendInfo(Attend_InfoVO searchKeyword){
		return (List<Attend_InfoVO>) list("attiInfo.loadAttendInfo", searchKeyword);
	}
	
	public List<AttitudeInfoVO> loadAttitudeInfo(Attend_InfoVO searchKeyword){
		return (List<AttitudeInfoVO>) list("attiInfo.loadAttitudeInfo", searchKeyword);
	}
	
	public List<EmpVO> searchEmp(Attend_InfoVO searchKeyword){
		return (List<EmpVO>)list("attiInfo.searchEmp" ,searchKeyword);
	}
	
	
	public List<AttitudeBookVO> loadAttendBookNo(){
		return (List<AttitudeBookVO>) list("attiInfo.loadAttendBookNo");
	}
	
	
}
