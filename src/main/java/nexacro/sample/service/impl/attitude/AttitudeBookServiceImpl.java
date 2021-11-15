package nexacro.sample.service.impl.attitude;

import java.util.List;

import javax.annotation.Resource;

import nexacro.sample.service.UserService;
import nexacro.sample.service.attitude.AttitudeBookService;
import nexacro.sample.service.dao.ibatis.UserDAO;
import nexacro.sample.service.dao.ibatis.attitude.AttitudeBookDAO;
import nexacro.sample.vo.UserVO;


import nexacro.sample.vo.attitudeVO.AttitudeBookVO;

import org.springframework.stereotype.Service;

import com.nexacro.spring.data.DataSetRowTypeAccessor;
import com.nexacro.xapi.data.DataSet;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

/**
 * Test를 위한 ServiceImpl Sample Class
 *
 * @author Park SeongMin
 * @since 08.12.2015
 * @version 1.0
 * @see
 */
@Service("attitudeBookService")
public class AttitudeBookServiceImpl extends EgovAbstractServiceImpl implements AttitudeBookService {

    /**
     * UserDAO class 선언 (UserDAO) Class Injection)
     * (UserDAO)sampleDAO
     */
    // @Autowired(required = false) // Type 정의
    @Resource(name = "attitudeBookDAO")
    // Name 정의
    private AttitudeBookDAO attitudeBookDAO;

	@Override
	public void modifyMultiBookVO(List<AttitudeBookVO> modifyList) {

		 int size = modifyList.size();
	        for (int i=0; i<size; i++) {
	            AttitudeBookVO attitudeBook = modifyList.get(i);
	            if (attitudeBook instanceof DataSetRowTypeAccessor){
	                DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) attitudeBook;
	                
	                if (accessor.getRowType() == DataSet.ROW_TYPE_INSERTED){
	                	attitudeBookDAO.insertBookVO(attitudeBook);
	                }else if (accessor.getRowType() == DataSet.ROW_TYPE_UPDATED){
	                	attitudeBookDAO.updateBookVO(attitudeBook);
	                }else if (accessor.getRowType() == DataSet.ROW_TYPE_DELETED){
	                	attitudeBookDAO.deleteBookVO(attitudeBook);
	                }
	            }
	            
	        }
		
		
		
		
		
	}
    
    
	
    @Override
    public List<AttitudeBookVO> selectBookVOList(AttitudeBookVO searchVO) {
        return attitudeBookDAO.selectBookVOList(searchVO);
     
    }



	@Override
	public int selectAttitudeSeq() {
		// TODO Auto-generated method stub
		return attitudeBookDAO.selectAttitudeSeq();
	}
	
    
    
    
    
    
    
    
    
 //-------------------------------------------------------------------------------------------   
    
 /*
    @Override
    public List<Btrip_ManagementVO> selectUserVOList(Btrip_ManagementVO searchVO) {
        return btrDAO.selectUserVOList(searchVO);
    }

    @Override
    public void modifyMultiUserVO(List<Btrip_ManagementVO> modifyList) {

        int size = modifyList.size();
        for (int i=0; i<size; i++) {
            Btrip_ManagementVO btr = modifyList.get(i);
            if (btr instanceof DataSetRowTypeAccessor){
                DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) btr;
                
                if (accessor.getRowType() == DataSet.ROW_TYPE_INSERTED){
                	btrDAO.insertUserVO(btr);
                }else if (accessor.getRowType() == DataSet.ROW_TYPE_UPDATED){
                	btrDAO.updateUserVO(btr);
                }else if (accessor.getRowType() == DataSet.ROW_TYPE_DELETED){
                	btrDAO.deleteUserVO(btr);
                }
            }
            
        }
    }
    
    
    */
}
