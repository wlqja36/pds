package nexacro.sample.web.salary;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.sample.service.salary.SalaryService;
import nexacro.sample.vo.administrator.AdmVO;
import nexacro.sample.vo.salary.BonusSalVo;
import nexacro.sample.vo.salary.CostSalVO;
import nexacro.sample.vo.salary.EmpEmpVo;
import nexacro.sample.vo.salary.SalaryVO;
import nexacro.sample.vo.salary.TaxSalVo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.spring.NexacroException;
import com.nexacro.spring.annotation.ParamDataSet;
import com.nexacro.spring.data.NexacroResult;

@Controller
public class SalaryController {
	
	private static final Logger logger = LoggerFactory.getLogger(SalaryController.class);
	
	// Name 정의
	// @Autowired(required = false) // Type 정의
	@Resource(name = "salService")
	private SalaryService salService;

	@Resource
	private Validator	validator;

    @InitBinder
	public void initBinder(WebDataBinder dataBinder){
		dataBinder.setValidator(this.validator);
	}
 
    //조인으로 select
    //사원번호로 검색 - select-join
    @RequestMapping(value = "/salSelectVO.do")
    public NexacroResult selectSalEmpVoMap(@ParamDataSet(name = "ds_search", required = false) SalaryVO salaryVO) {//넥사크로에서 온거-조인하면서 string으로 함.
    	
    	Map<String, Object> selectMap = new HashMap<String, Object>();
    	//selectMap.put("searchKeyword", searchKeyword);//이거 변수명이 똑같아서 서치랑 뭐가 같은 건지...
    	selectMap.put("searchCondition", salaryVO.getSearchCondition());//이거 key값은 그냥 의미 없는 건가?-아니 매우 중요해 넣어주는 변수 명이랑 같아야함.
		selectMap.put("searchKeyword", salaryVO.getSearchKeyword());

    	List<SalaryVO> salList = salService.salarySelectUserVOMapList(selectMap);//이건 그냥 vo로 가져올 때는 그냥하고, 이건 map이니까.
    	//System.out.println(salList.get(0));
    	NexacroResult result = new NexacroResult();
    	result.addDataSet("output1", salList); //넥사크로로 갈거
    	
    	return result;
    }
    //급여대장번호로 검색 - select
    @RequestMapping(value = "/salSelectBookVO.do")
    public NexacroResult selectSalBookVoMap(@ParamDataSet(name = "ds_salary", required = false) SalaryVO searchMapVO) {//넥사크로에서 온거
    	
    	Map<String, Object> selectMap = new HashMap<String, Object>();
		selectMap.put("salaryBookNo", searchMapVO.getSalaryBookNo());	//이거 넥사크로에서 이값을 setcolumn 해주는 값이랑 똑같이 해야 정확히 값을 입력 받음.
																		//list에서 받으니까 vo-xml 쿼리 문에 쓰는 동적 쿼리## 변수명(map은 resultMap 안쓰니까 제끼고)-넥사크로 데이터셋의 컬럼명 
    	List<SalaryVO> salList = salService.salarySelectSalBookVOMapList(selectMap); //map 없을 땐 위에서 salaryVO 변수 받아다가 썼었는데 map이 있으니까  map껄 받아다 쓰는 구나.
    	//System.out.println(salList.get(0)); //이거 있으면 결과값이 NULL일 때 UNDEFINDED 에러를 일으킴
    	NexacroResult result = new NexacroResult();
    	result.addDataSet("output10", salList); //넥사크로로 갈거
    	
    	return result;
    }    
    
