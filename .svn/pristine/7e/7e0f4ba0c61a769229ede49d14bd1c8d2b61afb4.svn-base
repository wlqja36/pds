package nexacro.sample.service.impl.emp;

import java.util.List;

import javax.annotation.Resource;

import nexacro.sample.service.dao.ibatis.emp.EdulevelDAO;
import nexacro.sample.service.dao.ibatis.emp.LicenseDAO;
import nexacro.sample.service.emp.EdulevelService;
import nexacro.sample.service.emp.LicenseService;
import nexacro.sample.vo.emp.CareerVO;
import nexacro.sample.vo.emp.EdulevelVO;
import nexacro.sample.vo.emp.LicenseVO;

import org.springframework.stereotype.Service;

import com.nexacro.spring.data.DataSetRowTypeAccessor;
import com.nexacro.xapi.data.DataSet;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("licenseService")
public class LicenseServiceimpl extends EgovAbstractServiceImpl implements LicenseService{
	
	@Resource(name = "licenseDAO")
	private LicenseDAO licenseDAO;
	
	public List<LicenseVO> selectLicenseVOList(LicenseVO LicenseVO) {
		
		return licenseDAO.selectLicenseVOList(LicenseVO);
		
	}
	@Override
    public void modifyMultiLicenseVO(List<LicenseVO> modifyList) {

        int size = modifyList.size();
        for (int i=0; i<size; i++) {
        	LicenseVO user = modifyList.get(i);
            if (user instanceof DataSetRowTypeAccessor){
                DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) user;
                
                if (accessor.getRowType() == DataSet.ROW_TYPE_INSERTED){
                	licenseDAO.insertLicenseVO(user);
                }else if (accessor.getRowType() == DataSet.ROW_TYPE_UPDATED){
                	licenseDAO.updateLicenseVO(user);
                }else if (accessor.getRowType() == DataSet.ROW_TYPE_DELETED){
                	licenseDAO.deleteLicenseVO(user);
                }
            }
            
        }
    }

	
	

}
