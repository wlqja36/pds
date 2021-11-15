package nexacro.sample.service.impl.s_book;

import java.util.List;

import javax.annotation.Resource;

import nexacro.sample.service.dao.ibatis.s_book.S_bookCodeDAO;
import nexacro.sample.service.dao.ibatis.vacation.VacationCodeSearchDAO;
import nexacro.sample.service.dao.ibatis.vacation.VcationDAO;
import nexacro.sample.service.s_book.S_bookCodeService;
import nexacro.sample.service.vacation.vacationCodeSearchService;
import nexacro.sample.service.vacation.vacationSerivce;
import nexacro.sample.vo.s_bookVO.S_bookCodeVO;
import nexacro.sample.vo.vacation.vacationCodeSearchVO;
import nexacro.sample.vo.vacation.vacationCodeVO;

import org.springframework.stereotype.Service;

import com.nexacro.spring.data.DataSetRowTypeAccessor;
import com.nexacro.xapi.data.DataSet;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("s_bookCodeService")
public class S_bookCodeServiceImpl extends EgovAbstractServiceImpl implements
		S_bookCodeService {

	@Resource(name = "s_bookcodeDAO")
	private S_bookCodeDAO s_bookcodeDAO;

	@Override
	public List<S_bookCodeVO> selectS_bookSearchCodeVOList(S_bookCodeVO SearchVO) {
		return s_bookcodeDAO.selects_bookSearchCodeVOList(SearchVO);
	}

	@Override
	public void modfiyMultiS_bookSearchCodeVO(List<S_bookCodeVO> modifyList) {
		int size = modifyList.size();
		for (int i = 0; i < size; i++) {
			S_bookCodeVO s_code = modifyList.get(i);
			if (s_code instanceof DataSetRowTypeAccessor) {
				DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) s_code;

				if (accessor.getRowType() == DataSet.ROW_TYPE_INSERTED) {
					s_bookcodeDAO.inserts_bookCodeVO(s_code);
				} else if (accessor.getRowType() == DataSet.ROW_TYPE_UPDATED) {
					s_bookcodeDAO.updates_bookCodeVO(s_code);
				} else if (accessor.getRowType() == DataSet.ROW_TYPE_DELETED) {
					s_bookcodeDAO.deletes_bookCodeVO(s_code);
				}
			}
		}

	}

}
