package nexacro.sample.service.impl.emp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.nexacro.spring.data.DataSetRowTypeAccessor;
import com.nexacro.xapi.data.DataSet;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import nexacro.sample.service.dao.ibatis.emp.EmpDAO;
import nexacro.sample.service.emp.EmpService;
import nexacro.sample.vo.UserVO;
import nexacro.sample.vo.emp.EmpVO;


@Service("empService")
public class EmpServiceimpl extends EgovAbstractServiceImpl implements EmpService{

	@Resource(name = "empDAO")
	private EmpDAO empDAO;
	@Override
	public List<EmpVO> SelectEmpVOList(EmpVO searchVO) {
		
		return empDAO.selectEmpVoList(searchVO);
	}
	
	@Override
    public void modifyMultiEmpVO(List<EmpVO> modifyList) {

        int size = modifyList.size();
        for (int i=0; i<size; i++) {
        	EmpVO user = modifyList.get(i);
            if (user instanceof DataSetRowTypeAccessor){
                DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) user;
                
                if (accessor.getRowType() == DataSet.ROW_TYPE_INSERTED){
                	empDAO.insertEmpVO(user);
                }else if (accessor.getRowType() == DataSet.ROW_TYPE_UPDATED){
                	System.out.println("여기는  인사 업데이트");
                	empDAO.updateEmpVO(user);
                }else if (accessor.getRowType() == DataSet.ROW_TYPE_DELETED){
                	empDAO.deleteEmpVO(user);
                }
            }
            
        }
    }
	
	
	

}
