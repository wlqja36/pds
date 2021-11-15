package nexacro.sample.service;

import java.util.List;

import nexacro.sample.vo.emp.EmpVO;
import nexacro.sample.vo.resolution.ResCodeVO;
import nexacro.sample.vo.resolution.ResolutionVO;
import nexacro.sample.vo.s_bookVO.S_bookVO;

public interface ResolutionService {
	
	List<ResolutionVO> loadResList(ResolutionVO empNo);

	List<ResolutionVO> selectResList(ResolutionVO empNo);

	List<EmpVO> loadEmpInfo(ResolutionVO empNo);
	
	List<S_bookVO> selectds_S_BookCode(ResolutionVO searchInfo);

	List<EmpVO> selectEmpList();
	
	List<ResCodeVO> loadResCode();
	
	void modifyResList(List<ResolutionVO> resList);
}
