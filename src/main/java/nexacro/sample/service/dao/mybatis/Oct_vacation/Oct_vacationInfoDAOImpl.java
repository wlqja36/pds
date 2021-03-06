package nexacro.sample.service.dao.mybatis.Oct_vacation;

import java.util.List;





import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import nexacro.sample.vo.Oct_vacation.Oct_vacationCodeVO;
import nexacro.sample.vo.Oct_vacation.Oct_vacationInfoVO;

@Repository("Oct_vacationInfoDAOImpl")
public class Oct_vacationInfoDAOImpl implements Oct_vacationInfoDAO {
	
	@Autowired
	private SqlSessionTemplate sqlsessiontemplate;
	
	
  @Override
  	public List<Oct_vacationInfoVO> selectOctVacationInfoVOList(Oct_vacationInfoVO searchVO) {

  		return sqlsessiontemplate.selectList("Oct_VacationInfoMapper.selectOctVacationInfoVO", searchVO);
  	}
  
  @Override
	public int insertOctVacationInfoVO(Oct_vacationInfoVO user){
		return sqlsessiontemplate.insert("Oct_VacationInfoMapper.insertOctVacationInfoVO", user);
	}
  @Override
	public int updateOctVacationInfoVO(Oct_vacationInfoVO user) {
		return sqlsessiontemplate.update("Oct_VacationInfoMapper.updateOctVacationInfoVO", user);
	}
  @Override
	public int deleteOctVacationInfoVO(Oct_vacationInfoVO user) {
		return sqlsessiontemplate.delete("Oct_VacationInfoMapper.deleteOctVacationInfoVO", user);
	}
  

}
