package nexacro.sample.service.vacation;

import java.util.List;

import nexacro.sample.vo.emp_eval.EmpEvalVO;
import nexacro.sample.vo.vacation.vacationInfoVO;

public interface vacationInfoService {

	List<vacationInfoVO> selectVacationInfoVOList(vacationInfoVO vacationInfoVO);
	
	List<vacationInfoVO> selectVacationInfoJoinList(vacationInfoVO vacationInfoVO);
	
/*	List<vacationInfoVO> selectVacationModList(vacationInfoVO vacationInfoVO);*/

	
	
	void modfiyMultiVacationInfoVO(List<vacationInfoVO> modifyList);
	
	

}
