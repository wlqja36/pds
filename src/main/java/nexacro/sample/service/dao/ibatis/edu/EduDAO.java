package nexacro.sample.service.dao.ibatis.edu;

import java.util.List;

import nexacro.sample.vo.code.CodeVO;
import nexacro.sample.vo.edu.EduVO;
import nexacro.sample.vo.emp.EmpVO;

import org.springframework.stereotype.Repository;

import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;

@Repository("eduDAO")
public class EduDAO extends NexacroIbatisAbstractDAO{

	//조회
	public List<EduVO> selectEdu(EduVO searchVO) {
		System.out.println("EduDAO");
		return (List<EduVO>)list("selectEdu", searchVO);
	}

		public void insertEdu(EduVO eduMod){
		insert("insertEdu",eduMod);		
	}

	public void updateEdu(EduVO eduMod){
		insert("updateEdu",eduMod);		
	}
	public void deleteEdu(EduVO eduMod){
		insert("deleteEdu",eduMod);		
	}
	

	
}