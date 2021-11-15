package nexacro.sample.service.vacation;

import java.util.List;

import nexacro.sample.vo.vacation.vacationCodeVO;

public interface vacationSerivce {

	List<vacationCodeVO> selectVacationCodeVOList(vacationCodeVO vacationcodeVO);
	
	void modfiyMultiVacationCodeVO(List<vacationCodeVO> modifyList);
	
}
