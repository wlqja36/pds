package nexacro.sample.service.salary;

import java.util.List;
import java.util.Map;

import nexacro.sample.vo.administrator.AdmVO;
import nexacro.sample.vo.btripVO.Btrip_ManagementVO;
import nexacro.sample.vo.salary.BonusSalVo;
import nexacro.sample.vo.salary.CostSalVO;
import nexacro.sample.vo.salary.EmpEmpVo;
import nexacro.sample.vo.salary.SalaryVO;
import nexacro.sample.vo.salary.TaxSalVo;
//이거 vo 만들어서 붙여넣어.
import nexacro.sample.vo.salary.salary_detailVO;

/**
 * Test를 위한 Servlce Sample Intreface
 * 
 * @author Park SeongMin
 * @since 08.12.2015
 * @version 1.0
 * @see
 */
public interface SalaryService {
		

	//조인걸고서
	//사원번호로 검색
	List<SalaryVO> salarySelectUserVOMapList(Map<String, Object> searchMapVO);
	//급여대장번호로 검색
	List<SalaryVO> salarySelectSalBookVOMapList(Map<String, Object> searchMapVO);
	
    //하단 세부 급여 조인
    //수당
    List<BonusSalVo> salaryBonSelectUserVOMapList(Map<String, Object> searchMapVO);
    //경비
    List<CostSalVO> salaryCostSelectUserVOMapList(Map<String, Object> searchMapVO);
    //세금
    List<TaxSalVo> salaryTaxSelectUserVOMapList(Map<String, Object> searchMapVO);
    
    //하단 세부 급여 조인-그래드 클릭, 사원번호+급여대장
    //수당
    List<BonusSalVo> salaryBonSelectUserBookVOMapList(Map<String, Object> searchMapVO);
    //경비
    List<CostSalVO> salaryCostSelectUserBookVOMapList(Map<String, Object> searchMapVO);
    //세금
    List<TaxSalVo> salaryTaxSelectUserBookVOMapList(Map<String, Object> searchMapVO);   
    
    //하단 그리드의 변경 발생시 SALARY - SELECT(EMP+BOOKNO)
    //SALARY select - 조인 
    List<SalaryVO> salarySelectUserBookVOMapList(Map<String, Object> searchMapVO);   


    //급여
    void modifyMultiSalUserVO(List<SalaryVO> modifyList);
    //수당
    void modifyMultiBonusUserVO(List<BonusSalVo> modifyList);
    //경비
    void modifyMultiCostUserVO(List<CostSalVO> modifyList);
    //세금
    void modifyMultiTaxUserVO(List<TaxSalVo> modifyList);

    
   
    //emp 건드려보자
    List<SalaryVO> selectSalEmpSearchList(SalaryVO searchVo);
    
//    //급여대장 총합, 역정규화
//    void modifyUpdateSalaryBookTotalVO(List<SalaryVO> searchVo);
//    
    
    
    ///////////////////////////// ㄴ 조인 없이 crud 0518
    
    

    // 0516 - DETAIL - 조인
	//검색을 열려면 일단 select 부터 있어야하고-list도 select지?
	
	//2번째 화면의 리스트부터 불러옵시다.
    //List<SalaryVO> salaryBookList(SalaryVO salaryBookListVO);
    
    //vo 가져다 쓸 수 있는지 보자.  -- 아니야. 일단 다 만들어서 하고 해야함.
    //계속 추척해서 대체해서 할 수 있는지 보자. 어차피 내가 해야하니까.

//    //검색을 열려면 일단 select 부터 있어야하고-list도 select지?
//    
//    //2번째 화면의 리스트부터 불러옵시다.
//    //List<SalaryVO> salaryBookList(SalaryVO salaryBookListVO);
//    
//    //vo 가져다 쓸 수 있는지 보자.  -- 아니야. 일단 다 만들어서 하고 해야함.
//    //계속 추척해서 대체해서 할 수 있는지 보자. 어차피 내가 해야하니까.
//    
//    //0516-서비스
//    
//    List<salary_detailVO> salarySelectUserVOList(salary_detailVO searchVO);
//    
//    // List<salary_detailVO> salarySelectSalBookVOList(salary_detailVO bookSearchVO);
//    
//    void modifyMultiSalUserVO(List<salary_detailVO> modifyList);
    
    /////////////
    
	//급여 조인 없이 SELET
    //사원번호로 검색
	//List<SalaryVO> salarySelectUserVOList(SalaryVO searchVO);
	//급여대장번호로 검색
//	List<SalaryVO> salarySelectSalBookVOList(SalaryVO searchVO);
//    //하단 세부 급여 조인 없이
//    //수당
//    List<BonusSalVo> salaryBonSelectUserVOList(BonusSalVo searchVO);
//
//    void modifyMultiBonusUserVO(List<BonusSalVo> modifyList);
//    
//    //경비
//    List<CostSalVO> salaryCostSelectUserVOList(CostSalVO searchVO);
//    
//    void modifyMultiCostUserVO(List<CostSalVO> modifyList);
//    
//    //세금
//    List<TaxSalVo> salaryTaxSelectUserVOList(TaxSalVo searchVO);
//    
//    void modifyMultiTaxUserVO(List<TaxSalVo> modifyList);
        
}