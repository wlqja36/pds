package nexacro.sample.service.impl.Oct_vacation;

import java.util.List;

import javax.annotation.Resource;

import nexacro.sample.service.Oct_vacation.Oct_vacationService;
import nexacro.sample.service.dao.mybatis.Oct_vacation.Oct_vacationDAO;
import nexacro.sample.vo.Oct_vacation.Oct_vacationCodeVO;

import org.springframework.stereotype.Service;

import com.nexacro.spring.data.DataSetRowTypeAccessor;
import com.nexacro.xapi.data.DataSet;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("Oct_vacationService")
public class Oct_vacationCodeServiceImpl extends EgovAbstractServiceImpl implements Oct_vacationService {

	@Resource(name = "Oct_vacationDAOImpl")
	private Oct_vacationDAO Oct_vacationDAO;

	@Override
	public List<Oct_vacationCodeVO> selectOctVacationCodeVOList(Oct_vacationCodeVO searchVO) {

		return Oct_vacationDAO.selectVacationCodeVOList(searchVO);
	}
	

	@Override
	public void modfiyMultiOctVacationCodeVO(List<Oct_vacationCodeVO> modifyList){
		
		int size = modifyList.size();
		for(int i =0; i<size; i++){
		Oct_vacationCodeVO vacation = modifyList.get(i);
		if(vacation instanceof DataSetRowTypeAccessor){
			DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor)vacation;	
			
			if(accessor.getRowType() == DataSet.ROW_TYPE_INSERTED){
				Oct_vacationDAO.insertVacationCodeVO(vacation);
			}else if(accessor.getRowType() == DataSet.ROW_TYPE_UPDATED){
				Oct_vacationDAO.updateVacationCodeVO(vacation);
			}else if(accessor.getRowType() == DataSet.ROW_TYPE_DELETED){
				Oct_vacationDAO.deleteVacationCodeVO(vacation);
			}
		}	
	}	
}



		
}
