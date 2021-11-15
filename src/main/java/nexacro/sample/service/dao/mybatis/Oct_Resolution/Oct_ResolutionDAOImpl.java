package nexacro.sample.service.dao.mybatis.Oct_Resolution;

import java.util.List;





import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import nexacro.sample.vo.Oct_SalaryBook.Oct_SalaryBookVO;
import nexacro.sample.vo.Oct_emp.YJB_EmpVO;
import nexacro.sample.vo.Oct_resolution.Oct_ResolutionVO;
import nexacro.sample.vo.Oct_vacation.Oct_vacationCodeVO;


@Repository("Oct_ResolutionDAOImpl")
public class Oct_ResolutionDAOImpl implements Oct_ResolutionDAO {
	
	@Autowired
	private SqlSessionTemplate sqlsessiontemplate;
	
	
  @Override
  public List<Oct_ResolutionVO> selectOctResolutionVOList(Oct_ResolutionVO searchVO){

	  	return sqlsessiontemplate.selectList("Oct_ResolutionMapper.selectOctResolutionVOList", searchVO);
	}
  @Override
  public List<Oct_SalaryBookVO> Oct_selectSalarybookList(Oct_ResolutionVO searchVO){

	  	return sqlsessiontemplate.selectList("Oct_ResolutionMapper.Oct_selectSalarybookList", searchVO);
	}
  
  @Override
	public int insertOctResolutionVO(Oct_ResolutionVO user) {
		return sqlsessiontemplate.insert("Oct_ResolutionMapper.insertOctResolutionVO", user);
	}
  @Override
	public int updateOctResolutionVO(Oct_ResolutionVO user) {
		return sqlsessiontemplate.update("Oct_ResolutionMapper.updateOctResolutionVO", user);
	}
  @Override
	public int deleteOctResolutionVO(Oct_ResolutionVO user)  {
		return sqlsessiontemplate.delete("Oct_ResolutionMapper.deleteOctResolutionVO", user);
	}
  

}
