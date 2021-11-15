package nexacro.sample.serviceimpl.Oct_emp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;






import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import nexacro.sample.dao.Oct_emp.YJB_EmpDAO;
import nexacro.sample.service.Oct_emp.YJB_EmpService;
import nexacro.sample.vo.Oct_emp.YJB_EmpVO;


@Service("YJB_empService")
public class YJB_EmpServiceimpl extends EgovAbstractServiceImpl implements YJB_EmpService{

	@Resource(name = "YJB_empDAOimpl")
	private YJB_EmpDAO empDAO;
	@Override
	public List<YJB_EmpVO> yjb_selectEmpVOList(YJB_EmpVO searchVO) throws Exception {
			return empDAO.yjb_selectEmpVoList(searchVO);
	}
}
