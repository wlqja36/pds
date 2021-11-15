package nexacro.sample.service.emp;

import java.util.List;




import nexacro.sample.vo.emp.CareerVO;
import nexacro.sample.vo.emp.EdulevelVO;
import nexacro.sample.vo.emp.LicenseVO;

public interface LicenseService {
	List<LicenseVO> selectLicenseVOList(LicenseVO licenseVO);
	void modifyMultiLicenseVO(List<LicenseVO> modifyList);
}
