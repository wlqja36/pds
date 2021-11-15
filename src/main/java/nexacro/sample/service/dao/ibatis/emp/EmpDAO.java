package nexacro.sample.service.dao.ibatis.emp;

import java.util.List;

import nexacro.sample.vo.emp.EmpVO;

import org.springframework.stereotype.Repository;

import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;

@Repository("empDAO")
public class EmpDAO extends NexacroIbatisAbstractDAO {
	
	public List<EmpVO> selectEmpVoList(EmpVO searchVO) {
        return (List<EmpVO>) list("selectEmpVOList", searchVO);
    }
	
	public void insertEmpVO(EmpVO emp){
		insert("insertEmpVO",emp);		
	}

	public void updateEmpVO(EmpVO emp){
		insert("updateEmpVO",emp);		
	}
	public void deleteEmpVO(EmpVO emp){
		insert("deleteEmpVO",emp);		
	}
	
	

}
