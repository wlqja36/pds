package nexacro.sample.service.dao.ibatis.r_standard;

import java.util.List;

import nexacro.sample.vo.UserVO;
import nexacro.sample.vo.btripVO.Btrip_ManagementVO;
import nexacro.sample.vo.btrip_detailVO.Btrip_detailVO;
import nexacro.sample.vo.r_standardVO.R_standardVO;

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
@Repository("rsDAO")
public class R_standardDAO extends NexacroIbatisAbstractDAO {

    public List<R_standardVO> selectUserVOList(R_standardVO searchVO) {
        return (List<R_standardVO>) list("r_standard.selectbtrVOList", searchVO);
    }
   
    public void insertUserVO(R_standardVO rs) {
        insert("r_standard.insertbtrVOList", rs);
    }
    
    public void updateUserVO(R_standardVO rs) {
        update("r_standard.updatebtrVOList",rs);
    }
    public void deleteUserVO(R_standardVO rs) {
        delete("r_standard.deletebtrVOList", rs);
    }
    

}
