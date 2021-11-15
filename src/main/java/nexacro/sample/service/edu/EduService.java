package nexacro.sample.service.edu;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import nexacro.sample.service.dao.ibatis.UserDAO;
import nexacro.sample.service.dao.ibatis.edu.EduDAO;
import nexacro.sample.vo.UserVO;
import nexacro.sample.vo.com.ComCodeVO;
import nexacro.sample.vo.com.DetailCodeVO;
import nexacro.sample.vo.edu.EduVO;
import nexacro.sample.vo.emp_eval.EmpEvalVO;


public interface EduService {
	
	List<EduVO> selectEdu(EduVO searchVO);	
	
	void modifyMultiEduVO(List<EduVO> modifyList);
	
}
