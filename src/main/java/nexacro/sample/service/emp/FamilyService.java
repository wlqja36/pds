package nexacro.sample.service.emp;

import java.util.List;





import nexacro.sample.vo.emp.CareerVO;
import nexacro.sample.vo.emp.EdulevelVO;
import nexacro.sample.vo.emp.FamilyVO;
import nexacro.sample.vo.emp.LicenseVO;

public interface FamilyService {
	List<FamilyVO> selectFamilyVOList(FamilyVO familyVO);
	void modifyMultiFamilyVO(List<FamilyVO> modifyList);
}
