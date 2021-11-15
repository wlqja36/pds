package nexacro.sample.service.dao.ibatis.btrip;

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
@Repository("btrDAO")
public class BtrDAO extends NexacroIbatisAbstractDAO {

    public List<Btrip_ManagementVO> selectUserVOList(Btrip_ManagementVO searchVO) {
        return (List<Btrip_ManagementVO>) list("btrip_management.selectbtrVOList", searchVO);
    }
 /*   public List<Btrip_ManagementVO> confirmUserVOList(Btrip_ManagementVO searchVo) {
    	return (List<Btrip_ManagementVO>) list("btrip_management.confirmVOList", searchVo);
    }*/
    public void insertUserVO(Btrip_ManagementVO btr) {
        insert("btrip_management.insertbtrVOList", btr);
    }
    
    public void updateUserVO(Btrip_ManagementVO btr) {
        update("btrip_management.updatebtrVOList", btr);
    }
    public void deleteUserVO(Btrip_ManagementVO btr) {
        delete("btrip_management.deletebtrVOList", btr);
    }
	

}
