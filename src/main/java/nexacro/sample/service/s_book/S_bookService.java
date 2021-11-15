package nexacro.sample.service.s_book;

import java.util.List;

import org.apache.xmlbeans.impl.inst2xsd.SalamiSliceStrategy;
import org.springframework.stereotype.Service;

import nexacro.sample.vo.administrator.AdmVO;
import nexacro.sample.vo.attitudeVO.AttitudeVO;
import nexacro.sample.vo.btripVO.Btrip_ManagementVO;
import nexacro.sample.vo.btrip_detailVO.Btrip_detailVO;
import nexacro.sample.vo.s_bookVO.S_bookVO;


/**
 * Test를 위한 Servlce Sample Intreface
 * 
 * @author Park SeongMin
 * @since 08.12.2015
 * @version 1.0
 * @see
 */

public interface S_bookService {

	//급여대장
    List<S_bookVO> selectUserVOList(S_bookVO searchVO);
    
    void modifyMultiUserVO(List<S_bookVO> modifyList);
    
    
    
    
   
    
   

}