package nexacro.sample.service.emp;

import java.util.List;

import nexacro.sample.vo.emp.MilitaryVO;




public interface MilitaryService {
	List<MilitaryVO> selectMilitaryVOList(MilitaryVO militaryVO);
	void modifyMultiMilitaryVO(List<MilitaryVO> modifyList);
}
