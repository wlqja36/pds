package nexacro.sample.web.vacation;

import java.util.List;

import javax.annotation.Resource;

import nexacro.sample.service.vacation.vacationInfoService;
import nexacro.sample.service.vacation.vacationSerivce;
import nexacro.sample.vo.emp.CareerVO;
import nexacro.sample.vo.vacation.vacationCodeVO;
import nexacro.sample.vo.vacation.vacationInfoVO;
import nexacro.sample.web.emp.CareerController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.spring.NexacroException;
import com.nexacro.spring.annotation.ParamDataSet;
import com.nexacro.spring.data.NexacroResult;

@Controller
public class VacationInfoController {
	private static final Logger log = LoggerFactory.getLogger(CareerController.class);

	@Resource(name = "vacationInfoService")
	private vacationInfoService vacationInfoService;
	
	@Resource
	private Validator validator;
	
	@RequestMapping(value = "vacationInfoSelectVO.do")
	public NexacroResult vacationInfoSelectVO(@ParamDataSet(name = "ds_search", required = false) vacationInfoVO vacationInfoVO){
		
		List<vacationInfoVO> vacationList = vacationInfoService.selectVacationInfoVOList(vacationInfoVO);
		
		for(int i = 0; i<vacationList.size(); i++){
			String emp = vacationList.get(i).getEmp_no()+"("+vacationList.get(i).getEmp_name()+")";
			String re = vacationList.get(i).getModify_emp_id()+"("+vacationList.get(i).getEmp_mod_name()+")";
			String conf = vacationList.get(i).getReg_emp_id()+"("+vacationList.get(i).getEmp_ok_name()+")";
			String ok = vacationList.get(i).getConfirm_emp_id()+"("+vacationList.get(i).getEmp_reg_name()+")";
			
			System.out.println(emp);
			System.out.println(re);
			System.out.println(conf);
			System.out.println(ok);
			
			vacationList.get(i).setEmp_no(emp);
			vacationList.get(i).setModify_emp_id(re);
			vacationList.get(i).setReg_emp_id(conf);
			vacationList.get(i).setConfirm_emp_id(ok);
		}
		NexacroResult result = new NexacroResult();
		result.addDataSet("output2",vacationList);
		//result.addDataSet("output2",vacationJoinList);
		
		return result;
	}
	
/*	//조인문 가져오기
	@RequestMapping(value = "vacationInfoSelectJoinVO.do")
	public NexacroResult vacationInfoSelectJoinVO(@ParamDataSet(name = "ds_search", required = false) vacationInfoVO vacationInfoVO){
		
		System.out.println(vacationInfoVO.getSearchKeyword());
		List<vacationInfoVO> vacationList = vacationInfoService.selectVacationInfoVOList(vacationInfoVO);
		NexacroResult result = new NexacroResult();
		result.addDataSet("output2",vacationList);
		
		return result;
	}*/


	@RequestMapping(value = "vacationInfoModifyVO.do")
	public NexacroResult vacationInfoModifyVO(@ParamDataSet(name = "input2") List<vacationInfoVO> modifyList) throws NexacroException {

		validate(modifyList);		
		
		//등록버튼 클릭시 발생
		//해당 행 0번째를 넣어 돌린다
		//쿼리에서 결과값(입사일을 가져온다/리턴되어 돌아온값은 올해년도(ex:2021XXXXXX)가 될것이다)
		//결과값을 가지고 다시 돌린다
		//서비스 임플 vacation메소드에서 연산후 인서트한다
		/*int vacation = vacationInfoService.vacation(vacationInfoService.selectVacaitonJoinVO(modifyList.get(0)));	*/
	/*	System.out.println("asdsadsadsadd"+vacationInfoService.selectVacaitonJoinVO(modifyList.get(0)));*/
		//발생휴가일수 셋팅
		/*modifyList.get(0).setVacation_days(vacation);*/
		
		//들어온 리스트 값을 넘겨 등록한다
		vacationInfoService.modfiyMultiVacationInfoVO(modifyList);
		
		NexacroResult result = new NexacroResult();
		return result;
	}
	
    private void validate(List<vacationInfoVO> modifyList) throws NexacroException {
		BindingResult bindingResult = null;
		for (vacationInfoVO vacationInfoVO : modifyList) {
			bindingResult = new BeanPropertyBindingResult(vacationInfoVO, "vacationInfoVO");
			validator.validate(vacationInfoVO, bindingResult);
			if (bindingResult.hasErrors()) {
				String errorMessages = getErrorMessages(bindingResult);

				NexacroException nexacroException = new NexacroException(errorMessages);
				nexacroException.setErrorCode(NexacroException.DEFAULT_ERROR_CODE);
				nexacroException.setErrorMsg(errorMessages);

				throw nexacroException;
			}
		}
	}
    /**
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

}
