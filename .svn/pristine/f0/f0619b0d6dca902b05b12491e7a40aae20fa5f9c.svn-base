package nexacro.sample.service.dao.ibatis.emp;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;


import nexacro.sample.vo.emp.LicenseVO;

@Repository("licenseDAO")
public class LicenseDAO extends NexacroIbatisAbstractDAO{
	
	public List<LicenseVO> selectLicenseVOList(LicenseVO licenseVO){
		return (List<LicenseVO>) list("selectLicenseVOList", licenseVO);
		
	}
	public void insertLicenseVO(LicenseVO license){
		insert("insertLicenseVO",license);		
	}

	public void updateLicenseVO(LicenseVO license){
		insert("updateLicenseVO",license);		
	}
	public void deleteLicenseVO(LicenseVO license){
		insert("deleteLicenseVO",license);		
	}

}
