package nexacro.sample.service.dao.ibatis.vacation;

import java.util.List;

import nexacro.sample.vo.vacation.vacationCodeVO;

import org.springframework.stereotype.Repository;

import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;

@Repository("vacationDAO")
public class VcationDAO extends NexacroIbatisAbstractDAO{

	public List<vacationCodeVO> selectVacationCodeVOList(vacationCodeVO searchVO){
		return (List<vacationCodeVO>) list("selectVacationCodeVO",searchVO );
	}

	
	public void insertVacationCodeVO(vacationCodeVO vacation){
		insert("insertVacationCodeVO", vacation);
	}
	
	public void updateVacationCodeVO(vacationCodeVO vacation){
		update("updateVacationCodeVO", vacation);
	}
	
	public void deleteVacationCodeVO(vacationCodeVO vacation){
		delete("deleteVacationCodeVO", vacation);
	}
}
