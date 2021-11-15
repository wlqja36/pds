package nexacro.sample.service.impl.vacation;

import java.util.List;

import javax.annotation.Resource;

import nexacro.sample.service.dao.ibatis.vacation.VacationCodeSearchDAO;
import nexacro.sample.service.dao.ibatis.vacation.VcationDAO;
import nexacro.sample.service.vacation.vacationCodeSearchService;
import nexacro.sample.service.vacation.vacationSerivce;
import nexacro.sample.vo.vacation.vacationCodeSearchVO;
import nexacro.sample.vo.vacation.vacationCodeVO;

import org.springframework.stereotype.Service;

import com.nexacro.spring.data.DataSetRowTypeAccessor;
import com.nexacro.xapi.data.DataSet;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("vacationCodeSearchService")
public class vacationCodeSerarchServiceImpl extends EgovAbstractServiceImpl implements vacationCodeSearchService {

	@Resource(name = "vacationCodeSearchDAO")
	private VacationCodeSearchDAO vacationCodeSearchDAO;

	@Override
	public List<vacationCodeSearchVO> selectVacationSearchCodeVOList(vacationCodeSearchVO vacationCodeSearchVO) {

		return vacationCodeSearchDAO.selectVacationSearchCodeVOList(vacationCodeSearchVO);
	}

	@Override
	public void modfiyMultiVacationSearchCodeVO(List<vacationCodeSearchVO> modifyList){
		
		int size = modifyList.size();
		for(int i =0; i<size; i++){
			vacationCodeSearchVO vacation = modifyList.get(i);
		if(vacation instanceof DataSetRowTypeAccessor){
			DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor)vacation;	
			
			if(accessor.getRowType() == DataSet.ROW_TYPE_INSERTED){
				vacationCodeSearchDAO.insertVacationCodeVO(vacation);
			}else if(accessor.getRowType() == DataSet.ROW_TYPE_UPDATED){
				vacationCodeSearchDAO.updateVacationCodeVO(vacation);
			}else if(accessor.getRowType() == DataSet.ROW_TYPE_DELETED){
				vacationCodeSearchDAO.deleteVacationCodeVO(vacation);
			}
		}	
	}	
}
		
}
