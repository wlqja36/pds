package nexacro.sample.serviceimpl.Oct_btrip;

import java.util.List;

import javax.annotation.Resource;

import nexacro.sample.dao.Oct_btrip.YJB_Btr_DetailDAO;
import nexacro.sample.service.Oct_btrip.YJB_Btr_DetailService;
import nexacro.sample.vo.Oct_btrip.YJB_Btrip_detailVO;

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
@Service("YJB_btr_DetailService")
public class YJB_Btr_DetailServiceImpl extends EgovAbstractServiceImpl implements YJB_Btr_DetailService {

    /**
     * UserDAO class 선언 (UserDAO) Class Injection)
     * (UserDAO)sampleDAO
     */
    // @Autowired(required = false) // Type 정의
    @Resource(name = "YJB_btr_DetailDAO")
    // Name 정의
    private YJB_Btr_DetailDAO btr_DetailDAO;

    @Override
    public List<YJB_Btrip_detailVO> selectUserVOList(YJB_Btrip_detailVO searchVO) throws Exception {
        return btr_DetailDAO.selectUserVOList(searchVO);
    }
    
  
    
    
    @Override
    public void modifyMultiUserVO(List<YJB_Btrip_detailVO> modifyList) throws Exception {

        int size = modifyList.size();
        for (int i=0; i<size; i++) {
        	YJB_Btrip_detailVO btrdetail = modifyList.get(i);
            if (btrdetail instanceof DataSetRowTypeAccessor){
                DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) btrdetail;
                
                if (accessor.getRowType() == DataSet.ROW_TYPE_INSERTED){
                	btr_DetailDAO.insertUserVO(btrdetail);
                }else if (accessor.getRowType() == DataSet.ROW_TYPE_UPDATED){
                	btr_DetailDAO.updateUserVO(btrdetail);
                }else if (accessor.getRowType() == DataSet.ROW_TYPE_DELETED){
                	btr_DetailDAO.deleteUserVO(btrdetail);
                }
            }
            
        }
    }
}
