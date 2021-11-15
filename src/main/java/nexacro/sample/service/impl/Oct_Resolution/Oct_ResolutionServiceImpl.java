package nexacro.sample.service.impl.Oct_Resolution;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.nexacro.spring.data.DataSetRowTypeAccessor;
import com.nexacro.xapi.data.DataSet;

import nexacro.sample.service.Oct_Resolution.Oct_ResolutionService;
import nexacro.sample.service.Oct_SalaryBook.Oct_SalarybookService;
import nexacro.sample.service.dao.ibatis.s_book.S_bookDAO;
import nexacro.sample.service.dao.mybatis.Oct_Resolution.Oct_ResolutionDAO;
import nexacro.sample.service.dao.mybatis.Oct_SalaryBook.Oct_SalaryBookDAO;
import nexacro.sample.service.s_book.S_bookService;
import nexacro.sample.vo.Oct_SalaryBook.Oct_SalaryBookVO;
import nexacro.sample.vo.Oct_emp.YJB_EmpVO;
import nexacro.sample.vo.Oct_resolution.Oct_ResolutionVO;
import nexacro.sample.vo.s_bookVO.S_bookVO;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("Oct_ResolutionService")
public class Oct_ResolutionServiceImpl extends EgovAbstractServiceImpl implements Oct_ResolutionService {

	@Resource(name = "Oct_ResolutionDAOImpl")
	private Oct_ResolutionDAO Oct_ResolutionDAO;


	@Override
	public List<Oct_ResolutionVO> selectOctResolutionVOList(Oct_ResolutionVO Oct_ResolutionVO) {
		return Oct_ResolutionDAO.selectOctResolutionVOList(Oct_ResolutionVO);
	}
	

	@Override
	public List<Oct_SalaryBookVO> Oct_selectSalarybookList(Oct_ResolutionVO Oct_ResolutionVO) {
		return Oct_ResolutionDAO.Oct_selectSalarybookList(Oct_ResolutionVO);
	}

	@Override
	public void modfiyMultiOctResolutionVO(List<Oct_ResolutionVO> modifyList) {
		int size = modifyList.size();
		for (int i = 0; i < size; i++) {
			Oct_ResolutionVO Oct_ResolutionVO = modifyList.get(i);
			if (Oct_ResolutionVO instanceof DataSetRowTypeAccessor) {
				DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) Oct_ResolutionVO;

				if (accessor.getRowType() == DataSet.ROW_TYPE_INSERTED) {
					Oct_ResolutionDAO.insertOctResolutionVO(Oct_ResolutionVO);
				} else if (accessor.getRowType() == DataSet.ROW_TYPE_UPDATED) {
					Oct_ResolutionDAO.updateOctResolutionVO(Oct_ResolutionVO);
				} else if (accessor.getRowType() == DataSet.ROW_TYPE_DELETED) {
					Oct_ResolutionDAO.deleteOctResolutionVO(Oct_ResolutionVO);
				}
			}

		}

	}

	
}

