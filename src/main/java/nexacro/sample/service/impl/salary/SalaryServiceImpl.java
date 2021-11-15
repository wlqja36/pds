package nexacro.sample.service.impl.salary;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.nexacro.spring.data.DataSetRowTypeAccessor;
import com.nexacro.xapi.data.DataSet;

import nexacro.sample.service.dao.ibatis.salary.SalaryDao;
import nexacro.sample.service.salary.SalaryService;
import nexacro.sample.vo.btripVO.Btrip_ManagementVO;
import nexacro.sample.vo.salary.BonusSalVo;
import nexacro.sample.vo.salary.CostSalVO;
import nexacro.sample.vo.salary.EmpEmpVo;
import nexacro.sample.vo.salary.SalaryVO;
import nexacro.sample.vo.salary.TaxSalVo;
import nexacro.sample.vo.salary.salary_detailVO;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
/**
 * Test를 위한 ServiceImpl Sample Class
 *
 * @author Park SeongMin
 * @since 08.12.2015
 * @version 1.0
 * @see
 */
@Service("salService")
public class SalaryServiceImpl extends EgovAbstractServiceImpl implements SalaryService {
    /**
     * UserDAO class 선언 (UserDAO) Class Injection)
     * (UserDAO)sampleDAO
     */
    // @Autowired(required = false) // Type 정의
	
    @Resource(name = "salDAO")
    // Name 정의
	private SalaryDao salDAO;
    	
// SELECT 부분
	
    //사원번호로 검색 - 조인 있는거
	@Override
	public List<SalaryVO> salarySelectUserVOMapList(Map<String, Object> searchVO) {
		return salDAO.salarySelectUserVOMapList(searchVO);
	}
	//급여대장번호로 검색
	@Override
	public List<SalaryVO> salarySelectSalBookVOMapList(Map<String, Object> searchMapVO) {
		return salDAO.salarySelectSalBookVOMapList(searchMapVO);
	}
	
	// 하단 조인으로 SELECT	
	//수당
	@Override
	public List<BonusSalVo> salaryBonSelectUserVOMapList(Map<String, Object> searchMapVO) {
		return salDAO.salaryBonSelectUserVOMapList(searchMapVO);
	}
	
	//경비
	@Override
	public List<CostSalVO> salaryCostSelectUserVOMapList(Map<String, Object> searchMapVO) {
		return salDAO.salaryCostSelectUserVOMapList(searchMapVO);
	}
	
	//세금
	@Override
	public List<TaxSalVo> salaryTaxSelectUserVOMapList(Map<String, Object> searchMapVO) {
		return salDAO.salaryTaxSelectUserVOMapList(searchMapVO);
	}
	
	
	//하단 select - 그래드 클릭시, 사원번호+급여대장번호
	//수당
	@Override
	public List<BonusSalVo> salaryBonSelectUserBookVOMapList(
			Map<String, Object> searchMapVO) {
		return salDAO.salaryBonSelectUserBookVOMapList(searchMapVO);
	}
	//경비
	@Override
	public List<CostSalVO> salaryCostSelectUserBookVOMapList(
			Map<String, Object> searchMapVO) {
		return salDAO.salaryCostSelectUserBookVOMapList(searchMapVO);
	}
	//세금
	@Override
	public List<TaxSalVo> salaryTaxSelectUserBookVOMapList(
			Map<String, Object> searchMapVO) {
		return salDAO.salaryTaxSelectUserBookVOMapList(searchMapVO);
	}	
	
