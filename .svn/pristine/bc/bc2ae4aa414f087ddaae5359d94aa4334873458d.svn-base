package nexacro.sample.service.dao.ibatis.emp_appo;

import java.util.List;

import nexacro.sample.vo.emp_appo.Emp_appoVO;

import org.springframework.stereotype.Repository;

import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;

@Repository("Emp_appoDAO")
public class Emp_appoDAO extends NexacroIbatisAbstractDAO{

	//조회
	public List<Emp_appoVO> emp_appoSelectVO(Emp_appoVO searchVO) {
		System.out.println("emp_appoDAO");
		return (List<Emp_appoVO>)list("selectEmp_appo", searchVO);
	}

		public void insertEmp_appo(Emp_appoVO emp_appoMod){
		insert("insertEmp_appo",emp_appoMod);		
	}

	public void updateEmp_appo(Emp_appoVO emp_appoMod){
		insert("updateEmp_appo",emp_appoMod);		
	}
	public void deleteEmp_appo(Emp_appoVO emp_appoMod){
		insert("deleteEmp_appo",emp_appoMod);		
	}
	
}