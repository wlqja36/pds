package nexacro.sample.service.impl.s_book;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.nexacro.spring.data.DataSetRowTypeAccessor;
import com.nexacro.xapi.data.DataSet;

import nexacro.sample.service.dao.ibatis.s_book.S_bookDAO;
import nexacro.sample.service.s_book.S_bookService;

import nexacro.sample.vo.s_bookVO.S_bookVO;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("sbService")
public class S_bookServiceImpl extends EgovAbstractServiceImpl implements
		S_bookService {

	@Resource(name = "sbDAO")
	private S_bookDAO sbDAO;

	@Override
	public List<S_bookVO> selectUserVOList(S_bookVO searchVO) {
		return sbDAO.selectUserVOList(searchVO);
	}

	@Override
	public void modifyMultiUserVO(List<S_bookVO> modifyList) {
		int size = modifyList.size();
		for (int i = 0; i < size; i++) {
			S_bookVO sb = modifyList.get(i);
			if (sb instanceof DataSetRowTypeAccessor) {
				DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) sb;

				if (accessor.getRowType() == DataSet.ROW_TYPE_INSERTED) {
					sbDAO.insertUserVO(sb);
				} else if (accessor.getRowType() == DataSet.ROW_TYPE_UPDATED) {
					sbDAO.updateUserVO(sb);
				} else if (accessor.getRowType() == DataSet.ROW_TYPE_DELETED) {
					sbDAO.deleteUserVO(sb);
				}
			}

		}

	}

	
}

