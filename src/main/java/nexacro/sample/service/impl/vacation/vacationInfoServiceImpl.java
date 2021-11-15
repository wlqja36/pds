package nexacro.sample.service.impl.vacation;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import nexacro.sample.service.dao.ibatis.vacation.VcationDAO;
import nexacro.sample.service.dao.ibatis.vacation.VcationInfoDAO;
import nexacro.sample.service.vacation.vacationInfoService;
import nexacro.sample.service.vacation.vacationSerivce;
import nexacro.sample.vo.vacation.vacationCodeVO;
import nexacro.sample.vo.vacation.vacationInfoVO;

import org.springframework.stereotype.Service;

import com.nexacro.spring.data.DataSetRowTypeAccessor;
import com.nexacro.xapi.data.DataSet;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("vacationInfoService")
public class vacationInfoServiceImpl extends EgovAbstractServiceImpl implements vacationInfoService {

	@Resource(name = "vacationInfoDAO")
	private VcationInfoDAO vacationInfoDAO;

	@Override
	public List<vacationInfoVO> selectVacationInfoVOList(vacationInfoVO vacationInfoVO) {
		
		
		return vacationInfoDAO.selectVacationInfoVOList(vacationInfoVO);
	}
	@Override
	public List<vacationInfoVO> selectVacationInfoJoinList(vacationInfoVO vacationInfoVO) {
		
		return vacationInfoDAO.selectVacationInfoJoinList(vacationInfoVO);
	}
	public String selectVacaitonJoinVO(vacationInfoVO vacation){
		
		return vacationInfoDAO.selectVacaitonJoinVO(vacation);
	
	}
/*	@Override
	public List<vacationInfoVO> selectVacationModList(vacationInfoVO vacationInfoVO) {
		
		
		return vacationInfoDAO.selectVacationInfoModList(vacationInfoVO);
	}*/
	
	@Override
	public void modfiyMultiVacationInfoVO(List<vacationInfoVO> modifyList){
		
		int size = modifyList.size();
		for(int i =0; i<size; i++){
		vacationInfoVO vacation = modifyList.get(i);
		if(vacation instanceof DataSetRowTypeAccessor){
			DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor)vacation;	
			
			if(accessor.getRowType() == DataSet.ROW_TYPE_INSERTED){
				vacationInfoDAO.insertVacationInfoVO(vacation);
			}else if(accessor.getRowType() == DataSet.ROW_TYPE_UPDATED){
				vacationInfoDAO.updateVacationInfoVO(vacation);
			}else if(accessor.getRowType() == DataSet.ROW_TYPE_DELETED){
				vacationInfoDAO.deleteVacationInfoVO(vacation);
			}
		}	
	}	
}
		
}
