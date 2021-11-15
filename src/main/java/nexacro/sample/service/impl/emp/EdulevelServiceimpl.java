package nexacro.sample.service.impl.emp;

import java.util.List;

import javax.annotation.Resource;

import nexacro.sample.service.dao.ibatis.emp.EdulevelDAO;
import nexacro.sample.service.emp.EdulevelService;
import nexacro.sample.vo.emp.CareerVO;
import nexacro.sample.vo.emp.EdulevelVO;

import org.springframework.stereotype.Service;

import com.nexacro.spring.data.DataSetRowTypeAccessor;
import com.nexacro.xapi.data.DataSet;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("edulevelService")
public class EdulevelServiceimpl extends EgovAbstractServiceImpl implements EdulevelService{
	
	@Resource(name = "edulevelDAO")
	private EdulevelDAO edulevelDAO;
	
	public List<EdulevelVO> selectEdulevelVOList(EdulevelVO edulevelVO) {
		
		return edulevelDAO.selectEdulevelVOList(edulevelVO);
		
	}
	@Override
    public void modifyMultiEdulevelVO(List<EdulevelVO> modifyList) {

        int size = modifyList.size();
        for (int i=0; i<size; i++) {
        	EdulevelVO user = modifyList.get(i);
            if (user instanceof DataSetRowTypeAccessor){
                DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) user;
                
                if (accessor.getRowType() == DataSet.ROW_TYPE_INSERTED){
                	edulevelDAO.insertEdulevelVO(user);
                }else if (accessor.getRowType() == DataSet.ROW_TYPE_UPDATED){
                	edulevelDAO.updateEdulevelVO(user);
                }else if (accessor.getRowType() == DataSet.ROW_TYPE_DELETED){
                	edulevelDAO.deleteEdulevelVO(user);
                }
            }
            
        }
    }

	
	

}