    //하단 select - 사원번호 only
    // 수당 
    @RequestMapping(value = "/salBonSelectVO.do")
   	public NexacroResult selectSalBonEmpVoMap(@ParamDataSet(name = "ds_search", required = false) BonusSalVo searchVo) {
		   Map<String, Object> selectMap = new HashMap<String, Object>();
		   //selectMap.put("searchKeyword", searchKeyword);//이거 변수명이 똑같아서 서치랑 뭐가 같은 건지...
		   selectMap.put("searchCondition", searchVo.getSearchCondition());//이거 key값은 그냥 의미 없는 건가?-아니 매우 중요해 넣어주는 변수 명이랑 같아야함.
		   selectMap.put("searchKeyword", searchVo.getSearchKeyword());
		
		   List<BonusSalVo> salBonList = salService.salaryBonSelectUserVOMapList(selectMap);
		   //System.out.println(salBonList.get(0));
		   NexacroResult resultBon = new NexacroResult();
		   System.out.println("넥사크로 결과"+resultBon);
		   resultBon.addDataSet("outputBon", salBonList);
           
           return resultBon;
       }
    // 경비 조인 
    @RequestMapping(value = "/salCostSelectVO.do")
    public NexacroResult selectSalCostEmpVoMap(@ParamDataSet(name = "ds_search", required = false) CostSalVO searchVo) {
		Map<String, Object> selectMap = new HashMap<String, Object>();
		//selectMap.put("searchKeyword", searchKeyword);//이거 변수명이 똑같아서 서치랑 뭐가 같은 건지...
		selectMap.put("searchCondition", searchVo.getSearchCondition());//이거 key값은 그냥 의미 없는 건가?-아니 매우 중요해 넣어주는 변수 명이랑 같아야함.
		selectMap.put("searchKeyword", searchVo.getSearchKeyword());
		
    	List<CostSalVO> salCostList = salService.salaryCostSelectUserVOMapList(selectMap);
    	//System.out.println(salCostList.get(0));
    	NexacroResult resultCost = new NexacroResult();
    	System.out.println("넥사크로 결과"+resultCost);
    	resultCost.addDataSet("outputCost", salCostList);
    	
    	return resultCost;
    }
    
    // 세금 조인
    @RequestMapping(value = "/salTaxSelectVO.do")
    public NexacroResult selectSalTaxEmpVoMap(@ParamDataSet(name = "ds_search", required = false) TaxSalVo searchVo) {
		Map<String, Object> selectMap = new HashMap<String, Object>();
		//selectMap.put("searchKeyword", searchKeyword);//이거 변수명이 똑같아서 서치랑 뭐가 같은 건지...
		selectMap.put("searchCondition", searchVo.getSearchCondition());//이거 key값은 그냥 의미 없는 건가?-아니 매우 중요해 넣어주는 변수 명이랑 같아야함.
		selectMap.put("searchKeyword", searchVo.getSearchKeyword());
		
    	List<TaxSalVo> salTaxList = salService.salaryTaxSelectUserVOMapList(selectMap);
    	//System.out.println(salTaxList.get(0)); //값 확인용
    	NexacroResult resultTax = new NexacroResult();
    	System.out.println("넥사크로 결과"+resultTax);
    	resultTax.addDataSet("outputTax", salTaxList);
    	
    	return resultTax;
    }
  
    
    //하단 select - 사원번호 + 급여대장번호
    // 수당 
    @RequestMapping(value = "/salBonSelectEmpBookVO.do")
    public NexacroResult selectSalBonEmpBookVoMap(@ParamDataSet(name = "ds_search", required = false) BonusSalVo searchMapVO) {
    	Map<String, Object> selectMap = new HashMap<String, Object>();
		selectMap.put("searchCondition", searchMapVO.getSearchCondition());//이거 key값은 그냥 의미 없는 건가?-아니 매우 중요해 넣어주는 변수 명이랑 같아야함.
		selectMap.put("searchKeyword", searchMapVO.getSearchKeyword());
    	
    	List<BonusSalVo> salBonList = salService.salaryBonSelectUserBookVOMapList(selectMap);
    	//System.out.println(salBonList.get(0));
    	NexacroResult resultBon = new NexacroResult();
    	System.out.println("넥사크로 결과"+resultBon);
    	resultBon.addDataSet("output20", salBonList);
    	
    	return resultBon;
    }
    // 경비
    @RequestMapping(value = "/salCostSelectEmpBookVO.do")
    public NexacroResult selectSalCostEmpBookVoMap(@ParamDataSet(name = "ds_search", required = false) CostSalVO searchMapVO) {
    	Map<String, Object> selectMap = new HashMap<String, Object>();
		selectMap.put("searchCondition", searchMapVO.getSearchCondition());//이거 key값은 그냥 의미 없는 건가?-아니 매우 중요해 넣어주는 변수 명이랑 같아야함.
		selectMap.put("searchKeyword", searchMapVO.getSearchKeyword());
    	
//    	selectMap.put("salaryBookNo", searchMapVO.getSalaryBookNo());
//    	selectMap.put("empNo", searchMapVO.getEmpNo());
    	
    	List<CostSalVO> salCostList = salService.salaryCostSelectUserBookVOMapList(selectMap);
    	//System.out.println(salCostList.get(0));
    	NexacroResult resultCost = new NexacroResult();
    	System.out.println("넥사크로 결과"+resultCost);
    	resultCost.addDataSet("output21", salCostList);
    	
    	return resultCost;
    }
    
