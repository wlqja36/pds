package nexacro.sample.service.impl.emp;

import java.util.List;

import javax.annotation.Resource;






import nexacro.sample.service.dao.ibatis.emp.FamilyDAO;
import nexacro.sample.service.emp.FamilyService;
import nexacro.sample.vo.emp.FamilyVO;




import org.springframework.stereotype.Service;

import com.nexacro.spring.data.DataSetRowTypeAccessor;
import com.nexacro.xapi.data.DataSet;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("familyService")
public class FamilyServiceimpl extends EgovAbstractServiceImpl implements FamilyService{
	
	@Resource(name = "familyDAO")
	private FamilyDAO familyDAO;
	
	public List<FamilyVO> selectFamilyVOList(FamilyVO familyVO) {
		
		return familyDAO.selectFamilyVOList(familyVO);
		
	}
	@Override
    public void modifyMultiFamilyVO(List<FamilyVO> modifyList) {

        int size = modifyList.size();
        for (int i=0; i<size; i++) {
        	FamilyVO user = modifyList.get(i);
            if (user instanceof DataSetRowTypeAccessor){
                DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) user;
                
                if (accessor.getRowType() == DataSet.ROW_TYPE_INSERTED){
                	familyDAO.insertFamilyVO(user);
                }else if (accessor.getRowType() == DataSet.ROW_TYPE_UPDATED){
                	familyDAO.updateFamilyVO(user);
                }else if (accessor.getRowType() == DataSet.ROW_TYPE_DELETED){
                	familyDAO.deleteFamilyVO(user);
                }
            }
            
        }
    }

	
	

}
