package nexacro.sample.service.impl.r_standard;

import java.util.List;

import javax.annotation.Resource;

import nexacro.sample.service.btrip_detail.Btr_DetailService;
import nexacro.sample.service.dao.ibatis.btrip_detail.Btr_DetailDAO;
import nexacro.sample.service.dao.ibatis.r_standard.R_standardDAO;
import nexacro.sample.service.r_standard.R_standardService;
import nexacro.sample.vo.btrip_detailVO.Btrip_detailVO;
import nexacro.sample.vo.r_standardVO.R_standardVO;

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
@Service("rsService")
public class R_standardServiceImpl extends EgovAbstractServiceImpl implements R_standardService {

    /**
     * UserDAO class 선언 (UserDAO) Class Injection)
     * (UserDAO)sampleDAO
     */
    // @Autowired(required = false) // Type 정의
    @Resource(name = "rsDAO")
    // Name 정의
    private R_standardDAO rsDAO;

    @Override
    public List<R_standardVO> selectUserVOList(R_standardVO searchVO) {
        return rsDAO.selectUserVOList(searchVO);
    }
    
  
    
    
    @Override
    public void modifyMultiUserVO(List<R_standardVO> modifyList) {

        int size = modifyList.size();
        for (int i=0; i<size; i++) {
        	R_standardVO rs = modifyList.get(i);
            if (rs instanceof DataSetRowTypeAccessor){
                DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) rs;
                
                if (accessor.getRowType() == DataSet.ROW_TYPE_INSERTED){
                	rsDAO.insertUserVO(rs);
                }else if (accessor.getRowType() == DataSet.ROW_TYPE_UPDATED){
                	rsDAO.updateUserVO(rs);
                }else if (accessor.getRowType() == DataSet.ROW_TYPE_DELETED){
                	rsDAO.deleteUserVO(rs);
                }
            }
            
        }
    }
}