    // 세금
    @RequestMapping(value = "/salTaxSelectEmpBookVO.do")
    public NexacroResult selectSalTaxEmpBookVoMap(@ParamDataSet(name = "ds_search", required = false) TaxSalVo searchMapVO) {
    	Map<String, Object> selectMap = new HashMap<String, Object>();
		selectMap.put("searchCondition", searchMapVO.getSearchCondition());//이거 key값은 그냥 의미 없는 건가?-아니 매우 중요해 넣어주는 변수 명이랑 같아야함.
		selectMap.put("searchKeyword", searchMapVO.getSearchKeyword());
		
//    	selectMap.put("salaryBookNo", searchMapVO.getSalaryBookNo());
//    	selectMap.put("empNo", searchMapVO.getEmpNo());
    	
    	List<TaxSalVo> salTaxList = salService.salaryTaxSelectUserBookVOMapList(selectMap);
    	//System.out.println(salTaxList.get(0)); //값 확인용
    	NexacroResult resultTax = new NexacroResult();
    	System.out.println("넥사크로 결과"+resultTax);
    	resultTax.addDataSet("output22", salTaxList);
    	
    	return resultTax;
    }
    
    //하단 그리드의 변경 발생시 SALARY - SELECT(EMP+BOOKNO)
    //SALARY select - 조인
    @RequestMapping(value = "/salSelectEmpBookVO.do")
    public NexacroResult selectSalEmpBookVoMap(@ParamDataSet(name = "ds_salary", required = false) SalaryVO searchMapVO) {
    	Map<String, Object> selectMap = new HashMap<String, Object>();
    	selectMap.put("salaryBookNo", searchMapVO.getSalaryBookNo());//이거 key값은 그냥 의미 없는 건가?-아니 매우 중요해 넣어주는 변수 명이랑 같아야함.
    	selectMap.put("empNo", searchMapVO.getEmpNo());
    	
//    	selectMap.put("salaryBookNo", searchMapVO.getSalaryBookNo());
//    	selectMap.put("empNo", searchMapVO.getEmpNo());
    	
    	List<SalaryVO> salBothList = salService.salarySelectUserBookVOMapList(selectMap);
    	//System.out.println(salTaxList.get(0)); //값 확인용
    	NexacroResult resultSalBoth = new NexacroResult();
    	System.out.println("넥사크로 결과"+resultSalBoth);
    	resultSalBoth.addDataSet("output100", salBothList);
    	
    	return resultSalBoth;
    }
    
   
    
    
///////////////////////// 여기까지 SALARY SELECT 부분
    
    
    
	@RequestMapping(value = "/salModifyVO.do")
	public NexacroResult modifyVO(@ParamDataSet(name = "input1") List<SalaryVO> modifyList) throws NexacroException {//넥사크로에서 온거
		
		validate(modifyList);

		salService.modifyMultiSalUserVO(modifyList);

		NexacroResult result = new NexacroResult();

		return result;
	}

	/**
	 * validate
	 * @param modifyList
	 * @throws NexacroException
	 */
	private void validate(List<SalaryVO> modifyList) throws NexacroException {
		BindingResult bindingResult = null;
		for (SalaryVO salVO : modifyList) {
			bindingResult = new BeanPropertyBindingResult(salVO, "salVO");
			validator.validate(salVO, bindingResult);
			if (bindingResult.hasErrors()) {
				String errorMessages = getErrorMessages(bindingResult);

				NexacroException nexacroException = new NexacroException(errorMessages);
				nexacroException.setErrorCode(NexacroException.DEFAULT_ERROR_CODE);
				nexacroException.setErrorMsg(errorMessages);

				throw nexacroException;
			}
		}
	}
	
