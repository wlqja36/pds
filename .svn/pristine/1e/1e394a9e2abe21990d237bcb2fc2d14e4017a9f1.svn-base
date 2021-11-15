package nexacro.sample.service.impl.btrip;

import java.util.List;

import javax.annotation.Resource;

import nexacro.sample.service.UserService;
import nexacro.sample.service.btrip.BtrService;
import nexacro.sample.service.dao.ibatis.UserDAO;
import nexacro.sample.service.dao.ibatis.btrip.BtrDAO;
import nexacro.sample.vo.UserVO;
import nexacro.sample.vo.btripVO.Btrip_ManagementVO;
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
@Service("btrService")
public class BtrServiceImpl extends EgovAbstractServiceImpl implements BtrService {

    /**
     * UserDAO class 선언 (UserDAO) Class Injection)
     * (UserDAO)sampleDAO
     */
    // @Autowired(required = false) // Type 정의
    @Resource(name = "btrDAO")
    // Name 정의
    private BtrDAO btrDAO;
    
  /*  @Override
    public List<Btrip_ManagementVO> confirmVOList(Btrip_ManagementVO searchVo) {
    	return btrDAO.confirmUserVOList(searchVo);
    }
    */
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
}
