package nexacro.sample.service.dao.mybatis.Oct_vacation;

import java.util.List;

import nexacro.sample.vo.Oct_vacation.Oct_vacationCodeListVO;


public interface Oct_vacationCodeListDAO {
	int insertOctVacationCodeListVO(Oct_vacationCodeListVO user);
    int updateOctVacationCodeListVO(Oct_vacationCodeListVO user);
    int deleteOctVacationCodeListVO(Oct_vacationCodeListVO user);
	List<Oct_vacationCodeListVO> selectOctVacationCodeListVOList(
			Oct_vacationCodeListVO searchVO);

}