	/** 이거는 새로 만들지 않았음.
	 * getErrorMessages
	 * @param bindingResult
	 */
	private String getErrorMessages(BindingResult bindingResult) {
		StringBuffer sb = new StringBuffer();
		
		for (ObjectError error : bindingResult.getAllErrors()) {
			sb.append(error.getDefaultMessage()).append("\n");
		}
		
		return sb.toString();
	}
	

//////////////////////////////////////////////////////////
	


	@RequestMapping(value = "/salBonModifyVO.do")
	public NexacroResult modifyBonVO(@ParamDataSet(name = "inputBon") List<BonusSalVo> modifyBonList) throws NexacroException {
		
		validateBon(modifyBonList); //이거 에러 어떻게 지우더라??/ 야ㅏ 아래랑 맡추는 구나.!!!
			//이거 이름 바꿔쥐면 됨
		salService.modifyMultiBonusUserVO(modifyBonList);

		NexacroResult result = new NexacroResult();

		return result;
	}

	/**
	 * validate
	 * @param modifyList
	 * @throws NexacroException
	 */
	private void validateBon(List<BonusSalVo> modifyList) throws NexacroException {
		BindingResult bindingResult = null;
		for (BonusSalVo BonVO : modifyList) {
			bindingResult = new BeanPropertyBindingResult(BonVO, "BonVO");
			validator.validate(BonVO, bindingResult);
			if (bindingResult.hasErrors()) {
				String errorMessages = getErrorMessages(bindingResult);

				NexacroException nexacroException = new NexacroException(errorMessages);
				nexacroException.setErrorCode(NexacroException.DEFAULT_ERROR_CODE);
				nexacroException.setErrorMsg(errorMessages);

				throw nexacroException;
			}
		}
	}


	@RequestMapping(value = "/salCostModifyVO.do")
	public NexacroResult modifyCostVO(@ParamDataSet(name = "inputCost") List<CostSalVO> modifyCostList) throws NexacroException {
		
		validateCost(modifyCostList);

		salService.modifyMultiCostUserVO(modifyCostList);

		NexacroResult result = new NexacroResult();

		return result;
	}

	/**
	 * validate
	 * @param modifyList
	 * @throws NexacroException
	 */
	private void validateCost(List<CostSalVO> modifyList) throws NexacroException {
		BindingResult bindingResult = null;
		for (CostSalVO CostVO : modifyList) {
			bindingResult = new BeanPropertyBindingResult(CostVO, "CostVO");
			validator.validate(CostVO, bindingResult);
			if (bindingResult.hasErrors()) {
				String errorMessages = getErrorMessages(bindingResult);

				NexacroException nexacroException = new NexacroException(errorMessages);
				nexacroException.setErrorCode(NexacroException.DEFAULT_ERROR_CODE);
				nexacroException.setErrorMsg(errorMessages);

				throw nexacroException;
			}
		}
	}
	


	@RequestMapping(value = "/salTaxModifyVO.do")
	public NexacroResult modifyTaxVO(@ParamDataSet(name = "inputTax") List<TaxSalVo> modifyList) throws NexacroException {
		
		validateTax(modifyList);

		salService.modifyMultiTaxUserVO(modifyList);

		NexacroResult result = new NexacroResult();

		return result;
	}

	/**
	 * validate
	 * @param modifyList
	 * @throws NexacroException
	 */
	private void validateTax(List<TaxSalVo> modifyList) throws NexacroException {
		BindingResult bindingResult = null;
		for (TaxSalVo taxVO : modifyList) {
			bindingResult = new BeanPropertyBindingResult(taxVO, "taxVO");
			validator.validate(taxVO, bindingResult);
			if (bindingResult.hasErrors()) {
				String errorMessages = getErrorMessages(bindingResult);

				NexacroException nexacroException = new NexacroException(errorMessages);
				nexacroException.setErrorCode(NexacroException.DEFAULT_ERROR_CODE);
				nexacroException.setErrorMsg(errorMessages);

				throw nexacroException;
			}
		}
	}
	
	
	
