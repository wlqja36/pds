package nexacro.sample.service.dao.ibatis.btrip_detail;

import java.util.List;

import nexacro.sample.vo.UserVO;
import nexacro.sample.vo.btripVO.Btrip_ManagementVO;
import nexacro.sample.vo.btrip_detailVO.Btrip_detailVO;

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
@Repository("btr_DetailDAO")
public class Btr_DetailDAO extends NexacroIbatisAbstractDAO {

    public List<Btrip_detailVO> selectUserVOList(Btrip_detailVO searchVO) {
        return (List<Btrip_detailVO>) list("btrip_detail.selectbtrVOList", searchVO);
    }
   
    public void insertUserVO(Btrip_detailVO btrdetail) {
        insert("btrip_detail.insertbtrVOList", btrdetail);
    }
    
    public void updateUserVO(Btrip_detailVO btrdetail) {
        update("btrip_detail.updatebtrVOList", btrdetail);
    }
    public void deleteUserVO(Btrip_detailVO btrdetail) {
        delete("btrip_detail.deletebtrVOList", btrdetail);
    }
    

}
