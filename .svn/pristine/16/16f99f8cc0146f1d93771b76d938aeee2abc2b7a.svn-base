package nexacro.sample.service.dao.ibatis.edu;

import java.util.List;

import nexacro.sample.vo.code.CodeVO;
import nexacro.sample.vo.edu.EduVO;
import nexacro.sample.vo.edu.eduSearchVO;
import nexacro.sample.vo.emp.EmpVO;

import org.springframework.stereotype.Repository;

import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;

@Repository("eduSearchDAO")
public class EduSearchDAO extends NexacroIbatisAbstractDAO{

	//조회
	public List<eduSearchVO> selectEdu2(eduSearchVO searchVO) {
		return (List<eduSearchVO>)list("selectEdu2", searchVO);
	}
	
/*
	public void insertEdu(EduVO eduMod){
		insert("insertEdu",eduMod);		
	}

	public void updateEdu(EduVO eduMod){
		insert("updateEdu",eduMod);		
	}
	public void deleteEdu(EduVO eduMod){
		insert("deleteEdu",eduMod);		
	}*/
	
}