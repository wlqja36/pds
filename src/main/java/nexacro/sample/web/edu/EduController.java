package nexacro.sample.web.edu;

import java.util.List;

import javax.annotation.Resource;

import nexacro.sample.service.edu.EduService;
import nexacro.sample.vo.edu.EduVO;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.spring.NexacroException;
import com.nexacro.spring.annotation.ParamDataSet;
import com.nexacro.spring.data.NexacroResult;


@Controller
public class EduController {
	
	@Resource(name = "eduService")
	private EduService eduService;
	
	@RequestMapping(value = "/selectEdu.do")
	public NexacroResult selectEdu(
			@ParamDataSet(name = "ds_search", required = false) EduVO searchVO){
		
		List<EduVO> eduList = eduService.selectEdu(searchVO);	
		
		for(int i = 0; i < eduList.size(); i++){
			String emp_no = eduList.get(i).getEMP_NO()+"("+eduList.get(i).getEMP_NAME()+")";
			String ok = eduList.get(i).getACCEPT_EMP_NO()+"("+eduList.get(i).getOK_EMP_NAME()+")";
			System.out.println(ok);
			eduList.get(i).setEMP_NO(emp_no);
			eduList.get(i).setACCEPT_EMP_NO(ok);
		}
		
		
		NexacroResult result = new NexacroResult();
		result.addDataSet("output", eduList); //edulist를 넥사크로의 output에다 저장
		return result;
	}
	
	//수정삭제신규
	@RequestMapping(value = "/modifyEdu.do")
	public NexacroResult modifyEdu(@ParamDataSet(name = "ds_input") List<EduVO> modifyList) throws NexacroException {
		
		System.out.println(modifyList.size());	
		eduService.modifyMultiEduVO(modifyList);
		NexacroResult result = new NexacroResult();

		return result;
	}

	
	
	
}
