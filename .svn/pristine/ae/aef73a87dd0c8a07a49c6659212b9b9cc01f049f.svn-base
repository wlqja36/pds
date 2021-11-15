package nexacro.sample.web.attendance;

import java.util.List;

import javax.annotation.Resource;

import nexacro.sample.service.administrator.AdmService;
import nexacro.sample.service.attendance.AttendanceService;
import nexacro.sample.vo.attendanceVO.AttendanceDetailVO;
import nexacro.sample.vo.attitudeVO.AttitudeBookVO;
import nexacro.sample.web.attitude.AttitudeBookController;

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
import com.nexacro.spring.annotation.ParamVariable;
import com.nexacro.spring.data.NexacroResult;

@Controller
public class AttendanceController {

private static final Logger log = LoggerFactory.getLogger(AttitudeBookController.class);
	
	// Name 정의
	// @Autowired(required = false) // Type 정의
	@Resource(name = "attendanceService")
	private AttendanceService	attendanceService;
	

	

	@Resource
	private Validator	validator;

    @InitBinder
	public void initBinder(WebDataBinder dataBinder){
		dataBinder.setValidator(this.validator);
	}

    
    //삽입,수정,삭제
    @RequestMapping(value = "/attendanceModifyVO.do")
	public NexacroResult modifyVO(@ParamDataSet(name = "input1") List<AttendanceDetailVO> modifyList) throws NexacroException {
		
		validate(modifyList);

		
		
		attendanceService.modifyAttendanceDetailVO(modifyList);
		
	
		

		NexacroResult result = new NexacroResult();
		//result.addVariable("yook", attitudeBookService.selectAttitudeSeq());
		
		return result;
	}
	
	
    
    //조회
    @RequestMapping(value = "/attendanceListSelectVO.do")
 	public NexacroResult selectVo(@ParamDataSet(name = "ds_search", required = false) AttendanceDetailVO searchVo) {
         
         List<AttendanceDetailVO> attendanceList = attendanceService.selectAttendanceList(searchVo);
         
         
         
         
         NexacroResult result = new NexacroResult();
         result.addDataSet("output1", attendanceList);
         
         
         
         
         return result;
     }
    
   
    
    
    //bulk insert
    @RequestMapping(value = "/insertBulkAttendance.do")
	public NexacroResult bulkVO(@ParamVariable(name = "searchParam") String searchParam,
			                      @ParamVariable(name = "holidayYn") String holidayYn) throws NexacroException {
		
		
    	if(holidayYn.equals("N")){
		// 평일 세팅
		attendanceService.insertBulkAttendance_WD(searchParam);
		
		System.out.println("평일이다");
		
    	}else{
		
		//주말, 공휴일 세팅
		 attendanceService.insertBulkAttendance_WE(searchParam);
		 
		 System.out.println("휴일이다");
    	}
		
		NexacroResult result = new NexacroResult();
		//result.addVariable("yook", attitudeBookService.selectAttitudeSeq());
		
		
		if(result != null){
			System.out.println("======여기다 추가하면 되겠지??? 업데이트 시킬예정");
			attendanceService.updateAttitudeInfo(searchParam);
			
		}
		
		
		return result;
	}
    
    
    //selectMaxDate
    @RequestMapping(value = "/selectMaxDate.do")
   	public NexacroResult bulkVO(@ParamDataSet(name = "ds_search") AttendanceDetailVO searchVo) throws NexacroException {
   		
   		
    	String selectMaxDate=attendanceService.selectMaxDate(searchVo);
    	   		
   		NexacroResult result = new NexacroResult();
   		
   		result.addVariable("selectMaxDate", selectMaxDate);
   		   		
   		return result;
   	}
       
    
    

    
    
    
    
	/**
	 * validate
	 * @param modifyList
	 * @throws NexacroException
	 */
	private void validate(List<AttendanceDetailVO> modifyList) throws NexacroException {
		BindingResult bindingResult = null;
		for (AttendanceDetailVO attendanceDetailVO : modifyList) {
			bindingResult = new BeanPropertyBindingResult(attendanceDetailVO, "attendanceDetailVO");
			validator.validate(attendanceDetailVO, bindingResult);
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
