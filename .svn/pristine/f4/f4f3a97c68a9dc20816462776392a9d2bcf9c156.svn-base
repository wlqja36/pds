package nexacro.sample.service.impl.Oct_vacation;

import java.util.List;

import javax.annotation.Resource;

import nexacro.sample.service.Oct_vacation.Oct_vacationCodeListService;
import nexacro.sample.service.dao.mybatis.Oct_vacation.Oct_vacationCodeListDAO;
import nexacro.sample.vo.Oct_vacation.Oct_vacationCodeListVO;

import org.springframework.stereotype.Service;

import com.nexacro.spring.data.DataSetRowTypeAccessor;
import com.nexacro.xapi.data.DataSet;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("Oct_vacationCodeListService")
public class Oct_vacationCodeListServiceImpl extends EgovAbstractServiceImpl implements Oct_vacationCodeListService {

	@Resource(name = "Oct_vacationCodeListDAOImpl")
	private Oct_vacationCodeListDAO Oct_vacationCodeListDAO;

	@Override
	public List<Oct_vacationCodeListVO> selectOctVacationCodeListVOList(Oct_vacationCodeListVO Oct_vacationCodeListVO) {

		return Oct_vacationCodeListDAO.selectOctVacationCodeListVOList(Oct_vacationCodeListVO);
	}

	@Override
	public void modfiyMultiOctVacationCodeListVO(List<Oct_vacationCodeListVO> modifyList){
		
		int size = modifyList.size();
		for(int i =0; i<size; i++){
			Oct_vacationCodeListVO vacation = modifyList.get(i);
		if(vacation instanceof DataSetRowTypeAccessor){
			DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor)vacation;	
			
			if(accessor.getRowType() == DataSet.ROW_TYPE_INSERTED){
				Oct_vacationCodeListDAO.insertOctVacationCodeListVO(vacation);
			}else if(accessor.getRowType() == DataSet.ROW_TYPE_UPDATED){
				Oct_vacationCodeListDAO.updateOctVacationCodeListVO(vacation);
			}else if(accessor.getRowType() == DataSet.ROW_TYPE_DELETED){
				Oct_vacationCodeListDAO.deleteOctVacationCodeListVO(vacation);
			}
		}	
	}	
}
		
}
