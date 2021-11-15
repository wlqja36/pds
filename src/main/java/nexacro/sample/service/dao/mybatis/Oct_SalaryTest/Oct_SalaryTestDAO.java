package nexacro.sample.service.dao.mybatis.Oct_SalaryTest;

import java.util.List;

import nexacro.sample.vo.Oct_SalaryTest.Oct_SalaryTestVO;

public interface Oct_SalaryTestDAO {

	List<Oct_SalaryTestVO> selectOctSalaryTestVOList(
			Oct_SalaryTestVO searchVO);

	int insertOctSalaryTestVO(Oct_SalaryTestVO user);

	int updateOctSalaryTestVO(Oct_SalaryTestVO user);

	int deleteOctSalaryTestVO(Oct_SalaryTestVO user);

}
