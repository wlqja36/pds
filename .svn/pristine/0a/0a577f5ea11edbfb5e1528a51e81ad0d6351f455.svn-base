package nexacro.sample.service.dao.ibatis.emp;

import java.util.List;





import nexacro.sample.vo.emp.EdulevelVO;
import nexacro.sample.vo.emp.Language_abilityVO;

import org.springframework.stereotype.Repository;

import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;

@Repository("language_abilityDAO")
public class Language_abilityDAO extends NexacroIbatisAbstractDAO{
	
	public List<Language_abilityVO> selectLanguage_abilityVOList(Language_abilityVO language_abilityVO){
		return (List<Language_abilityVO>) list("selectLanguage_abilityVOList", language_abilityVO);
		
	}

	public void insertLanguage_abilityVO(Language_abilityVO lang_ability){
		insert("insertLanguage_abilityVO",lang_ability);		
	}

	public void updateLanguage_abilityVO(Language_abilityVO lang_ability){
		insert("updateLanguage_abilityVO",lang_ability);		
	}
	public void deleteLanguage_abilityVO(Language_abilityVO lang_ability){
		insert("deleteLanguage_abilityVO",lang_ability);		
	}
}
