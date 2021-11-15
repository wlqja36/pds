package nexacro.sample.service.r_standard;

import java.util.List;

import nexacro.sample.vo.btrip_detailVO.Btrip_detailVO;
import nexacro.sample.vo.r_standardVO.R_standardVO;

/**
 * Test를 위한 Servlce Sample Intreface
 * 
 * @author Park SeongMin
 * @since 08.12.2015
 * @version 1.0
 * @see
 */
public interface R_standardService {

    List<R_standardVO> selectUserVOList(R_standardVO searchVO);
    

    void modifyMultiUserVO(List<R_standardVO> modifyList);

}
