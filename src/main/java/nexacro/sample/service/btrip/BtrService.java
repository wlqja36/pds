package nexacro.sample.service.btrip;

import java.util.List;

import nexacro.sample.vo.btripVO.Btrip_ManagementVO;
import nexacro.sample.vo.btrip_detailVO.Btrip_detailVO;

/**
 * Test를 위한 Servlce Sample Intreface
 * 
 * @author Park SeongMin
 * @since 08.12.2015
 * @version 1.0
 * @see
 */
public interface BtrService {

    List<Btrip_ManagementVO> selectUserVOList(Btrip_ManagementVO searchVO);
    
   /* List<Btrip_ManagementVO> confirmVOList(Btrip_ManagementVO searchVo);*/
    
    void modifyMultiUserVO(List<Btrip_ManagementVO> modifyList);

}
