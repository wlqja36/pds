package nexacro.sample.service.impl.s_salbook;

import java.util.List;

import javax.annotation.Resource;

import nexacro.sample.service.dao.ibatis.s_salbook.S_taxDAO;
import nexacro.sample.service.s_salbook.S_tax_Service;
import nexacro.sample.vo.s_salbookVO.BonusVO;
import nexacro.sample.vo.s_salbookVO.SalaryVO;
import nexacro.sample.vo.s_salbookVO.TaxVO;

import org.springframework.stereotype.Service;

import com.nexacro.spring.data.DataSetRowTypeAccessor;
import com.nexacro.xapi.data.DataSet;











import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("sbtax_Service")
public class S_tax_ServiceImpl extends EgovAbstractServiceImpl implements
		S_tax_Service {

	@Resource(name = "sbtax_DAO")
	private S_taxDAO sbtax_DAO;

	
	// 세금
	@Override
	public void modifytax_User(List<TaxVO> t_modifyList) {
		int size = t_modifyList.size();
		for (int i = 0; i < size; i++) {
			TaxVO tax_ = t_modifyList.get(i);
			if (tax_ instanceof DataSetRowTypeAccessor) {
				DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) tax_;
				
				if (accessor.getRowType() == DataSet.ROW_TYPE_INSERTED) {
					System.out.println("임플실행 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
					sbtax_DAO.inserttax_VO(tax_);
				} else if (accessor.getRowType() == DataSet.ROW_TYPE_UPDATED) {
					System.out.println("업데ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
					sbtax_DAO.inserttax_VO(tax_);
				} else {
					System.out.println("택스 실행");
					sbtax_DAO.inserttax_VO(tax_);
				}
			}
		}
		
	}
}
