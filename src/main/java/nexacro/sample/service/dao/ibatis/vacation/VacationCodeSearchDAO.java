package nexacro.sample.service.dao.ibatis.vacation;

import java.util.List;

import nexacro.sample.vo.vacation.vacationCodeSearchVO;
import nexacro.sample.vo.vacation.vacationCodeVO;

import org.springframework.stereotype.Repository;

import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;

@Repository("vacationCodeSearchDAO")
public class VacationCodeSearchDAO extends NexacroIbatisAbstractDAO{

	public List<vacationCodeSearchVO> selectVacationSearchCodeVOList(vacationCodeSearchVO searchVO){
		return (List<vacationCodeSearchVO>) list("selectVacationSearchCodeVO",searchVO );
	}
	
	public void insertVacationCodeVO(vacationCodeSearchVO vacation){
		insert("insertVacationCodeVO", vacation);
	}
	
	public void updateVacationCodeVO(vacationCodeSearchVO vacation){
		update("updateVacationCodeVO", vacation);
	}
	
	public void deleteVacationCodeVO(vacationCodeSearchVO vacation){
		delete("deleteVacationCodeVO", vacation);
	}
}
