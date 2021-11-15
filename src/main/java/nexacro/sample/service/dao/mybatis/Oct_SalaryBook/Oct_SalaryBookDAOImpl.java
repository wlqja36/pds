package nexacro.sample.service.dao.mybatis.Oct_SalaryBook;

import java.util.List;



import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import nexacro.sample.vo.Oct_SalaryBook.Oct_SalaryBookVO;
import nexacro.sample.vo.Oct_vacation.Oct_vacationCodeVO;


@Repository("Oct_SalaryBookDAOImpl")
public class Oct_SalaryBookDAOImpl implements Oct_SalaryBookDAO {
	
	@Autowired
	private SqlSessionTemplate sqlsessiontemplate;
	
	
  @Override
public List<Oct_SalaryBookVO> selectOctSalaryBookVOList(Oct_SalaryBookVO searchVO){

	return sqlsessiontemplate.selectList("Oct_SalaryBookMapper.selectOctSalaryBookVO", searchVO);
}
  @Override
	public int insertOctSalaryBookVO(Oct_SalaryBookVO user) {
		return sqlsessiontemplate.insert("Oct_SalaryBookMapper.insertOctSalaryBookVO", user);
	}
  @Override
	public int updateOctSalaryBookVO(Oct_SalaryBookVO user) {
		return sqlsessiontemplate.update("Oct_SalaryBookMapper.updateOctSalaryBookVO", user);
	}
  @Override
	public int deleteOctSalaryBookVO(Oct_SalaryBookVO user)  {
		return sqlsessiontemplate.delete("Oct_SalaryBookMapper.deleteOctSalaryBookVO", user);
	}
  

}
