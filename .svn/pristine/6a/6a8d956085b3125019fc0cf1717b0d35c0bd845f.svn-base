package nexacro.sample.service.dao.ibatis.emp;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;



import nexacro.sample.vo.emp.FamilyVO;
import nexacro.sample.vo.emp.LicenseVO;

@Repository("familyDAO")
public class FamilyDAO extends NexacroIbatisAbstractDAO{
	
	public List<FamilyVO> selectFamilyVOList(FamilyVO familyVO){
		return (List<FamilyVO>) list("selectFamilyVOList", familyVO);
		
	}
	public void insertFamilyVO(FamilyVO family){
		insert("insertFamilyVO",family);		
	}

	public void updateFamilyVO(FamilyVO family){
		insert("updateFamilyVO",family);		
	}
	public void deleteFamilyVO(FamilyVO family){
		insert("deleteFamilyVO",family);		
	}

}
