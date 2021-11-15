package nexacro.sample.web.Oct_emp;

import java.util.List;

import javax.annotation.Resource;

import nexacro.sample.service.Oct_emp.YJB_EmpService;
import nexacro.sample.vo.Oct_emp.YJB_EmpVO;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;








import com.nexacro.spring.annotation.ParamDataSet;
import com.nexacro.spring.data.NexacroResult;

@Controller
public class YJB_EmpController {

	@Resource(name = "YJB_empService")
	private YJB_EmpService empService;
    
    @RequestMapping(value = "/empSelectVO_YJB.do")
	public NexacroResult selectVo(@ParamDataSet(name = "ds_search", required = false) YJB_EmpVO searchVo) {
    	
	    List<YJB_EmpVO> empList;
		try {
			empList = empService.yjb_selectEmpVOList(searchVo);
			 NexacroResult result = new NexacroResult();
		     result.addDataSet("output1", empList);
		     return result;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
       
        
    }
}
