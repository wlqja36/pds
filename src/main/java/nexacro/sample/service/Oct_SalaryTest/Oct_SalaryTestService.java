package nexacro.sample.service.Oct_SalaryTest;

import java.util.List;

import nexacro.sample.vo.Oct_SalaryTest.Oct_SalaryTestVO;

public interface Oct_SalaryTestService {

	List<Oct_SalaryTestVO> selectOctSalaryTestVOList(
			Oct_SalaryTestVO oct_SalaryTestVO);

	void modifyMultiOctSalaryTestVO(List<Oct_SalaryTestVO> modifyList);
	

}
