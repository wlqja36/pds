package nexacro.sample.service.impl.btrip_detail;

import java.util.List;

import javax.annotation.Resource;

import nexacro.sample.service.btrip_detail.Btr_DetailService;
import nexacro.sample.service.dao.ibatis.btrip_detail.Btr_DetailDAO;
import nexacro.sample.vo.btrip_detailVO.Btrip_detailVO;

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
@Service("btr_DetailService")
public class Btr_DetailServiceImpl extends EgovAbstractServiceImpl implements Btr_DetailService {

    /**
     * UserDAO class 선언 (UserDAO) Class Injection)
     * (UserDAO)sampleDAO
     */
    // @Autowired(required = false) // Type 정의
    @Resource(name = "btr_DetailDAO")
    // Name 정의
    private Btr_DetailDAO btr_DetailDAO;

    @Override
    public List<Btrip_detailVO> selectUserVOList(Btrip_detailVO searchVO) {
        return btr_DetailDAO.selectUserVOList(searchVO);
    }
    
  
    
    
    @Override
    public void modifyMultiUserVO(List<Btrip_detailVO> modifyList) {

        int size = modifyList.size();
        for (int i=0; i<size; i++) {
        	Btrip_detailVO btrdetail = modifyList.get(i);
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
