package nexacro.sample.service.dao.ibatis.vacation;

import java.util.List;

import nexacro.sample.vo.vacation.vacationCodeVO;
import nexacro.sample.vo.vacation.vacationInfoVO;

import org.springframework.stereotype.Repository;

import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;

@Repository("vacationInfoDAO")
public class VcationInfoDAO extends NexacroIbatisAbstractDAO{

	public List<vacationInfoVO> selectVacationInfoVOList(vacationInfoVO searchVO){
		return (List<vacationInfoVO>) list("selectVacationInfoVO",searchVO );
	}
	
	
	public List<vacationInfoVO> selectVacationInfoJoinList(vacationInfoVO searchVO){
		return (List<vacationInfoVO>) list("selectVacaitonJoinVO",searchVO );
	}
	
/*	public List<vacationInfoVO> selectVacationInfoModList(vacationInfoVO searchVO){
		return (List<vacationInfoVO>) list("selectVacationInfoModList",searchVO);
	}*/
	
	public void insertVacationInfoVO(vacationInfoVO vacation){
		insert("insertVacationInfoVO", vacation);
	}
	
	public void updateVacationInfoVO(vacationInfoVO vacation){
		update("updateVacationInfoVO", vacation);
	}
	
	public void deleteVacationInfoVO(vacationInfoVO vacation){
		delete("deleteVacationInfoVO", vacation);
	}

	
	
	public String selectVacaitonJoinVO(vacationInfoVO vacation){
		
		return (String)select("selectVacaitonJoinVO",vacation);
	
	}
}
