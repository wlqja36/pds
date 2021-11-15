package nexacro.sample.service.dao.mybatis.Oct_vacation;

import java.util.List;

import nexacro.sample.vo.Oct_vacation.Oct_vacationCodeListVO;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository("Oct_vacationCodeListDAOImpl")
public class Oct_vacationCodeListDAOImpl implements Oct_vacationCodeListDAO {
	
	@Autowired
	private SqlSessionTemplate sqlsessiontemplate;
	
	
  @Override
public List<Oct_vacationCodeListVO> selectOctVacationCodeListVOList(Oct_vacationCodeListVO searchVO){

	return sqlsessiontemplate.selectList("Oct_VacationCodeListMapper.selectOctVacationCodeListVO", searchVO);
}
  @Override
	public int insertOctVacationCodeListVO(Oct_vacationCodeListVO user) {
		return sqlsessiontemplate.insert("Oct_VacationCodeListMapper.insertOctVacationCodeListVO", user);
	}
  @Override
	public int updateOctVacationCodeListVO(Oct_vacationCodeListVO user) {
		return sqlsessiontemplate.update("Oct_VacationCodeListMapper.updateOctVacationCodeListVO", user);
	}
  @Override
	public int deleteOctVacationCodeListVO(Oct_vacationCodeListVO user)  {
		return sqlsessiontemplate.delete("Oct_VacationCodeListMapper.deleteOctVacationCodeListVO", user);
	}
  

}
