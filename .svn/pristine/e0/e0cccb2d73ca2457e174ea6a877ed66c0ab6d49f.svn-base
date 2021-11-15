package nexacro.sample.service.impl.vacation;

import java.util.List;

import javax.annotation.Resource;

import nexacro.sample.service.dao.ibatis.vacation.VcationDAO;
import nexacro.sample.service.vacation.vacationSerivce;
import nexacro.sample.vo.vacation.vacationCodeVO;

import org.springframework.stereotype.Service;

import com.nexacro.spring.data.DataSetRowTypeAccessor;
import com.nexacro.xapi.data.DataSet;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("vacationService")
public class vacationServiceImpl extends EgovAbstractServiceImpl implements vacationSerivce {

	@Resource(name = "vacationDAO")
	private VcationDAO vacationDAO;

	@Override
	public List<vacationCodeVO> selectVacationCodeVOList(vacationCodeVO vacationcodeVO) {

		return vacationDAO.selectVacationCodeVOList(vacationcodeVO);
	}
	

	@Override
	public void modfiyMultiVacationCodeVO(List<vacationCodeVO> modifyList){
		
		int size = modifyList.size();
		for(int i =0; i<size; i++){
		vacationCodeVO vacation = modifyList.get(i);
		if(vacation instanceof DataSetRowTypeAccessor){
			DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor)vacation;	
			
			if(accessor.getRowType() == DataSet.ROW_TYPE_INSERTED){
				vacationDAO.insertVacationCodeVO(vacation);
			}else if(accessor.getRowType() == DataSet.ROW_TYPE_UPDATED){
				vacationDAO.updateVacationCodeVO(vacation);
			}else if(accessor.getRowType() == DataSet.ROW_TYPE_DELETED){
				vacationDAO.deleteVacationCodeVO(vacation);
			}
		}	
	}	
}
		
}
