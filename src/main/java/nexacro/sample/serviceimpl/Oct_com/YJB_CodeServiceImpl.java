package nexacro.sample.serviceimpl.Oct_com;


import java.util.List;
import java.util.Map;

import javax.annotation.Resource;







import nexacro.sample.dao.Oct_com.YJB_CodeDAO;
import nexacro.sample.service.Oct_com.YJB_CodeService;
import nexacro.sample.vo.Oct_com.YJB_ComCodeVO;
import nexacro.sample.vo.Oct_com.YJB_DetailCodeVO;

import org.springframework.stereotype.Service;

import com.nexacro.spring.data.DataSetRowTypeAccessor;
import com.nexacro.xapi.data.DataSet;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;


@Service("YJB_codeService")
public class YJB_CodeServiceImpl extends EgovAbstractServiceImpl implements YJB_CodeService {

	@Resource(name="YJB_codeDAO")
	private YJB_CodeDAO codeDAO;
	
	// 코드마스터 전체내역 조회하기
	@Override
	public List<YJB_ComCodeVO> yjb_selectCode(YJB_ComCodeVO comCodeVO) throws Exception {
		return codeDAO.yjb_selectCode(comCodeVO);
	}
	
	// 코드마스터 입력/수정/삭제
	@Override
	public String editCode(List<YJB_ComCodeVO> comCodeVO) throws Exception {
		
		String confirm = null;
		
		for(int i = 0; i < comCodeVO.size(); i++){
			YJB_ComCodeVO comCode = comCodeVO.get(i);
			
			DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) comCode;
			
			if(accessor.getRowType() == DataSet.ROW_TYPE_INSERTED){
				codeDAO.insertCode(comCode);
				confirm = "저장";
			}else if(accessor.getRowType() == DataSet.ROW_TYPE_UPDATED){
				codeDAO.updateCode(comCode);
				confirm = "수정";
			}else if(accessor.getRowType() == DataSet.ROW_TYPE_DELETED){
				codeDAO.deleteCode(comCode);
			}
		}
		
		return confirm;
	}
	
	@Override
	public YJB_ComCodeVO searchCode(String classCode) throws Exception{
		return codeDAO.searchCode(classCode);
	}
	// 상세코드 분류코드 가져오기
		@Override
		public List<YJB_DetailCodeVO> selectDetailCode() throws Exception {
			return codeDAO.selectDetailCode();
		}
		
		// 분류코드에 따른 상세코드 가져오기
		@Override
		public List<YJB_DetailCodeVO> selectDetailList(YJB_DetailCodeVO detailCodeVO) throws Exception {
			return codeDAO.selectDetailList(detailCodeVO);
		}
		
		@Override
		public YJB_DetailCodeVO selectDRnum(String detailCode) throws Exception{
			return codeDAO.selectDRnum(detailCode);
		}
	
		// 상세코드 입력, 수정, 삭제
		@Override
		public String editDetailCode(List<YJB_DetailCodeVO> detailCodeVO) throws Exception {
			
			String confirm = null;
			
			for(int i = 0; i < detailCodeVO.size(); i++){
				YJB_DetailCodeVO detailCode = detailCodeVO.get(i);
				
				DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) detailCode;
				
				if(accessor.getRowType() == DataSet.ROW_TYPE_INSERTED){
					codeDAO.insertDetailCode(detailCode);
					confirm = "저장";
				}else if(accessor.getRowType() == DataSet.ROW_TYPE_UPDATED){
					codeDAO.updateDetailCode(detailCode);
					confirm = "수정";
				}else if(accessor.getRowType() == DataSet.ROW_TYPE_DELETED){
					codeDAO.deleteDetailCode(detailCode);
				}
				
			}
			
			return confirm;
		}
		@Override
		public YJB_DetailCodeVO searchDetailCode(String detailCode) throws Exception{
			return codeDAO.searchDetailCode(detailCode);
		}
		
/* 아직안함
	// 분류별 코드번호 또는 코드네임 가져오기
	@Override
	public List<ComCodeVO> detailCode(Map<String, String> switchMap) {
		return codeDAO.detailCode(switchMap);
	}

	
	
	@Override
	public ComCodeVO selectRnum(String classCode){
		return codeDAO.selectRnum(classCode);
	}
	
	
	
	
*/
}
