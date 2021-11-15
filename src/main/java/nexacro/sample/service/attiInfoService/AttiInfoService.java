package nexacro.sample.service.attiInfoService;

import java.util.List;

import nexacro.sample.vo.DefaultVO;
import nexacro.sample.vo.atticode.Attend_InfoVO;
import nexacro.sample.vo.atticode.AttitudeInfoVO;
import nexacro.sample.vo.attitudeVO.AttitudeBookVO;
import nexacro.sample.vo.emp.EmpVO;

public interface AttiInfoService {
	
	List<Attend_InfoVO> loadAttendInfo(Attend_InfoVO searchKeyword);
	
	List<AttitudeInfoVO> loadAttitudeInfo(Attend_InfoVO searchKeyword);
	
	List<EmpVO> searchEmp(Attend_InfoVO searchKeyword);
	
	List<AttitudeBookVO> loadAttendBookNo();
	
}
