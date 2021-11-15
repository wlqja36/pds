package nexacro.sample.service.impl.Oct_vacation;

import java.util.List;

import javax.annotation.Resource;

import nexacro.sample.service.Oct_vacation.Oct_vacationInfoService;

import nexacro.sample.service.dao.mybatis.Oct_vacation.Oct_vacationInfoDAO;

import nexacro.sample.vo.Oct_vacation.Oct_vacationInfoVO;









import org.springframework.stereotype.Service;

import com.nexacro.spring.data.DataSetRowTypeAccessor;
import com.nexacro.xapi.data.DataSet;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("Oct_vacationInfoService")
public class Oct_vacationInfoServiceImpl extends EgovAbstractServiceImpl implements Oct_vacationInfoService {

	@Resource(name = "Oct_vacationInfoDAOImpl")
	private Oct_vacationInfoDAO Oct_vacationInfoDAO;

	@Override
	public List<Oct_vacationInfoVO> selectOctVacationInfoVOList(Oct_vacationInfoVO Oct_vacationInfoVO) {
		
		
		return Oct_vacationInfoDAO.selectOctVacationInfoVOList(Oct_vacationInfoVO);
	}

	
	@Override
	public void modfiyMultiOctVacationInfoVO(List<Oct_vacationInfoVO> modifyList){
		
		int size = modifyList.size();
		for(int i =0; i<size; i++){
		Oct_vacationInfoVO vacation = modifyList.get(i);
		if(vacation instanceof DataSetRowTypeAccessor){
			DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor)vacation;	
			
			if(accessor.getRowType() == DataSet.ROW_TYPE_INSERTED){
				Oct_vacationInfoDAO.insertOctVacationInfoVO(vacation);
			}else if(accessor.getRowType() == DataSet.ROW_TYPE_UPDATED){
				Oct_vacationInfoDAO.updateOctVacationInfoVO(vacation);
			}else if(accessor.getRowType() == DataSet.ROW_TYPE_DELETED){
				Oct_vacationInfoDAO.deleteOctVacationInfoVO(vacation);
			}
		}	
	}	
}
		
}
