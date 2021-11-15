package nexacro.sample.service.impl.edu;

import java.util.List;

import javax.annotation.Resource;

import nexacro.sample.service.UserService;
import nexacro.sample.service.dao.ibatis.UserDAO;
import nexacro.sample.service.dao.ibatis.edu.EduDAO;
import nexacro.sample.service.dao.ibatis.edu.EduSearchDAO;
import nexacro.sample.service.edu.EduSearchService;
import nexacro.sample.service.edu.EduService;
import nexacro.sample.vo.UserVO;
import nexacro.sample.vo.edu.EduVO;
import nexacro.sample.vo.edu.eduSearchVO;

import org.springframework.stereotype.Service;

import com.nexacro.spring.data.DataSetRowTypeAccessor;
import com.nexacro.xapi.data.DataSet;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

/**
 * Test를 위한 ServiceImpl Sample Class
 *
 * @author Park SeongMin
 * @since 08.12.2015
 * @version 1.0
 * @see
 */
@Service("eduSearchService")
public class EduSearchServiceImpl extends EgovAbstractServiceImpl implements EduSearchService {
   
	@Resource(name = "eduSearchDAO")
    private EduSearchDAO eduSearchDAO;
	
	
	@Override
	public List<eduSearchVO> selectEdu2(eduSearchVO searchVO) {
		return eduSearchDAO.selectEdu2(searchVO);
	}
}


	
	
	
	

