package nexacro.sample.service.impl.attitude;

import java.util.List;

import javax.annotation.Resource;

import nexacro.sample.service.attitude.AttitudeService;
import nexacro.sample.service.dao.ibatis.attitude.AttitudeDAO;
import nexacro.sample.vo.attitudeVO.AttitudeBookVO;
import nexacro.sample.vo.attitudeVO.AttitudeVO;

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
@Service("attitudeService")
public class AttitudeServiceImpl extends EgovAbstractServiceImpl implements AttitudeService {

  
    // @Autowired(required = false) // Type 정의
    @Resource(name = "attitudeDAO")
    // Name 정의
    private AttitudeDAO attitudeDAO;

    
    
    
    
    
	@Override
	public void modifyMultiAttitudeVO(List<AttitudeVO> modifyList) {
		
		
		 int size = modifyList.size();
	        for (int i=0; i<size; i++) {
	            AttitudeVO attitude = modifyList.get(i);
	            if (attitude instanceof DataSetRowTypeAccessor){
	                DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) attitude;
	                
	                if (accessor.getRowType() == DataSet.ROW_TYPE_INSERTED){
	                	attitudeDAO.insertAttitudeVO(attitude);
	                }else if (accessor.getRowType() == DataSet.ROW_TYPE_UPDATED){
	                	attitudeDAO.updateAttitudeVO(attitude);
	                }else if (accessor.getRowType() == DataSet.ROW_TYPE_DELETED){
	                	attitudeDAO.deleteAttitudeVO(attitude);
	                }
	            }
	            
	        }
		
	}



	@Override
	public List<AttitudeVO> selectAttitudeVOList(AttitudeVO searchVO) {
		
		return attitudeDAO.selectAttitudeVOList(searchVO);
	}



	@Override
	public int selectVacationLeft(AttitudeVO searchVO) {
		
		return attitudeDAO.selectVacationLeft(searchVO);
	}



    
    
    
   
}
