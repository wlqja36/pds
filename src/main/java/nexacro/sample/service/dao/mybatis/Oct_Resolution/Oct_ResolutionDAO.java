package nexacro.sample.service.dao.mybatis.Oct_Resolution;

import java.util.List;

import nexacro.sample.vo.Oct_SalaryBook.Oct_SalaryBookVO;
import nexacro.sample.vo.Oct_emp.YJB_EmpVO;
import nexacro.sample.vo.Oct_resolution.Oct_ResolutionVO;

public interface Oct_ResolutionDAO {


	List<nexacro.sample.vo.Oct_resolution.Oct_ResolutionVO> selectOctResolutionVOList(
			Oct_ResolutionVO oct_ResolutionVO);

	List<Oct_SalaryBookVO> Oct_selectSalarybookList(
			Oct_ResolutionVO oct_ResolutionVO);

	int insertOctResolutionVO(Oct_ResolutionVO oct_ResolutionVO);

	int updateOctResolutionVO(Oct_ResolutionVO oct_ResolutionVO);

	int deleteOctResolutionVO(Oct_ResolutionVO oct_ResolutionVO);


}
