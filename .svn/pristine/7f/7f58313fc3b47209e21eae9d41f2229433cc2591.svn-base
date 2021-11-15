package nexacro.sample.service.dao.ibatis.emp;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;



import nexacro.sample.vo.emp.CareerVO;
import nexacro.sample.vo.emp.EdulevelVO;

@Repository("edulevelDAO")
public class EdulevelDAO extends NexacroIbatisAbstractDAO{
	
	public List<EdulevelVO> selectEdulevelVOList(EdulevelVO edulevelVO){
		return (List<EdulevelVO>) list("selectEdulevelVOList", edulevelVO);
		
	}
	public void insertEdulevelVO(EdulevelVO edulevel){
		insert("insertEdulevelVO",edulevel);		
	}

	public void updateEdulevelVO(EdulevelVO edulevel){
		insert("updateEdulevelVO",edulevel);		
	}
	public void deleteEdulevelVO(EdulevelVO edulevel){
		insert("deleteEdulevelVO",edulevel);		
	}

}
