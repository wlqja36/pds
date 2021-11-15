package nexacro.sample.web.Oct_com;

import java.util.HashMap;
import java.util.List;
import java.util.Map;













import javax.annotation.Resource;













import nexacro.sample.service.Oct_com.YJB_CodeService;
import nexacro.sample.vo.Oct_com.YJB_ComCodeVO;
import nexacro.sample.vo.Oct_com.YJB_DetailCodeVO;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.spring.NexacroException;
import com.nexacro.spring.annotation.ParamDataSet;
import com.nexacro.spring.annotation.ParamVariable;
import com.nexacro.spring.data.NexacroResult;


@Controller
public class YJB_CommonController {
	
	@Resource (name="YJB_codeService")
	YJB_CodeService codeService;
	
	// 코드마스터 전체내역 조회하기
	@RequestMapping(value = "com/YJB_selectCode.do")
	public NexacroResult selectCode(
			@ParamDataSet(name = "ds_search", required = false) YJB_ComCodeVO comCodeVO){

		List<YJB_ComCodeVO> comCodeList;
		try {
			comCodeList = codeService.yjb_selectCode(comCodeVO);

			NexacroResult result = new NexacroResult();
			result.addDataSet("ds_output", comCodeList);
			
			return result;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	// 코드마스터 입력, 수정, 삭제
	@RequestMapping(value = "com/YJB_editCode.do")
	public NexacroResult editCode(
			@ParamDataSet(name = "ds_input", required = false) List<YJB_ComCodeVO> comCodeVO) throws NexacroException{
		System.out.println("master : "+comCodeVO.get(0).getClassCode()   );
		String confirmStr;
		try {
			confirmStr = codeService.editCode(comCodeVO);
			NexacroResult result = new NexacroResult();
			result.addVariable("confirmStr", confirmStr);		
			return result;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	// 존재하는 마스터 코드인지 검색
		@RequestMapping(value = "com/searchCode.do")
		public NexacroResult searchCode(
				@ParamVariable(name = "classCode") String classCode){
			
			YJB_ComCodeVO comCodeVO;
			try {
				comCodeVO = codeService.searchCode(classCode);
				NexacroResult result = new NexacroResult();
				result.addDataSet("ds_output", comCodeVO);
				
				return result;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
		
		// 상세코드 분류코드 가져오기
		@RequestMapping(value = "com/YJB_selectDetailCode.do")
		public NexacroResult selectDetailCode(){
			
			List<YJB_DetailCodeVO> detailCodeList;
			try {
				detailCodeList = codeService.selectDetailCode();
				NexacroResult result = new NexacroResult();
				result.addDataSet("ds_output", detailCodeList);
				return result;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
		// 분류코드에 따른 상세코드 가져오기
		@RequestMapping(value = "com/YJB_selectDetailList.do")
		public NexacroResult selectDatailList(
				@ParamDataSet(name = "ds_search", required = false) YJB_DetailCodeVO detailCodeVO){
			
			List<YJB_DetailCodeVO> detailCodeList;
			try {
				detailCodeList = codeService.selectDetailList(detailCodeVO);
				NexacroResult result = new NexacroResult();
				result.addDataSet("ds_output", detailCodeList);
				
				return result;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
		
		@RequestMapping(value = "com/YJB_selectDRnum.do")
		public NexacroResult selectDRnum(
					@ParamVariable(name = "detailCode") String detailCode)
		{
			
			
			YJB_DetailCodeVO rnum;
			try {
				rnum = codeService.selectDRnum(detailCode);
				NexacroResult result = new NexacroResult();
				result.addDataSet("ds_output", rnum);
				
				
				return result;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
		
		// 상세코드 입력, 수정, 삭제
		@RequestMapping(value = "com/YJB_editDetailCode.do")
		public NexacroResult editDetailCode(
				@ParamDataSet(name = "ds_input", required = false) List<YJB_DetailCodeVO> detailCodeVO){
			
			String confirmStr;
			try {
				confirmStr = codeService.editDetailCode(detailCodeVO);
				NexacroResult result = new NexacroResult();
				result.addVariable("confirmStr", confirmStr);
				return result;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
		

		// 존재하는 상세 코드인지 검색
		@RequestMapping(value = "com/YJB_searchDetailCode.do")
		public NexacroResult searchDetailCode(
				@ParamVariable(name = "detailCode") String detailCode){
			
			try {
				YJB_DetailCodeVO detailCodeVO;
				detailCodeVO = codeService.searchDetailCode(detailCode);
				NexacroResult result = new NexacroResult();
				result.addDataSet("ds_output", detailCodeVO);
				
				return result;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
		
		
	/* 아직안함
	@RequestMapping(value = "common/selectRnum.do")
	public NexacroResult selectRnum(
				@ParamVariable(name = "classCode") String classCode)
	{
		
		
		ComCodeVO rnum = codeService.selectRnum(classCode);
		
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_output", rnum);

		
		return result;
	}
		
	// 분류별 코드번호 또는 코드네임 가져오기
	@RequestMapping(value = "common/detailCode.do")
	public NexacroResult detailCode(
			@ParamVariable(name = "codeSwitch") String codeSwitch){
		
		Map<String, String> switchMap = new HashMap<String, String>();
		switchMap.put("codeSwitch", codeSwitch);
		
		List<ComCodeVO> comCodeList = codeService.detailCode(switchMap);
				
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_output", comCodeList);
		
		return result;
	}
	
	
	
	

	
	
	
	
	*/
}