	///////////////////////////////////////////emp => 급여대장 가져오는 걸로 바꿈.
	//emp를 건드려보았다
	@RequestMapping(value = "/selectSalEmpSearch.do")
	public NexacroResult selectEmp(@ParamDataSet(name = "ds_search", required = false) SalaryVO searchVo) {
        
        List<SalaryVO> empList = salService.selectSalEmpSearchList(searchVo);
        
        NexacroResult result = new NexacroResult();
        result.addDataSet("ds_output200", empList);
        
        return result;
    }
	
	
	////////////////////////////////////////////
	
//
//	@RequestMapping(value = "/salBooktotalMoneyUpdateVO.do")
//	public NexacroResult modifyUpdateSalaryBookTotalMoneyVO(@ParamDataSet(name = "inputSalBook") List<SalaryVO> modifySalaryBookTotal) throws NexacroException {
//		
//		validateUpdateSalaryBookTotal(modifySalaryBookTotal);
//
//		salService.modifyUpdateSalaryBookTotalVO(modifySalaryBookTotal);
//
//		NexacroResult result = new NexacroResult();
//
//		return result;
//	}
//
//	/**
//	 * validate
//	 * @param modifyList
//	 * @throws NexacroException
//	 */
//	private void validateUpdateSalaryBookTotal(List<SalaryVO> UpdateSalaryBookTotal) throws NexacroException {
//		BindingResult bindingResult = null;
//		for (SalaryVO salTotalMony : UpdateSalaryBookTotal) {
//			bindingResult = new BeanPropertyBindingResult(salTotalMony, "salTotalMony");
//			validator.validate(salTotalMony, bindingResult);
//			if (bindingResult.hasErrors()) {
//				String errorMessages = getErrorMessages(bindingResult);
//
//				NexacroException nexacroException = new NexacroException(errorMessages);
//				nexacroException.setErrorCode(NexacroException.DEFAULT_ERROR_CODE);
//				nexacroException.setErrorMsg(errorMessages);
//
//				throw nexacroException;
//			}
//		}
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	//////////////////// ㄴ 조인 없이  crud
	
	
	
	
	
	
//	//0516-controller
//	
//	// Name 정의
//	// @Autowired(required = false) // Type 정의
//	@Resource(name = "salService")
//	private SalaryService salService;
//	
//	@Resource
//	private Validator	validator;
//	
//	@InitBinder
//	public void initBinder(WebDataBinder dataBinder){
//		dataBinder.setValidator(this.validator);
//	}
//	
//	@RequestMapping(value = "/salSelectVO.do")
//	public NexacroResult selectSalEmpVo(@ParamDataSet(name = "ds_search", required = false) salary_detailVO searchVo) {
//		
//		List<salary_detailVO> salList = salService.salarySelectUserVOList(searchVo);
//		
//		NexacroResult result = new NexacroResult();
//		result.addDataSet("output1", salList);
//		
//		return result;
//	}
////    @RequestMapping(value = "/salBookIdSelectVO.do")
////    public NexacroResult selectSalBookVo(@ParamDataSet(name = "ds_search2", required = false) salary_detailVO searchBookVo) {
////    	
////    	List<salary_detailVO> salList = salService.salarySelectSalBookVOList(searchBookVo);
////    	
////    	NexacroResult result = new NexacroResult();
////    	result.addDataSet("output2", salList);
////    	
////    	return result;
////    }
//	
//	@RequestMapping(value = "/salModifyVO.do")
//	public NexacroResult modifyVO(@ParamDataSet(name = "input1") List<salary_detailVO> modifyList) throws NexacroException {
//		
//		validate(modifyList);
//		
//		salService.modifyMultiSalUserVO(modifyList);
//		
//		NexacroResult result = new NexacroResult();
//		
//		return result;
//	}
//	
//	/**
//	 * validate
//	 * @param modifyList
//	 * @throws NexacroException
//	 */
//	private void validate(List<salary_detailVO> modifyList) throws NexacroException {
//		BindingResult bindingResult = null;
//		for (salary_detailVO salVO : modifyList) {
//			bindingResult = new BeanPropertyBindingResult(salVO, "salVO");
//			validator.validate(salVO, bindingResult);
//			if (bindingResult.hasErrors()) {
//				String errorMessages = getErrorMessages(bindingResult);
//				
//				NexacroException nexacroException = new NexacroException(errorMessages);
//				nexacroException.setErrorCode(NexacroException.DEFAULT_ERROR_CODE);
//				nexacroException.setErrorMsg(errorMessages);
//				
//				throw nexacroException;
//			}
//		}
//	}
//	
//	/**
//	 * getErrorMessages
//	 * @param bindingResult
//	 */
//	private String getErrorMessages(BindingResult bindingResult) {
//		StringBuffer sb = new StringBuffer();
//		
//		for (ObjectError error : bindingResult.getAllErrors()) {
//			sb.append(error.getDefaultMessage()).append("\n");
//		}
//		
//		return sb.toString();
//	}
	
	
	////////////////////
	
	   
    //조인 없이 기본
//    //사원번호로 검색 - select
//    @RequestMapping(value = "/salSelectVO.do")
//    public NexacroResult selectSalEmpVo(@ParamDataSet(name = "ds_search", required = false) SalaryVO searchVo) {//넥사크로에서 온거
//    	
//    	List<SalaryVO> salList = salService.salarySelectUserVOList(searchVo);
//    	System.out.println(salList.get(0));
//    	NexacroResult result = new NexacroResult();
//    	result.addDataSet("output1", salList); //넥사크로로 갈거
//    	
//    	return result;
//    }  
//    //급여대장번호로 검색 - select
//    @RequestMapping(value = "/salSelectBookVO.do")
//    public NexacroResult selectSalBookVo(@ParamDataSet(name = "ds_salary", required = false) SalaryVO searchVo) {//넥사크로에서 온거
//    	
//    	List<SalaryVO> salList = salService.salarySelectSalBookVOList(searchVo);
//    	System.out.println(salList.get(0));
//    	NexacroResult result = new NexacroResult();
//    	result.addDataSet("output10", salList); //넥사크로로 갈거
//    	
//    	return result;
//    }
     
