package nexacro.sample.service.dao.ibatis.attendance;

import java.util.List;

import nexacro.sample.vo.attendanceVO.AttendanceDetailVO;
import nexacro.sample.vo.attitudeVO.AttitudeBookVO;

import org.springframework.stereotype.Repository;

import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;

@Repository("attendanceDAO")
public class AttendanceDAO extends NexacroIbatisAbstractDAO {

	 public List<AttendanceDetailVO> selectAttendanceList(AttendanceDetailVO searchVO) {
	        return (List<AttendanceDetailVO>) list("attendance.selectAttendanceList", searchVO);
	    }
	
	
	 public void insertAttendance(AttendanceDetailVO attendanceVO) {
	        insert("attendance.insertAttendance", attendanceVO);
	    }
	
	 
	 public void updateAttendance(AttendanceDetailVO attendanceVO) {
	        insert("attendance.updateAttendance", attendanceVO);
	    }
	 
	 public void deleteAttendance(AttendanceDetailVO attendanceVO) {
	        insert("attendance.deleteAttendance", attendanceVO);
	    }
	
	
	 public int selectBookExist(AttendanceDetailVO attendanceVO){
		 
		 
		 return (int) select("attendance.selectBookExist",attendanceVO);
	 }
	 
	 //평일 세팅

	 public void insertBulkAttendance_WD(String param) {
	        
		  insert("attendance.insertBulkAttendance_WD", param);
	    }
	
	 
	 
	 //주말, 공휴일 세팅
	 public void insertBulkAttendance_WE(String param) {
	      
		  insert("attendance.insertBulkAttendance_WE", param);
	    }

	 //근태정보 업데이트
	 public void updateAttitudeInfo(String param) {
		 
		 update("attendance.updateAttitudeInfo", param);
	 }
	 
	 
	 //현재 대장의 제일 끝날짜 string값으로 반환
	 
	 public String selectMaxDate(AttendanceDetailVO attendanceVO){
		 
		 
		 return (String)select("attendance.selectMaxDate",attendanceVO);
	 }
	 
	 
	 
}
