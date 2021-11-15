package nexacro.sample.daoimpl.Oct_btrip;

import java.util.List;





import nexacro.sample.dao.Oct_btrip.YJB_Btr_DetailDAO;
import nexacro.sample.vo.Oct_btrip.YJB_Btrip_detailVO;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
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
@Repository("YJB_btr_DetailDAO")
public class YJB_Btr_DetailDAOimpl implements YJB_Btr_DetailDAO {
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
    public List<YJB_Btrip_detailVO> selectUserVOList(YJB_Btrip_detailVO searchVO) {
        return sqlSessionTemplate.selectList("yjb_btrip_detail.yjb_selectbtrVOList", searchVO);
    }
   
    public void insertUserVO(YJB_Btrip_detailVO btrdetail) {
       sqlSessionTemplate.insert("yjb_btrip_detail.yjb_insertbtrVOList", btrdetail);
    }
    
    public void updateUserVO(YJB_Btrip_detailVO btrdetail) {
        sqlSessionTemplate.update("yjb_btrip_detail.yjb_updatebtrVOList", btrdetail);
    }
    public void deleteUserVO(YJB_Btrip_detailVO btrdetail) {
        sqlSessionTemplate.delete("yjb_btrip_detail.yjb_deletebtrVOList", btrdetail);
    }
    

}