    //public NexacroResult selectSalBonEmpBookVoMap(@ParamDataSet(name = "ds_search", required = false) BonusSalVo searchMapVO) {
//    	selectMap.put("searchCondition", searchMapVO.getSalaryBookNo());
//    	selectMap.put("searchKeyword", searchMapVO.getEmpNo());
    	
    	//이거 때문에 그리드 망가진 거야. SALARY에 담아서 보내려고 해서. 그래서 SEARCH 데이터셋에서 보내는 것으로 바꿈.
//    	selectMap.put("salaryBookNo", searchMapVO.getSalaryBookNo());
//    	selectMap.put("empNo", searchMapVO.getEmpNo());//여기서 key 이름이 컬럼명을 말한 건지, 값을 var하고 담은 변수명을 말한 건지
    	//selectMap.put("empUser", searchMapVO.getEmpUser());//concat 하면서 변수명 바꿈. // 아니지 변수명은 그대로에 넣어줄 값도 그대로니까. 그럴 필요가 있어?
//    	System.out.println("확인"+searchMapVO.getSalaryBookNo());
//    	System.out.println("emp확인"+searchMapVO.getEmpNo());
    	
	
//    @RequestMapping(value = "/salBonSelectEmpBookVO.do")
//    public NexacroResult selectSalBonEmpBookVoMap(@ParamDataSet(name = "ds_search", required = false) BonusSalVo searchMapVO) {	
//    	selectMap.put("searchCondition", searchMapVO.getSalaryBookNo());
//    	selectMap.put("searchKeyword", searchMapVO.getEmpNo());
    	
    	//이거 때문에 그리드 망가진 거야. SALARY에 담아서 보내려고 해서. 그래서 SEARCH 데이터셋에서 보내는 것으로 바꿈.
//    	selectMap.put("salaryBookNo", searchMapVO.getSalaryBookNo());
//    	selectMap.put("empNo", searchMapVO.getEmpNo());//여기서 key 이름이 컬럼명을 말한 건지, 값을 var하고 담은 변수명을 말한 건지
    	//selectMap.put("empUser", searchMapVO.getEmpUser());//concat 하면서 변수명 바꿈. // 아니지 변수명은 그대로에 넣어줄 값도 그대로니까. 그럴 필요가 있어?
//    	System.out.println("확인"+searchMapVO.getSalaryBookNo());
//    	System.out.println("emp확인"+searchMapVO.getEmpNo());
    	
    	
		////////////
//    @RequestMapping(value = "/salBonSelectEmpBookVO.do")
//    public NexacroResult selectSalBonEmpBookVoMap(@ParamDataSet(name = "ds_search", required = false) BonusSalVo searchMapVO) {
//    	selectMap.put("searchCondition", searchMapVO.getSalaryBookNo());
//    	selectMap.put("searchKeyword", searchMapVO.getEmpNo());
    	
