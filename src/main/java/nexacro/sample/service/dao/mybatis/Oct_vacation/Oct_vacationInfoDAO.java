package nexacro.sample.service.dao.mybatis.Oct_vacation;

import java.util.List;

import nexacro.sample.vo.Oct_vacation.Oct_vacationCodeVO;
import nexacro.sample.vo.Oct_vacation.Oct_vacationInfoVO;

public interface Oct_vacationInfoDAO {

	 int insertOctVacationInfoVO(Oct_vacationInfoVO user);
	 int updateOctVacationInfoVO(Oct_vacationInfoVO user);
	 int deleteOctVacationInfoVO(Oct_vacationInfoVO user);
	 List<Oct_vacationInfoVO> selectOctVacationInfoVOList(
				Oct_vacationInfoVO searchVO);
//	 List<Oct_vacationInfoVO> selectOctVacationInfoJoinList(
//				Oct_vacationInfoVO searchVO);
//	 String selectOctVacaitonJoinVO(
//				Oct_vacationInfoVO searchVO);
	
	

}
