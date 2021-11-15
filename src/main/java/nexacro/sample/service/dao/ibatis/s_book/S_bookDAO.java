package nexacro.sample.service.dao.ibatis.s_book;

import java.util.List;

import nexacro.sample.vo.UserVO;
import nexacro.sample.vo.s_bookVO.S_bookVO;
import org.apache.xmlbeans.impl.inst2xsd.SalamiSliceStrategy;
import org.springframework.stereotype.Repository;
import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;

/**
 * Test를 위한 DAO Sample Class
 *
 * @author Park SeongMin
 * @since 08.12.2015
 * @version 1.0
 * @see
 */
@Repository("sbDAO")
public class S_bookDAO extends NexacroIbatisAbstractDAO {

    public List<S_bookVO> selectUserVOList(S_bookVO searchVO) {
        return (List<S_bookVO>) list("s_book.selectbtrVOList", searchVO);
    }
 /*   public List<Btrip_ManagementVO> confirmUserVOList(Btrip_ManagementVO searchVo) {
    	return (List<Btrip_ManagementVO>) list("btrip_management.confirmVOList", searchVo);
    }*/
    public void insertUserVO(S_bookVO sb) {
        insert("s_book.insertbtrVOList", sb);
    }
    
    public void updateUserVO(S_bookVO sb) {
        update("s_book.updatebtrVOList", sb);
    }
    public void deleteUserVO(S_bookVO sb) {
        delete("s_book.deletebtrVOList", sb);
    }
    
    
   
  
	

}
