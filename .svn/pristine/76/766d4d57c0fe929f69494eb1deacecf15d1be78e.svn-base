package nexacro.sample.service.impl.Oct_SalaryTest;

import java.util.List;

import javax.annotation.Resource;

import nexacro.sample.service.Oct_SalaryTest.Oct_SalaryTestService;
import nexacro.sample.service.btrip_detail.Btr_DetailService;
import nexacro.sample.service.dao.ibatis.btrip_detail.Btr_DetailDAO;
import nexacro.sample.service.dao.ibatis.r_standard.R_standardDAO;
import nexacro.sample.service.dao.mybatis.Oct_SalaryTest.Oct_SalaryTestDAO;
import nexacro.sample.service.r_standard.R_standardService;
import nexacro.sample.vo.Oct_SalaryTest.Oct_SalaryTestVO;
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
@Service("Oct_SalaryTestService")
public class Oct_SalaryTestServiceImpl extends EgovAbstractServiceImpl implements Oct_SalaryTestService {

    /**
     * UserDAO class 선언 (UserDAO) Class Injection)
     * (UserDAO)sampleDAO
     */
    // @Autowired(required = false) // Type 정의
    @Resource(name = "Oct_SalaryTestDAOImpl")
    // Name 정의
    private Oct_SalaryTestDAO Oct_SalaryTestDAO;

    @Override
    public List<Oct_SalaryTestVO> selectOctSalaryTestVOList(Oct_SalaryTestVO Oct_SalaryTestVO) {
        return Oct_SalaryTestDAO.selectOctSalaryTestVOList(Oct_SalaryTestVO);
    }
    
  
    
    
    @Override
    public void modifyMultiOctSalaryTestVO(List<Oct_SalaryTestVO> modifyList) {

        int size = modifyList.size();
        for (int i=0; i<size; i++) {
        	Oct_SalaryTestVO rs = modifyList.get(i);
            if (rs instanceof DataSetRowTypeAccessor){
                DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) rs;
                
                if (accessor.getRowType() == DataSet.ROW_TYPE_INSERTED){
                	Oct_SalaryTestDAO.insertOctSalaryTestVO(rs);
                }else if (accessor.getRowType() == DataSet.ROW_TYPE_UPDATED){
                	Oct_SalaryTestDAO.updateOctSalaryTestVO(rs);
                }else if (accessor.getRowType() == DataSet.ROW_TYPE_DELETED){
                	Oct_SalaryTestDAO.deleteOctSalaryTestVO(rs);
                }
            }
            
        }
    }
}
