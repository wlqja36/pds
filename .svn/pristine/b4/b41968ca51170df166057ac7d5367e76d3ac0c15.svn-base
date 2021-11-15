package nexacro.sample.service.dao.ibatis.emp;

import java.util.List;

import nexacro.sample.vo.emp.MilitaryVO;

import org.springframework.stereotype.Repository;

import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;


@Repository("militaryDAO")
public class MilitaryDAO extends NexacroIbatisAbstractDAO{
	
	public List<MilitaryVO> selectMilitaryVOList(MilitaryVO militaryVO){
		return (List<MilitaryVO>) list("selectMilitaryVOList", militaryVO);
		
	}
	public void insertMilitaryVO(MilitaryVO military){
		insert("insertMilitaryVO",military);		
	}

	public void updateMilitaryVO(MilitaryVO military){
		insert("updateMilitaryVO",military);		
	}
	public void deleteMilitaryVO(MilitaryVO military){
		insert("deleteMilitaryVO",military);		
	}

}
