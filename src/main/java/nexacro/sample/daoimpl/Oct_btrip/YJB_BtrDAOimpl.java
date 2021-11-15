package nexacro.sample.daoimpl.Oct_btrip;

import java.util.List;

import nexacro.sample.dao.Oct_btrip.YJB_BtrDAO;


import nexacro.sample.vo.Oct_btrip.YJB_Btrip_ManagementVO;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



/**
 * Test를 위한 DAO Sample Class
 *
 * @author Park SeongMin
 * @since 08.12.2015
 * @version 1.0
 * @see
 */
@Repository("YJB_btrDAO")
public class YJB_BtrDAOimpl implements YJB_BtrDAO  {
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
    public List<YJB_Btrip_ManagementVO> selectUserVOList(YJB_Btrip_ManagementVO searchVO) {
        return sqlSessionTemplate.selectList("yjb_btrip_management.yjb_selectbtrVOList", searchVO);
    }
 /*   public List<Btrip_ManagementVO> confirmUserVOList(Btrip_ManagementVO searchVo) {
    	return (List<Btrip_ManagementVO>) list("btrip_management.confirmVOList", searchVo);
    }*/
    public void insertUserVO(YJB_Btrip_ManagementVO btr) {
        sqlSessionTemplate.insert("yjb_btrip_management.yjb_insertbtrVOList", btr);
    }
    
    public void updateUserVO(YJB_Btrip_ManagementVO btr) {
        sqlSessionTemplate.update("yjb_btrip_management.yjb_updatebtrVOList", btr);
    }
    public void deleteUserVO(YJB_Btrip_ManagementVO btr) {
        sqlSessionTemplate.delete("yjb_btrip_management.yjb_deletebtrVOList", btr);
    }
    
	

}
