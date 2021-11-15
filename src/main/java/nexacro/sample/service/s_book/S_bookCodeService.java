package nexacro.sample.service.s_book;

import java.util.List;

import nexacro.sample.vo.s_bookVO.S_bookCodeVO;
import nexacro.sample.vo.vacation.vacationCodeSearchVO;
import nexacro.sample.vo.vacation.vacationCodeVO;

public interface S_bookCodeService {

	List<S_bookCodeVO> selectS_bookSearchCodeVOList(S_bookCodeVO SearchVO);
	
	void modfiyMultiS_bookSearchCodeVO(List<S_bookCodeVO> modifyList);
}
