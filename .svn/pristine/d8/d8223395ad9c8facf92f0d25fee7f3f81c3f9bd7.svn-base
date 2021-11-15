package nexacro.sample.service.impl.s_salbook;

import java.util.List;

import javax.annotation.Resource;

import nexacro.sample.vo.s_salbookVO.BonusVO;
import nexacro.sample.vo.s_salbookVO.SalaryVO;
import nexacro.sample.vo.s_salbookVO.TaxVO;

import org.springframework.stereotype.Service;

import com.nexacro.spring.data.DataSetRowTypeAccessor;
import com.nexacro.xapi.data.DataSet;









import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("sbsalService")
public class S_salServiceImpl extends EgovAbstractServiceImpl implements
		nexacro.sample.service.s_salbook.S_salService {

	@Resource(name = "sbsalDAO")
	private nexacro.sample.service.dao.ibatis.s_salbook.S_salDAO sbsalDAO;

	

	// 샐러리정보

	@Override
	public void modifyMultiUser(List<SalaryVO> s_modifyList) {
		int size = s_modifyList.size();
		for (int i = 0; i < size; i++) {
			SalaryVO sal = s_modifyList.get(i);
			if (sal instanceof DataSetRowTypeAccessor) {
				DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) sal;
				System.out.println("임플 이프문 위에----------------");
				if (accessor.getRowType() == DataSet.ROW_TYPE_INSERTED) {
					System.out.println("임플실행 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
					sbsalDAO.insertsalVO(sal);
				} else if (accessor.getRowType() == DataSet.ROW_TYPE_UPDATED) {
					System.out.println("업데ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
					sbsalDAO.insertsalVO(sal);
				} else {
					System.out.println("샐러리 실행");
					sbsalDAO.insertsalVO(sal);
				}
			}
		}

	}
	//수당 정보
	@Override
	public void modifybonusUser(List<BonusVO> b_modifyList) {
		int size = b_modifyList.size();
		for (int i = 0; i < size; i++) {
			BonusVO bonus = b_modifyList.get(i);
			if (bonus instanceof DataSetRowTypeAccessor) {
				DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) bonus;
				if (accessor.getRowType() == DataSet.ROW_TYPE_INSERTED) {
					System.out.println("임플실행 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
					sbsalDAO.insertbonus_VO(bonus);
				} else if (accessor.getRowType() == DataSet.ROW_TYPE_UPDATED) {
					System.out.println("업데ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
					sbsalDAO.insertbonus_VO(bonus);
				} else {
					System.out.println("보너스 실행");
					sbsalDAO.insertbonus_VO(bonus);
				}
			}
		}
	}
	// 세금
//	@Override
//	public void modifytax_User(List<TaxVO> t_modifyList) {
//		int size = t_modifyList.size();
//		for (int i = 0; i < size; i++) {
//			TaxVO tax = t_modifyList.get(i);
//			if (tax instanceof DataSetRowTypeAccessor) {
//				DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) tax;
//				sbsalDAO.inserttax_VO(tax);
//				if (accessor.getRowType() == DataSet.ROW_TYPE_INSERTED) {
//					System.out.println("임플실행 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
//					sbsalDAO.inserttax_VO(tax);
//				} else if (accessor.getRowType() == DataSet.ROW_TYPE_UPDATED) {
//					System.out.println("업데ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
//					sbsalDAO.inserttax_VO(tax);
//				} else {
//					System.out.println("택스 실행");
//					sbsalDAO.inserttax_VO(tax);
//				}
//			}
//		}
//		
//	}
}
