package nexacro.sample.service.impl.emp_appo;

import java.util.List;

import javax.annotation.Resource;

import nexacro.sample.service.dao.ibatis.emp_appo.Emp_appoDAO;
import nexacro.sample.service.emp_appo.EmpAppoService;
import nexacro.sample.vo.emp_appo.Emp_appoVO;

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
@Service("EmpAppoService")
public class Emp_appoServiceImpl extends EgovAbstractServiceImpl implements EmpAppoService {
   
	@Resource(name = "Emp_appoDAO")
    private Emp_appoDAO Emp_appoDAO;
	
	

	@Override
	public List<Emp_appoVO> selectEmp_appoVO(Emp_appoVO searchVO) {
		System.out.println("Emp_appoServiceImpl_searchVO");
		return Emp_appoDAO.emp_appoSelectVO(searchVO);
	}
	




	@Override
	public void modifyMultiEmp_appoVO(List<Emp_appoVO> modifyList) {
		System.out.println("EduServiceImpl_modifyList");
		
		 int size = modifyList.size();
	        for (int i=0; i<size; i++) {
	            Emp_appoVO emp_appoMod = modifyList.get(i);
	            if (emp_appoMod instanceof DataSetRowTypeAccessor){
	                DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) emp_appoMod;
	               System.out.println("accessor.getRowType(): "+accessor.getRowType());
	               System.out.println("accessor.getRowType(): "+accessor.getRowType());
	               System.out.println("accessor.getRowType(): "+accessor.getRowType());
	               System.out.println("accessor.getRowType(): "+accessor.getRowType());
	            
	               System.out.println("DataSet.ROW_TYPE_INSERTED: "+DataSet.ROW_TYPE_INSERTED);
	               System.out.println("DataSet.ROW_TYPE_UPDATED: "+DataSet.ROW_TYPE_UPDATED);
	               System.out.println("DataSet.ROW_TYPE_DELETED: "+DataSet.ROW_TYPE_DELETED);
	                if (accessor.getRowType() == DataSet.ROW_TYPE_INSERTED){
	                    Emp_appoDAO.insertEmp_appo(emp_appoMod);
	                }else if (accessor.getRowType() == DataSet.ROW_TYPE_UPDATED){
	                	Emp_appoDAO.updateEmp_appo(emp_appoMod);
	                }else if (accessor.getRowType() == DataSet.ROW_TYPE_DELETED){
	                	Emp_appoDAO.deleteEmp_appo(emp_appoMod);
	                }
	            }
	            
	        }
		
	}







	
	
	

}