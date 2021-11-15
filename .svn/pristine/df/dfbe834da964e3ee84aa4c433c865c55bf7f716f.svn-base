package nexacro.sample.serviceimpl.Oct_btrip;

import java.util.List;

import javax.annotation.Resource;





import nexacro.sample.dao.Oct_btrip.YJB_BtrDAO;
import nexacro.sample.service.Oct_btrip.YJB_BtrService;
import nexacro.sample.vo.Oct_btrip.YJB_Btrip_ManagementVO;

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
@Service("YJB_btrService")
public class YJB_BtrServiceImpl extends EgovAbstractServiceImpl implements YJB_BtrService {

    /**
     * UserDAO class 선언 (UserDAO) Class Injection)
     * (UserDAO)sampleDAO
     */
    // @Autowired(required = false) // Type 정의
    @Resource(name = "YJB_btrDAO")
    // Name 정의
    private YJB_BtrDAO btrDAO;
    
  /*  @Override
    public List<Btrip_ManagementVO> confirmVOList(Btrip_ManagementVO searchVo) {
    	return btrDAO.confirmUserVOList(searchVo);
    }
    */
    @Override
    public List<YJB_Btrip_ManagementVO> selectUserVOList(YJB_Btrip_ManagementVO searchVO) throws Exception {
        return btrDAO.selectUserVOList(searchVO);
    }

    @Override
    public void modifyMultiUserVO(List<YJB_Btrip_ManagementVO> modifyList) throws Exception{

        int size = modifyList.size();
        for (int i=0; i<size; i++) {
        	YJB_Btrip_ManagementVO btr = modifyList.get(i);
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