    //하단 그리드의 변경 발생시 SALARY - SELECT(EMP+BOOKNO)
    //SALARY select - 조인
	@Override
	public List<SalaryVO> salarySelectUserBookVOMapList(
			Map<String, Object> searchMapVO) {
		return salDAO.salarySelectUserBookVOMapList(searchMapVO);
	}
	
	
// SELECT 부분 끝
		
	
	//급여 
	@Override
	public void modifyMultiSalUserVO(List<SalaryVO> modifyList) {

        int size = modifyList.size();
        for (int i=0; i<size; i++) {
        	SalaryVO sal = modifyList.get(i);
            if (sal instanceof DataSetRowTypeAccessor){
                DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) sal;
                
                if (accessor.getRowType() == DataSet.ROW_TYPE_INSERTED){
                	salDAO.insertUserVO(sal);
                }else if (accessor.getRowType() == DataSet.ROW_TYPE_UPDATED){
                	salDAO.updateUserVO(sal);
                }else if (accessor.getRowType() == DataSet.ROW_TYPE_DELETED){
                	salDAO.deleteUserVO(sal);
                }
            }
            
        }		
	}// modifyMultiSalUserVO 급여 end
	
	
	// 세부 급여 조인 없이
	//수당
	@Override
	public void modifyMultiBonusUserVO(List<BonusSalVo> modifyList) {
        int size = modifyList.size();
        for (int i=0; i<size; i++) {
        	BonusSalVo salBon = modifyList.get(i);
            if (salBon instanceof DataSetRowTypeAccessor){
                DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) salBon;
                
                if (accessor.getRowType() == DataSet.ROW_TYPE_INSERTED){
                	salDAO.insertBonusUserVO(salBon);
                }else if (accessor.getRowType() == DataSet.ROW_TYPE_UPDATED){
                	salDAO.updateBonusUserVO(salBon);
                }else if (accessor.getRowType() == DataSet.ROW_TYPE_DELETED){
                	salDAO.deleteBonusUserVO(salBon);
                }
            }
            
        }
		
	}
	
	//경비
	@Override
	public void modifyMultiCostUserVO(List<CostSalVO> modifyList) {
        int size = modifyList.size();
        for (int i=0; i<size; i++) {
        	CostSalVO salCost = modifyList.get(i);
            if (salCost instanceof DataSetRowTypeAccessor){
                DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) salCost;
                
                if (accessor.getRowType() == DataSet.ROW_TYPE_INSERTED){
                	salDAO.insertCostUserVO(salCost);
                }else if (accessor.getRowType() == DataSet.ROW_TYPE_UPDATED){
                	salDAO.updateCostUserVO(salCost);
                }else if (accessor.getRowType() == DataSet.ROW_TYPE_DELETED){
                	salDAO.deleteCostUserVO(salCost);
                }
            }
            
        }
		
	}
	
	//세금
	@Override
	public void modifyMultiTaxUserVO(List<TaxSalVo> modifyList) {
        int size = modifyList.size();
        for (int i=0; i<size; i++) {
        	TaxSalVo salTax = modifyList.get(i);
            if (salTax instanceof DataSetRowTypeAccessor){
                DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) salTax;
                
                if (accessor.getRowType() == DataSet.ROW_TYPE_INSERTED){
                	salDAO.insertTaxUserVO(salTax);
                }else if (accessor.getRowType() == DataSet.ROW_TYPE_UPDATED){
                	salDAO.updateTaxUserVO(salTax);
                }else if (accessor.getRowType() == DataSet.ROW_TYPE_DELETED){
                	salDAO.deleteTaxUserVO(salTax);
                }
            }
            
        }
		
	}
	@Override
	public List<SalaryVO> selectSalEmpSearchList(SalaryVO searchVo) {
		return salDAO.selectEmpList(searchVo);
	}
//	
//	//급여대장 총 금액 - 역정규화
//	@Override
//	public void modifyUpdateSalaryBookTotalVO(List<SalaryVO> searchVo) {
//        int size = searchVo.size();
//        for (int i=0; i<size; i++) {
//        	SalaryVO salaryBookToalMoney = searchVo.get(i);
//            if (salaryBookToalMoney instanceof DataSetRowTypeAccessor){
//                DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) salaryBookToalMoney;
//                
//                if (accessor.getRowType() == DataSet.ROW_TYPE_UPDATED){
//                	salDAO.updateSalaryBookTotalVO(salaryBookToalMoney);
//                }
//            }
//            
//        }
//		
//	}
//

	
	
//////////////
    
    //조인 없는거
//    //사원번호로 검색
//	@Override
//	public List<SalaryVO> salarySelectUserVOList(SalaryVO searchVO) {
//		return salDAO.salarySelectUserVOList(searchVO);
//	}
//	//급여대장번호로 검색
//	@Override
//	public List<SalaryVO> salarySelectSalBookVOList(SalaryVO searchVO) {
//		return salDAO.salarySelectSalBookVOList(searchVO);
//	}
	
	// 세부 급여 조인 없이
	//수당
//	@Override
//	public List<BonusSalVo> salaryBonSelectUserVOList(BonusSalVo searchVO) {
//		return salDAO.salaryBonSelectUserVOList(searchVO);
//	}
	//경비
//	@Override
//	public List<CostSalVO> salaryCostSelectUserVOList(CostSalVO searchVO) {
//		return salDAO.salaryCostSelectUserVOList(searchVO);
//	}
	
	//세금
//	@Override
//	public List<TaxSalVo> salaryTaxSelectUserVOList(TaxSalVo searchVO) {
//		return salDAO.salaryTaxSelectUserVOList(searchVO);
//	}
	
}
