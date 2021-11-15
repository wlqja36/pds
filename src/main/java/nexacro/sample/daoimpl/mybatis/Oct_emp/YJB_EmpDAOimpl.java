package nexacro.sample.daoimpl.mybatis.Oct_emp;

import java.util.List;

import nexacro.sample.dao.Oct_emp.YJB_EmpDAO;
import nexacro.sample.vo.Oct_emp.YJB_EmpVO;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("YJB_empDAOimpl")
public class YJB_EmpDAOimpl implements YJB_EmpDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public List<YJB_EmpVO> yjb_selectEmpVoList(YJB_EmpVO searchVO) throws Exception {
        return sqlSessionTemplate.selectList("yjb_selectEmpVoList", searchVO);
    }
	
	
}
