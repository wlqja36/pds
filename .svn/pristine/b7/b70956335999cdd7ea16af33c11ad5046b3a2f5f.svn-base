package nexacro.sample.service.impl.edu;

import java.util.List;

import javax.annotation.Resource;

import nexacro.sample.service.UserService;
import nexacro.sample.service.dao.ibatis.UserDAO;
import nexacro.sample.service.dao.ibatis.edu.EduDAO;
import nexacro.sample.service.edu.EduService;
import nexacro.sample.vo.UserVO;
import nexacro.sample.vo.edu.EduVO;

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
@Service("eduService")
public class EduServiceImpl extends EgovAbstractServiceImpl implements EduService {
   
	@Resource(name = "eduDAO")
    private EduDAO eduDAO;
	
	
	@Override
	public List<EduVO> selectEdu(EduVO searchVO) {
		System.out.println("EduServiceImpl_searchVO");
		return eduDAO.selectEdu(searchVO);
	}


	
	public void modifyMultiEduVO(List<EduVO> modifyList) {
		System.out.println("EduServiceImpl_modifyList");
		
		 int size = modifyList.size();
	        for (int i=0; i<size; i++) {
	            EduVO eduMod = modifyList.get(i);
	            if (eduMod instanceof DataSetRowTypeAccessor){
	                DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) eduMod;
	               System.out.println("accessor.getRowType(): "+accessor.getRowType());
	               System.out.println("accessor.getRowType(): "+accessor.getRowType());
	               System.out.println("accessor.getRowType(): "+accessor.getRowType());
	               System.out.println("accessor.getRowType(): "+accessor.getRowType());
	            
	               System.out.println("DataSet.ROW_TYPE_INSERTED: "+DataSet.ROW_TYPE_INSERTED);
	               System.out.println("DataSet.ROW_TYPE_UPDATED: "+DataSet.ROW_TYPE_UPDATED);
	               System.out.println("DataSet.ROW_TYPE_DELETED: "+DataSet.ROW_TYPE_DELETED);
	                if (accessor.getRowType() == DataSet.ROW_TYPE_INSERTED){
	                    eduDAO.insertEdu(eduMod);
	                }else if (accessor.getRowType() == DataSet.ROW_TYPE_UPDATED){
	                	eduDAO.updateEdu(eduMod);
	                }else if (accessor.getRowType() == DataSet.ROW_TYPE_DELETED){
	                	eduDAO.deleteEdu(eduMod);
	                }
	            }
	            
	        }
	}
	
	
	
	

   /* *//**
     * UserDAO class 선언 (UserDAO) Class Injection)
     * (UserDAO)sampleDAO
     *//*
    // @Autowired(required = false) // Type 정의
    @Resource(name = "userDAO")
    // Name 정의
    private UserDAO userDAO;

    //조회
    @Override
    public List<UserVO> selectUserVOList(UserVO searchVO) {
        return userDAO.selectUserVoList(searchVO);
    }


    @Override
    public void modifyMultiUserVO(List<UserVO> modifyList) {

        int size = modifyList.size();
        for (int i=0; i<size; i++) {
            UserVO user = modifyList.get(i);
            if (user instanceof DataSetRowTypeAccessor){
                DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) user;
                
                if (accessor.getRowType() == DataSet.ROW_TYPE_INSERTED){
                    userDAO.insertUserVO(user);
                }else if (accessor.getRowType() == DataSet.ROW_TYPE_UPDATED){
                    userDAO.updateUserVO(user);
                }else if (accessor.getRowType() == DataSet.ROW_TYPE_DELETED){
                    userDAO.deleteUserVO(user);
                }
            }
            
        }
    }*/
}