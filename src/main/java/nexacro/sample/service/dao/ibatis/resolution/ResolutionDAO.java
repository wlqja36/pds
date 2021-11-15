package nexacro.sample.service.dao.ibatis.resolution;

import java.util.List;

import nexacro.sample.vo.atticode.AttiCodeVO;
import nexacro.sample.vo.emp.EmpVO;
import nexacro.sample.vo.resolution.ResCodeVO;
import nexacro.sample.vo.resolution.ResolutionVO;
import nexacro.sample.vo.s_bookVO.S_bookVO;

import org.springframework.stereotype.Repository;

import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;

@Repository("resolutionDAO")
public class ResolutionDAO extends NexacroIbatisAbstractDAO{
	
	public List<ResolutionVO> loadResList(ResolutionVO empNo){
		return (List<ResolutionVO>) list("loadResList", empNo);
	}
	
	public List<ResolutionVO> selectResList(ResolutionVO empNo){
		return (List<ResolutionVO>) list("selectResList", empNo);
	}

	public List<EmpVO> loadEmpInfo(ResolutionVO empNo){
		return (List<EmpVO>) list("loadEmpInfo", empNo);
	}

	public List<S_bookVO> selectds_S_BookCode(ResolutionVO searchInfo){
		return (List<S_bookVO>) list("selectds_S_BookCode", searchInfo);
	}

	public List<EmpVO> selectEmpList(){
		return (List<EmpVO>) list("selectEmpList");
	}
	
	public List<ResCodeVO> loadResCode(){
		return (List<ResCodeVO>) list("loadResCode");
	}
	
	public void insertResList(ResolutionVO empNo){
		insert("insertResList", empNo);
	}
	public void updateResList(ResolutionVO empNo){
		update("updateResList", empNo);
	}
	public void deleteResList(ResolutionVO empNo){
		delete("deleteResList", empNo);
	}
	
}
