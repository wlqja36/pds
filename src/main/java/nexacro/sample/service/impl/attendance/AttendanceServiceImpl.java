package nexacro.sample.service.impl.attendance;

import java.util.List;

import javax.annotation.Resource;

import nexacro.sample.service.attendance.AttendanceService;
import nexacro.sample.service.dao.ibatis.attendance.AttendanceDAO;
import nexacro.sample.vo.attendanceVO.AttendanceDetailVO;
import nexacro.sample.vo.attitudeVO.AttitudeBookVO;

import org.springframework.stereotype.Service;

import com.nexacro.spring.data.DataSetRowTypeAccessor;
import com.nexacro.xapi.data.DataSet;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;


@Service("attendanceService")
public class AttendanceServiceImpl extends EgovAbstractServiceImpl implements AttendanceService{

	
	  // @Autowired(required = false) // Type 정의
    @Resource(name = "attendanceDAO")
    // Name 정의
    private AttendanceDAO attendanceDAO;
	
	
	
	
	@Override
	public List<AttendanceDetailVO> selectAttendanceList(AttendanceDetailVO searchVO) {
		
		return attendanceDAO.selectAttendanceList(searchVO);
	}


	
	

/*
	@Override
	public int selectBookExist(AttendanceDetailVO searchVO) {
		
		return attendanceDAO.selectBookExist(searchVO);
	}

*/




	@Override
	public void modifyAttendanceDetailVO(List<AttendanceDetailVO> modifyList) {
	
		
		 int size = modifyList.size();
	        for (int i=0; i<size; i++) {
	            AttendanceDetailVO attendance = modifyList.get(i);
	            if (attendance instanceof DataSetRowTypeAccessor){
	                DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) attendance;
	                
	                if (accessor.getRowType() == DataSet.ROW_TYPE_INSERTED){
	                	 int isExist=attendanceDAO.selectBookExist(attendance);
	                	 
	                	 if(isExist>0){
	                	 attendance.setIsExist(1);
	                	 }else{
	                		 attendance.setIsExist(0);
	                	 }
	                	 
	                     attendanceDAO.insertAttendance(attendance);               	
	                }else if (accessor.getRowType() == DataSet.ROW_TYPE_UPDATED){
	                	attendanceDAO.updateAttendance(attendance);
	                }else if (accessor.getRowType() == DataSet.ROW_TYPE_DELETED){
	                	attendanceDAO.deleteAttendance(attendance);
	                }
	            }
	            
	        }
		
		
		
		
		
	}





	@Override
	public void insertBulkAttendance_WD(String param) {
		attendanceDAO.insertBulkAttendance_WD(param);
		
	}





	@Override
	public void insertBulkAttendance_WE(String param) {
		attendanceDAO.insertBulkAttendance_WE(param);
		
	}

	@Override
	public void updateAttitudeInfo(String param) {
		attendanceDAO.updateAttitudeInfo(param);
		
	}





	@Override
	public String selectMaxDate(AttendanceDetailVO attendanceVO) {
	
		return attendanceDAO.selectMaxDate(attendanceVO);
	}

	
	
	

/*


	@Override
	public void modifyBulkVO(List<AttendanceDetailVO> modifyList) {
	
		
		 int size = modifyList.size();
	        for (int i=0; i<size; i++) {
	            AttendanceDetailVO attendance = modifyList.get(i);
	           
	            
	            System.out.println("hiiiiiiiiiiiiiiiiiiiii");
	                	 	                	 
	                     attendanceDAO.insertBulkAttendance_WD(attendance);   
	                
	              
	            }
	            
	        }*/
		
		
		
	}
		
	
	
	
	

	
	
	
	
	
	
	
	

