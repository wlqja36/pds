package nexacro.sample.service.impl.Oct_SalaryBook;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.nexacro.spring.data.DataSetRowTypeAccessor;
import com.nexacro.xapi.data.DataSet;

import nexacro.sample.service.Oct_SalaryBook.Oct_SalarybookService;
import nexacro.sample.service.dao.ibatis.s_book.S_bookDAO;
import nexacro.sample.service.dao.mybatis.Oct_SalaryBook.Oct_SalaryBookDAO;
import nexacro.sample.service.s_book.S_bookService;
import nexacro.sample.vo.Oct_SalaryBook.Oct_SalaryBookVO;
import nexacro.sample.vo.s_bookVO.S_bookVO;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("Oct_SalarybookService")
public class Oct_SalaryBookServiceImpl extends EgovAbstractServiceImpl implements Oct_SalarybookService {

	@Resource(name = "Oct_SalaryBookDAOImpl")
	private Oct_SalaryBookDAO Oct_SalaryBookDAO;

	@Override
	public List<Oct_SalaryBookVO> selectOctSalaryBookVOList(Oct_SalaryBookVO searchVO) {
		return Oct_SalaryBookDAO.selectOctSalaryBookVOList(searchVO);
	}

	@Override
	public void modifyMultiOctSalaryBookVO(List<Oct_SalaryBookVO> modifyList) {
		int size = modifyList.size();
		for (int i = 0; i < size; i++) {
			Oct_SalaryBookVO SalaryBook = modifyList.get(i);
			if (SalaryBook instanceof DataSetRowTypeAccessor) {
				DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) SalaryBook;

				if (accessor.getRowType() == DataSet.ROW_TYPE_INSERTED) {
					Oct_SalaryBookDAO.insertOctSalaryBookVO(SalaryBook);
				} else if (accessor.getRowType() == DataSet.ROW_TYPE_UPDATED) {
					Oct_SalaryBookDAO.updateOctSalaryBookVO(SalaryBook);
				} else if (accessor.getRowType() == DataSet.ROW_TYPE_DELETED) {
					Oct_SalaryBookDAO.deleteOctSalaryBookVO(SalaryBook);
				}
			}

		}

	}

	
}

