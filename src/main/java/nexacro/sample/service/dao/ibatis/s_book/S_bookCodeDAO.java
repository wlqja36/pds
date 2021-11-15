package nexacro.sample.service.dao.ibatis.s_book;

import java.util.List;

import nexacro.sample.vo.s_bookVO.S_bookCodeVO;
import nexacro.sample.vo.vacation.vacationCodeSearchVO;
import nexacro.sample.vo.vacation.vacationCodeVO;

import org.springframework.stereotype.Repository;

import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;

@Repository("s_bookcodeDAO")
public class S_bookCodeDAO extends NexacroIbatisAbstractDAO{

	public List<S_bookCodeVO> selects_bookSearchCodeVOList(S_bookCodeVO searchVO){
		return (List<S_bookCodeVO>) list("selects_bookSearchCodeVO",searchVO );
	}
	
	public void inserts_bookCodeVO(S_bookCodeVO s_code){
		insert("inserts_bookCodeVO", s_code);
	}
	
	public void updates_bookCodeVO(S_bookCodeVO s_code){
		update("updates_bookCodeVO", s_code);
	}
	
	public void deletes_bookCodeVO(S_bookCodeVO s_code){
		delete("deletes_bookCodeVO", s_code);
	}
}
