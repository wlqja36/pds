package nexacro.sample.dao.Oct_btrip;

import java.util.List;

import nexacro.sample.vo.Oct_btrip.YJB_Btrip_ManagementVO;



/**
 * Test를 위한 DAO Sample Class
 *
 * @author Park SeongMin
 * @since 08.12.2015
 * @version 1.0
 * @see
 */

public interface YJB_BtrDAO {

    public List<YJB_Btrip_ManagementVO> selectUserVOList(YJB_Btrip_ManagementVO searchVO) throws Exception;
 /*   public List<Btrip_ManagementVO> confirmUserVOList(Btrip_ManagementVO searchVo) {
    	return (List<Btrip_ManagementVO>) list("btrip_management.confirmVOList", searchVo);
    }*/
    public void insertUserVO(YJB_Btrip_ManagementVO btr) throws Exception;
    
    public void updateUserVO(YJB_Btrip_ManagementVO btr) throws Exception;
    public void deleteUserVO(YJB_Btrip_ManagementVO btr) throws Exception;
	

}
