package nexacro.sample.service.dao.ibatis.salary;

import java.util.List;
import java.util.Map;

import nexacro.sample.vo.administrator.AdmVO;
import nexacro.sample.vo.salary.BonusSalVo;
import nexacro.sample.vo.salary.CostSalVO;
import nexacro.sample.vo.salary.EmpEmpVo;
import nexacro.sample.vo.salary.SalaryVO;
import nexacro.sample.vo.salary.TaxSalVo;
import nexacro.sample.vo.salary.salary_detailVO;

import org.springframework.stereotype.Repository;

import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;

@Repository("salDAO")
public class SalaryDao extends NexacroIbatisAbstractDAO {
	
	
    //조인으로 SELECT
    //사원번호로 검색 -  select 부분-조인부분 map 들어가는 부분
    public List<SalaryVO> salarySelectUserVOMapList(Map<String, Object> searchMapVO) {
    	return (List<SalaryVO>) list("salaryVO.selectSalaryEmpMapList", searchMapVO);
    }
    //급여대장번호로 검색 -  select 부분
    public List<SalaryVO> salarySelectSalBookVOMapList(Map<String, Object> searchMapVO) {
    	return (List<SalaryVO>) list("salaryVO.selectSalarySalBookMapList", searchMapVO);
    }

 
    //하단 select - 조인
    public List<BonusSalVo> salaryBonSelectUserVOMapList(Map<String, Object> searchMapVO) {
    	return (List<BonusSalVo>) list("bonusSalVo.selectBonusEmpMapList", searchMapVO);
    }
    
    public List<CostSalVO> salaryCostSelectUserVOMapList(Map<String, Object> searchMapVO) {
    	return (List<CostSalVO>) list("costSalVO.selectCostEmpMapList", searchMapVO);
    }
    
    public List<TaxSalVo> salaryTaxSelectUserVOMapList(Map<String, Object> searchMapVO) {
    	return (List<TaxSalVo>) list("taxSalVo.selectTaxEmpMapList", searchMapVO);
    }
    
    //그리드 클릭시 발생 - SELECT(EMP+BOOKNO)
    //하단 select - 조인
    public List<BonusSalVo> salaryBonSelectUserBookVOMapList(Map<String, Object> searchMapVO) {
    	return (List<BonusSalVo>) list("bonusSalVo.selectBonusEmpBookMapList", searchMapVO);
    }
    
    public List<CostSalVO> salaryCostSelectUserBookVOMapList(Map<String, Object> searchMapVO) {
    	return (List<CostSalVO>) list("costSalVO.selectCostEmpBookMapList", searchMapVO);
    }
    
    public List<TaxSalVo> salaryTaxSelectUserBookVOMapList(Map<String, Object> searchMapVO) {
    	return (List<TaxSalVo>) list("taxSalVo.selectTaxEmpBookMapList", searchMapVO);
    }
    
    //하단 그리드의 변경 발생시 SALARY - SELECT(EMP+BOOKNO)
    //SALARY select - 조인 
    public List<SalaryVO> salarySelectUserBookVOMapList(Map<String, Object> searchMapVO) {
    	return (List<SalaryVO>) list("salaryVO.selectSalaryEmpBookMapList", searchMapVO);
    }
    
    
    //SALARY - 추가, 수정, 삭제 - 여기서 하는게 아니라 
//    public void insertUserVO(SalaryVO sal) {
//        insert("salary_detailVO.insertSalaryVOList", sal);
//    }
//    public void updateUserVO(SalaryVO sal) {
//        update("salary_detailVO.updateSalaryVOList", sal);
//    }
//    public void deleteUserVO(SalaryVO sal) {
//        delete("salary_detailVO.deleteSalaryVOList", sal);
//    }
    //SALARY - 추가, 수정, 삭제 - 여기서 하는게 아니라 // 넥사크로에서 하는 거였음.
    public void insertUserVO(SalaryVO sal) {
    	insert("salary_detailVO.insertSalaryVOList", sal);
    }
    public void updateUserVO(SalaryVO sal) {
    	insert("salary_detailVO.updateSalaryVOList", sal);
    }
    public void deleteUserVO(SalaryVO sal) {
    	insert("salary_detailVO.deleteSalaryVOList", sal);
    }

    //여기까지 SALARY 

    
    // 조인 없는 하단 insert, update, delete
    
    // bonus
    public void insertBonusUserVO(BonusSalVo salBon) {
        insert("salary_bonusVO.insertBonusVOList", salBon);
    }
    public void updateBonusUserVO(BonusSalVo salBon) {
        update("salary_bonusVO.updateBonusVOList", salBon);
    }
    public void deleteBonusUserVO(BonusSalVo salBon) {
        delete("salary_bonusVO.deleteBonusVOList", salBon);
    }
    
