package nexacro.sample.service.impl.s_book;

import java.util.List;

import javax.annotation.Resource;

import nexacro.sample.service.dao.ibatis.s_book.S_bookCodeDAO;
import nexacro.sample.service.dao.ibatis.s_book.S_empSearchDAO;
import nexacro.sample.service.dao.ibatis.vacation.VacationCodeSearchDAO;
import nexacro.sample.service.dao.ibatis.vacation.VcationDAO;
import nexacro.sample.service.s_book.S_bookCodeService;
import nexacro.sample.service.s_book.S_empSearchService;
import nexacro.sample.service.vacation.vacationCodeSearchService;
import nexacro.sample.service.vacation.vacationSerivce;
import nexacro.sample.vo.s_bookVO.S_bookCodeVO;
import nexacro.sample.vo.s_bookVO.S_empSearchVO;
import nexacro.sample.vo.vacation.vacationCodeSearchVO;
import nexacro.sample.vo.vacation.vacationCodeVO;

import org.springframework.stereotype.Service;

import com.nexacro.spring.data.DataSetRowTypeAccessor;
import com.nexacro.xapi.data.DataSet;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("s_empSearchService")
public class S_empSearchServiceImpl extends EgovAbstractServiceImpl implements
		S_empSearchService {

	@Resource(name = "s_empSearchDAO")
	private S_empSearchDAO s_empSearchDAO;

	@Override
	public List<S_empSearchVO> selectS_empSearchVOList(S_empSearchVO SearchVO) {
		return s_empSearchDAO.selects_empSearchVOList(SearchVO);
	}

	

	

}
