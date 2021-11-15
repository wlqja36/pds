package nexacro.sample.service.dao.ibatis.attitude;

import java.util.List;

import nexacro.sample.vo.attendanceVO.AttendanceDetailVO;
import nexacro.sample.vo.attitudeVO.AttitudeBookVO;
import nexacro.sample.vo.attitudeVO.AttitudeVO;

import org.springframework.stereotype.Repository;

import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;

/**
 * Test를 위한 DAO Sample Class
 *
 * @author Park SeongMin
 * @since 08.12.2015
 * @version 1.0
 * @see
 */
@Repository("attitudeDAO")
public class AttitudeDAO extends NexacroIbatisAbstractDAO {
	
	
	 public void insertAttitudeVO(AttitudeVO attitude) {
	        insert("attitude.insertAttitude", attitude);
	    }
	
	 
	 public void updateAttitudeVO(AttitudeVO attitude) {
	        insert("attitude.updateAttitude", attitude);
	    }
	 
	 public void deleteAttitudeVO(AttitudeVO attitude) {
	        insert("attitude.deleteAttitude", attitude);
	    }
	 
	 
	 public List<AttitudeVO> selectAttitudeVOList(AttitudeVO searchVO) {
	        return (List<AttitudeVO>) list("attitude.selectAttitudeVOList", searchVO);
	    }
	 
	 
     public int selectVacationLeft(AttitudeVO searchVO){
		 
		 return (int) select("attitude.selectVacationLeft", searchVO);
	 } 
	 
	

}
