package nexacro.sample.service.impl.resolution;

import java.util.List;

import javax.annotation.Resource;

import nexacro.sample.service.ResolutionService;
import nexacro.sample.service.dao.ibatis.resolution.ResolutionDAO;
import nexacro.sample.vo.emp.EmpVO;
import nexacro.sample.vo.resolution.ResCodeVO;
import nexacro.sample.vo.resolution.ResolutionVO;
import nexacro.sample.vo.s_bookVO.S_bookVO;

import org.springframework.stereotype.Service;

import com.nexacro.spring.data.DataSetRowTypeAccessor;
import com.nexacro.spring.data.NexacroResult;
import com.nexacro.xapi.data.DataSet;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("resolutionService")
public class ResolutionServiceImpl extends EgovAbstractServiceImpl implements ResolutionService{
	
	@Resource(name="resolutionDAO")
	ResolutionDAO resolutionDAO;
	
	
	public List<ResolutionVO> loadResList(ResolutionVO empNo){
		return resolutionDAO.loadResList(empNo);
	}

	public List<ResolutionVO> selectResList(ResolutionVO empNo){
		return resolutionDAO.selectResList(empNo);
	}
	
	public List<EmpVO> loadEmpInfo(ResolutionVO empNo){
		return resolutionDAO.loadEmpInfo(empNo);
	}
	
	public List<S_bookVO> selectds_S_BookCode(ResolutionVO searchInfo){
		return resolutionDAO.selectds_S_BookCode(searchInfo);
	}

	public List<EmpVO> selectEmpList(){
		return resolutionDAO.selectEmpList();
	}
	
	public List<ResCodeVO> loadResCode(){
		return resolutionDAO.loadResCode();
	}
	
	public void modifyResList(List<ResolutionVO> resList){
		
		int size =resList.size();
		System.out.println("size : "+size);
		for(int i=0; i<size; i++){
			ResolutionVO resVO =resList.get(i);
			if(resVO instanceof DataSetRowTypeAccessor){
				System.out.println("instanceof 들어옴??");
				DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) resVO;
                
                if (accessor.getRowType() == DataSet.ROW_TYPE_INSERTED){
                	System.out.println("===insert  하는중");
                	resolutionDAO.insertResList(resVO);
                
                }else if (accessor.getRowType() == DataSet.ROW_TYPE_UPDATED){
                	System.out.println("===update  하는중");
                	resolutionDAO.updateResList(resVO);
                
                }else if (accessor.getRowType() == DataSet.ROW_TYPE_DELETED){
                	System.out.println("===delete  하는중");
                	resolutionDAO.deleteResList(resVO);
                }
			}
		}	
	}
}
