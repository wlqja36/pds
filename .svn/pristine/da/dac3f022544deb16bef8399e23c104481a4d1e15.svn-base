package nexacro.sample.service.impl.atticode;

import java.util.List;

import javax.annotation.Resource;

import nexacro.sample.service.dao.ibatis.atticode.AttiCodeDAO;
import nexacro.sample.service.atticode.AttiCodeService;
import nexacro.sample.vo.atticode.AttiCodeVO;
import nexacro.sample.vo.atticode.VacCodeVO;
import nexacro.sample.vo.vacation.vacationCodeVO;

import org.springframework.stereotype.Service;

import com.nexacro.spring.data.DataSetRowTypeAccessor;
import com.nexacro.xapi.data.DataSet;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("attiCodeService")
public class AttiCodeServiceImpl extends EgovAbstractServiceImpl implements AttiCodeService{
	
	
	@Resource(name="attiCodeDAO")
	AttiCodeDAO attiCodeDAO;
	
	@Override
	public List<AttiCodeVO> loadAttiCodeList() {
		return attiCodeDAO.loadAttiCodeList();
	}
	
	@Override
	public List<VacCodeVO> loadVacCodeList() {
		return attiCodeDAO.loadVacCodeList();
	}
	
	@Override
    public void modifyAttiCodeList(List<AttiCodeVO> attiCodeList) {
        int size = attiCodeList.size();
        for (int i=0; i<size; i++) {
        	AttiCodeVO atticode = attiCodeList.get(i);
            if (atticode instanceof DataSetRowTypeAccessor){
                DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) atticode;
                
                if (accessor.getRowType() == DataSet.ROW_TYPE_INSERTED){
                	System.out.println("===insert  하는중");
                	attiCodeDAO.insertAttiCodeList(atticode);
                
                }else if (accessor.getRowType() == DataSet.ROW_TYPE_UPDATED){
                	System.out.println("===update  하는중");
                	attiCodeDAO.updateAttiCodeList(atticode);
                
                }else if (accessor.getRowType() == DataSet.ROW_TYPE_DELETED){
                	System.out.println("===delete  하는중");
                	attiCodeDAO.deleteAttiCodeList(atticode);
                }
            }
            
        }
    }
}
