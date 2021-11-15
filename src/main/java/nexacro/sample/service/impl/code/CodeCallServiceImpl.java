package nexacro.sample.service.impl.code;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.sample.service.code.CodeCallService;
import nexacro.sample.service.dao.ibatis.code.CodeCallDAO;
import nexacro.sample.vo.code.CodeVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("codeCallService")
public class CodeCallServiceImpl extends EgovAbstractServiceImpl implements CodeCallService{

	@Resource(name = "codeCallDAO")
	private CodeCallDAO codeCallDAO;
	
	// 샘플 코드 검색
	@Override
	public List<CodeVO> selectCodeList(Map<String, Object> codeMap) {
		return codeCallDAO.selectCodeList(codeMap);
	}

	// 전체 사유 코드 검색
	@Override
	public List<CodeVO> getReasonList(Map<String, Object> codeMap) {
		return codeCallDAO.getReasonList(codeMap);
	}

}
