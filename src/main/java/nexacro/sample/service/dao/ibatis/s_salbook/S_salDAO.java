package nexacro.sample.service.dao.ibatis.s_salbook;

import java.util.List;

import nexacro.sample.vo.s_salbookVO.BonusVO;
import nexacro.sample.vo.s_salbookVO.TaxVO;

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
@Repository("sbsalDAO")
public class S_salDAO extends NexacroIbatisAbstractDAO {

    
    //샐러리
       
    public void insertsalVO(nexacro.sample.vo.s_salbookVO.SalaryVO sal) {
        insert("s_book.insertsalVO", sal);
                
    }
    
    //보너스
    
    public void insertbonus_VO(BonusVO bonus_) {
        insert("s_book.insertbonus_VO", bonus_);
                
    }
    
//    //세금
//    public void inserttax_VO(TaxVO tax_) {
//        insert("s_book.inserttax_VO", tax_);
//                
//    }
    
    
   
  
	

}
