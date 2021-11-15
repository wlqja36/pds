package nexacro.sample.service.emp;

import java.util.List;


import nexacro.sample.vo.emp.Language_abilityVO;



public interface Language_abilityService {
	List<Language_abilityVO> selectLanguage_abilityVOList(Language_abilityVO language_abilityVO);
	void modifyMultiLanguage_abilityVO(List<Language_abilityVO> modifyList);

}
