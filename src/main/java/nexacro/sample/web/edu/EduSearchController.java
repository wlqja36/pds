package nexacro.sample.web.edu;

import java.util.List;

import javax.annotation.Resource;

import nexacro.sample.service.edu.EduSearchService;
import nexacro.sample.service.edu.EduService;
import nexacro.sample.vo.edu.EduVO;
import nexacro.sample.vo.edu.eduSearchVO;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.spring.annotation.ParamDataSet;
import com.nexacro.spring.data.NexacroResult;


@Controller
public class EduSearchController {
	
	@Resource(name = "eduSearchService")
	private EduSearchService eduSearchService;
	
	@RequestMapping(value = "/selectEdu2.do")
	public NexacroResult selectEdu(
			@ParamDataSet(name = "ds_search", required = false) eduSearchVO searchVO){
		
		List<eduSearchVO> eduList = eduSearchService.selectEdu2(searchVO);
		//System.out.println("EMp_NO : " + eduList.get(0).getEmpVO().getEMP_NO());
		NexacroResult result = new NexacroResult();
		result.addDataSet("output", eduList); //edulist를 넥사크로의 output에다 저장
		return result;
	}	
	
}
