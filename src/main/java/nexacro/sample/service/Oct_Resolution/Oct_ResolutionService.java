package nexacro.sample.service.Oct_Resolution;

import java.util.List;

import nexacro.sample.vo.Oct_SalaryBook.Oct_SalaryBookVO;
import nexacro.sample.vo.Oct_emp.YJB_EmpVO;
import nexacro.sample.vo.Oct_resolution.Oct_ResolutionVO;

public interface Oct_ResolutionService {


	List<nexacro.sample.vo.Oct_resolution.Oct_ResolutionVO> selectOctResolutionVOList(
			Oct_ResolutionVO oct_ResolutionVO);

	List<Oct_SalaryBookVO> Oct_selectSalarybookList(
			Oct_ResolutionVO oct_ResolutionVO);

	void modfiyMultiOctResolutionVO(List<Oct_ResolutionVO> modifyList);

}