    // cost
    public void insertCostUserVO(CostSalVO salCost) {
        insert("salary_costVO.insertCostVOList", salCost);
    }
    public void updateCostUserVO(CostSalVO salCost) {
        update("salary_costVO.updateCostVOList", salCost);
    }
    public void deleteCostUserVO(CostSalVO salCost) {
        delete("salary_costVO.deleteCostVOList", salCost);
    }
    
    // tax
    public void insertTaxUserVO(TaxSalVo salTax) {
    	insert("salary_taxVO.insertTaxVOList", salTax);
    }
    public void updateTaxUserVO(TaxSalVo salTax) {
    	insert("salary_taxVO.updateTaxVOList", salTax);
    }
    public void deleteTaxUserVO(TaxSalVo salTax) {
    	insert("salary_taxVO.deleteTaxVOList", salTax);
    }
    

    ///////////////emp 건드려 보기=> 급여대장 검색으로 바꿈
    public List<SalaryVO> selectEmpList(SalaryVO searchVo) {
        return (List<SalaryVO>) list("salary.selectEmpList", searchVo);
    }
    
    
//    //급여대장에 촘합 넘겨주기
//    public void updateSalaryBookTotalVO(SalaryVO searchVo) {
//        update("SalaryVO.SalaryBookTotalMoneyUpdate", searchVo);
//    }
//    
    ///////////////////////////// ㄴ 여기까지가  조인 없는 crud 0518
    

    
//	  0516 - DETAIL - 조인    
//    public List<salary_detailVO> salarySelectUserVOList(salary_detailVO searchVO) {
//    	return (List<salary_detailVO>) list("salary_detailVO.selectSalaryEmpList", searchVO);
//    }
//    /*  public List<salary_detailVO> salarySelectSalBookVOList(salary_detailVO bookSearchVO) {
//    	return (List<salary_detailVO>) list("salary_detailVO.selectSalarySalBookList", bookSearchVO);
//    }*/
//    
//    public void insertUserVO(salary_detailVO sal) {
//    	insert("salary_detailVO.insertSalaryVOList", sal);
//    }
//    
//    public void updateUserVO(salary_detailVO sal) {
//    	update("salary_detailVO.updateSalaryVOList", sal);
//    }
//    public void deleteUserVO(salary_detailVO sal) {
//    	delete("salary_detailVO.deleteSalaryVOList", sal);
//    }
    
    
    ///////////////////////
	
	//조인 없이 기본
	//사원번호로 검색 -  select 부분
//    public List<SalaryVO> salarySelectUserVOList(SalaryVO searchVO) {
//    	return (List<SalaryVO>) list("salary_detailVO.selectSalaryEmpList", searchVO);
//    }
    //급여대장번호로 검색 -  select 부분
//    public List<SalaryVO> salarySelectSalBookVOList(SalaryVO searchVO) {
//    	return (List<SalaryVO>) list("salary_detailVO.selectSalarySalBookList", searchVO);
//    }
//    
	
    
    
    
    
//  //수당, 경비, 세금 - 하단 select - 조인 없음.
//  public List<BonusSalVo> salaryBonSelectUserVOList(BonusSalVo searchVO) {
//      return (List<BonusSalVo>) list("salary_detailVO.selectBonusEmpList", searchVO);
//  }
//  
//  public List<CostSalVO> salaryCostSelectUserVOList(CostSalVO searchVO) {
//      return (List<CostSalVO>) list("salary_detailVO.selectCostEmpList", searchVO);
//  }
//  
//  public List<TaxSalVo> salaryTaxSelectUserVOList(TaxSalVo searchVO) {
//  	return (List<TaxSalVo>) list("salary_detailVO.selectTaxEmpList", searchVO);
//  }
	
    
    
    //insert로만 넣어도 쿼리문에서 자동으로 처리해준다. 
//  public void insertTaxUserVO(TaxSalVo salTax) {
//  	insert("salary_taxVO.insertTaxVOList", salTax);
//  }
//  public void updateTaxUserVO(TaxSalVo salTax) {
//  	update("salary_taxVO.updateTaxVOList", salTax);
//  }
//  public void deleteTaxUserVO(TaxSalVo salTax) {
//  	delete("salary_taxVO.deleteTaxVOList", salTax);
//  }
    ///////////////////////////// ㄴ 여기까지가  조인 없는 crud 0518
  
    
}
