package nexacro.sample.service.emp;

import java.util.List;

import nexacro.sample.vo.emp.EmpVO;



public interface EmpService {
	
	   List<EmpVO> SelectEmpVOList(EmpVO searchVO);

	void modifyMultiEmpVO(List<EmpVO> modifyList);

}
