package nexacro.sample.service.impl.emp;

import java.util.List;

import javax.annotation.Resource;






import nexacro.sample.service.dao.ibatis.emp.MilitaryDAO;
import nexacro.sample.service.emp.MilitaryService;
import nexacro.sample.vo.emp.MilitaryVO;

import org.springframework.stereotype.Service;

import com.nexacro.spring.data.DataSetRowTypeAccessor;
import com.nexacro.xapi.data.DataSet;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("militaryService")
public class MilitaryServiceimpl extends EgovAbstractServiceImpl implements MilitaryService{
	
	@Resource(name = "militaryDAO")
	private MilitaryDAO militaryDAO;
	
	public List<MilitaryVO> selectMilitaryVOList(MilitaryVO militaryVO) {
		
		return militaryDAO.selectMilitaryVOList(militaryVO);
		
	}
	@Override
    public void modifyMultiMilitaryVO(List<MilitaryVO> modifyList) {

        int size = modifyList.size();
        for (int i=0; i<size; i++) {
        	MilitaryVO user = modifyList.get(i);
            if (user instanceof DataSetRowTypeAccessor){
                DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) user;
                
                if (accessor.getRowType() == DataSet.ROW_TYPE_INSERTED){
                	militaryDAO.insertMilitaryVO(user);
                }else if (accessor.getRowType() == DataSet.ROW_TYPE_UPDATED){
                	militaryDAO.updateMilitaryVO(user);
                }else if (accessor.getRowType() == DataSet.ROW_TYPE_DELETED){
                	militaryDAO.deleteMilitaryVO(user);
                }
            }
            
        }
    }

	
	

}
