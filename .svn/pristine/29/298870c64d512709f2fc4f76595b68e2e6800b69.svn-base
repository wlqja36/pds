package nexacro.sample.service.dao.mybatis.Oct_vacation;

import java.util.List;


import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import nexacro.sample.vo.Oct_vacation.Oct_vacationCodeVO;


@Repository("Oct_vacationDAOImpl")
public class Oct_vacationDAOImpl implements Oct_vacationDAO {
	
	@Autowired
	private SqlSessionTemplate sqlsessiontemplate;
	
	
  @Override
public List<Oct_vacationCodeVO> selectVacationCodeVOList(Oct_vacationCodeVO searchVO){

	return sqlsessiontemplate.selectList("Oct_VacationMapper.selectVacationCodeVO", searchVO);
}
  @Override
	public int insertVacationCodeVO(Oct_vacationCodeVO user) {
		return sqlsessiontemplate.insert("Oct_VacationMapper.insertVacationCodeVO", user);
	}
  @Override
	public int updateVacationCodeVO(Oct_vacationCodeVO user) {
		return sqlsessiontemplate.update("Oct_VacationMapper.updateVacationCodeVO", user);
	}
  @Override
	public int deleteVacationCodeVO(Oct_vacationCodeVO user)  {
		return sqlsessiontemplate.delete("Oct_VacationMapper.deleteVacationCodeVO", user);
	}
  

}
