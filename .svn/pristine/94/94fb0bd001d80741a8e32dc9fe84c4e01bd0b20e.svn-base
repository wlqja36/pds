package nexacro.sample.service.impl.emp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.nexacro.spring.data.DataSetRowTypeAccessor;
import com.nexacro.xapi.data.DataSet;

import nexacro.sample.service.dao.ibatis.emp.Language_abilityDAO;
import nexacro.sample.service.emp.Language_abilityService;
import nexacro.sample.vo.emp.EdulevelVO;
import nexacro.sample.vo.emp.Language_abilityVO;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("language_abilityService")
public class Language_abilityServiceimpl extends EgovAbstractServiceImpl implements Language_abilityService {
	
	@Resource(name = "language_abilityDAO")
	private Language_abilityDAO language_abilityDAO;

	@Override
	public List<Language_abilityVO> selectLanguage_abilityVOList(
			Language_abilityVO language_abilityVO) {
		return language_abilityDAO.selectLanguage_abilityVOList(language_abilityVO);
		
	}
	@Override
    public void modifyMultiLanguage_abilityVO(List<Language_abilityVO> modifyList) {

        int size = modifyList.size();
        for (int i=0; i<size; i++) {
        	Language_abilityVO user = modifyList.get(i);
            if (user instanceof DataSetRowTypeAccessor){
                DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) user;
                
                if (accessor.getRowType() == DataSet.ROW_TYPE_INSERTED){
                	language_abilityDAO.insertLanguage_abilityVO(user);
                }else if (accessor.getRowType() == DataSet.ROW_TYPE_UPDATED){
                	language_abilityDAO.updateLanguage_abilityVO(user);
                }else if (accessor.getRowType() == DataSet.ROW_TYPE_DELETED){
                	language_abilityDAO.deleteLanguage_abilityVO(user);
                }
            }
            
        }
    }
	

}
