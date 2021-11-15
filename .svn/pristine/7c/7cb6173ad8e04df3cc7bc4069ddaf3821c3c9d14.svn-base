package nexacro.sample.service.dao.ibatis.attitude;

import java.util.List;

import nexacro.sample.vo.UserVO;
import nexacro.sample.vo.attitudeVO.AttitudeBookVO;
import nexacro.sample.vo.btripVO.Btrip_ManagementVO;
import nexacro.sample.vo.btrip_detailVO.Btrip_detailVO;

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
@Repository("attitudeBookDAO")
public class AttitudeBookDAO extends NexacroIbatisAbstractDAO {
	
	
	 public void insertBookVO(AttitudeBookVO attitudeBook) {
	        insert("attitude_book.insertAttitudeBookVOList", attitudeBook);
	    }
	 
	 public void updateBookVO(AttitudeBookVO attitudeBook) {
	        insert("attitude_book.updateAttitudeBookVOList", attitudeBook);
	    }
	 
	 public void deleteBookVO(AttitudeBookVO attitudeBook) {
	        insert("attitude_book.deleteAttitudeBookVOList", attitudeBook);
	    }
	 
	 public List<AttitudeBookVO> selectBookVOList(AttitudeBookVO searchVO) {
	        return (List<AttitudeBookVO>) list("attitude_book.selectAttitudeBookVOList", searchVO);
	    }
	 
	 public int selectAttitudeSeq() {
	       
		 return (int) select("attitude_book.selectAttitudeSeq");
				 
				 
				// (Integer)("attitude_book.selectAttitudeSeq");
		 
	    }
	 
	 
	
	
/*
    public List<Btrip_ManagementVO> selectUserVOList(Btrip_ManagementVO searchVO) {
        return (List<Btrip_ManagementVO>) list("btrip_management.selectbtrVOList", searchVO);
    }
 
    public void insertUserVO(Btrip_ManagementVO btr) {
        insert("btrip_management.insertbtrVOList", btr);
    }
    
    public void updateUserVO(Btrip_ManagementVO btr) {
        update("btrip_management.updatebtrVOList", btr);
    }
    public void deleteUserVO(Btrip_ManagementVO btr) {
        delete("btrip_management.deletebtrVOList", btr);
    }
	

*/

}