    	//이거 때문에 그리드 망가진 거야. SALARY에 담아서 보내려고 해서. 그래서 SEARCH 데이터셋에서 보내는 것으로 바꿈.
//    	selectMap.put("salaryBookNo", searchMapVO.getSalaryBookNo());
//    	selectMap.put("empNo", searchMapVO.getEmpNo());//여기서 key 이름이 컬럼명을 말한 건지, 값을 var하고 담은 변수명을 말한 건지
    	//selectMap.put("empUser", searchMapVO.getEmpUser());//concat 하면서 변수명 바꿈. // 아니지 변수명은 그대로에 넣어줄 값도 그대로니까. 그럴 필요가 있어?
//    	System.out.println("확인"+searchMapVO.getSalaryBookNo());
//    	System.out.println("emp확인"+searchMapVO.getEmpNo());
    	
    //하단 select - 사원번호 + 급여대장번호
    // 수당 
//    @RequestMapping(value = "/salBonSelectEmpBookVO.do")
//    public NexacroResult selectSalBonEmpBookVoMap(@ParamDataSet(name = "ds_search", required = false) BonusSalVo searchMapVO) {
// 
//    	selectMap.put("searchCondition", searchMapVO.getSalaryBookNo());
//    	selectMap.put("searchKeyword", searchMapVO.getEmpNo());
    	
    	//이거 때문에 그리드 망가진 거야. SALARY에 담아서 보내려고 해서. 그래서 SEARCH 데이터셋에서 보내는 것으로 바꿈.
//    	selectMap.put("salaryBookNo", searchMapVO.getSalaryBookNo());
//    	selectMap.put("empNo", searchMapVO.getEmpNo());//여기서 key 이름이 컬럼명을 말한 건지, 값을 var하고 담은 변수명을 말한 건지
    	//selectMap.put("empUser", searchMapVO.getEmpUser());//concat 하면서 변수명 바꿈. // 아니지 변수명은 그대로에 넣어줄 값도 그대로니까. 그럴 필요가 있어?
//    	System.out.println("확인"+searchMapVO.getSalaryBookNo());
//    	System.out.println("emp확인"+searchMapVO.getEmpNo());
    	
	
	//하단 급여 세부 조인 없이  ---- select
	// 수당 조인 없이
//    @RequestMapping(value = "/salBonSelectVO.do")
//	public NexacroResult selectSalBonEmpVo(@ParamDataSet(name = "ds_search", required = false) BonusSalVo searchVo) {
//        
//        List<BonusSalVo> salBonList = salService.salaryBonSelectUserVOList(searchVo);
//        System.out.println(salBonList.get(0));
//        NexacroResult resultBon = new NexacroResult();
//        System.out.println("넥사크로 결과"+resultBon);
//        resultBon.addDataSet("outputBon", salBonList);
//        
//        return resultBon;
//    }	
	
//    // 경비 조인 없이
//    @RequestMapping(value = "/salCostSelectVO.do")
//    public NexacroResult selectSalCostEmpVo(@ParamDataSet(name = "ds_search", required = false) CostSalVO searchVo) {
//    	
//    	List<CostSalVO> salCostList = salService.salaryCostSelectUserVOList(searchVo);
//    	System.out.println(salCostList.get(0));
//    	NexacroResult resultCost = new NexacroResult();
//    	System.out.println("넥사크로 결과"+resultCost);
//    	resultCost.addDataSet("outputCost", salCostList);
//    	
//    	return resultCost;
//    }	
	
//    // 세금 조인 없이
//    @RequestMapping(value = "/salTaxSelectVO.do")
//    public NexacroResult selectSalTaxEmpVo(@ParamDataSet(name = "ds_search", required = false) TaxSalVo searchVo) {
//    	
//    	List<TaxSalVo> salTaxList = salService.salaryTaxSelectUserVOList(searchVo);
//    	//System.out.println(salTaxList.get(0)); //값 확인용
//    	NexacroResult resultTax = new NexacroResult();
//    	System.out.println("넥사크로 결과"+resultTax);
//    	resultTax.addDataSet("outputTax", salTaxList);
//    	
//    	return resultTax;
//    }   	
		
}