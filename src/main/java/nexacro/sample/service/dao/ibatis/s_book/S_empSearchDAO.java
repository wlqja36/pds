package nexacro.sample.service.dao.ibatis.s_book;

import java.util.List;

import nexacro.sample.vo.s_bookVO.S_bookCodeVO;
import nexacro.sample.vo.s_bookVO.S_empSearchVO;
import nexacro.sample.vo.vacation.vacationCodeSearchVO;
import nexacro.sample.vo.vacation.vacationCodeVO;

import org.springframework.stereotype.Repository;

import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;

@Repository("s_empSearchDAO")
public class S_empSearchDAO extends NexacroIbatisAbstractDAO{

	public List<S_empSearchVO> selects_empSearchVOList(S_empSearchVO searchVO){
		return (List<S_empSearchVO>) list("selects_empSearchVO",searchVO );
	}
	
	
}
