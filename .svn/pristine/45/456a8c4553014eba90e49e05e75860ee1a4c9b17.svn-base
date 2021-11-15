package nexacro.sample.service.dao.mybatis.Oct_SalaryTest;

import java.util.List;



import nexacro.sample.vo.Oct_SalaryTest.Oct_SalaryTestVO;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("Oct_SalaryTestDAOImpl")
public class Oct_SalaryTestDAOImpl implements Oct_SalaryTestDAO {
	
	@Autowired
	private SqlSessionTemplate sqlsessiontemplate;
	
	
  @Override
public List<Oct_SalaryTestVO> selectOctSalaryTestVOList(Oct_SalaryTestVO searchVO){

	return sqlsessiontemplate.selectList("Oct_SalaryTestMapper.selectOctSalaryTestVO", searchVO);
}
  @Override
	public int insertOctSalaryTestVO(Oct_SalaryTestVO user) {
		return sqlsessiontemplate.insert("Oct_SalaryTestMapper.insertOctSalaryTestVO", user);
	}
  @Override
	public int updateOctSalaryTestVO(Oct_SalaryTestVO user) {
		return sqlsessiontemplate.update("Oct_SalaryTestMapper.updateOctSalaryTestVO", user);
	}
  @Override
	public int deleteOctSalaryTestVO(Oct_SalaryTestVO user)  {
		return sqlsessiontemplate.delete("Oct_SalaryTestMapper.deleteOctSalaryTestVO", user);
	}
  

}