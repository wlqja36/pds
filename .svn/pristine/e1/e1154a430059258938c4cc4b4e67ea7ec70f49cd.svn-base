package nexacro.sample.service.impl.emp;

import java.util.List;

import javax.annotation.Resource;

import nexacro.sample.service.dao.ibatis.emp.CareerDAO;
import nexacro.sample.service.emp.CareerService;
import nexacro.sample.vo.emp.CareerVO;


import nexacro.sample.vo.emp.EmpVO;

import org.springframework.stereotype.Service;

import com.nexacro.spring.data.DataSetRowTypeAccessor;
import com.nexacro.xapi.data.DataSet;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("careerService")
public class CareerServiceimpl extends EgovAbstractServiceImpl implements CareerService{
	
	@Resource(name = "careerDAO")
	private CareerDAO careerDAO;
	@Override
	public List<CareerVO> SelectCareerVOList(CareerVO careerVO) {
		
		return careerDAO.selectCareerVOList(careerVO);
		
	}
	@Override
    public void modifyMultiCareerVO(List<CareerVO> modifyList) {

        int size = modifyList.size();
        for (int i=0; i<size; i++) {
        	CareerVO user = modifyList.get(i);
            if (user instanceof DataSetRowTypeAccessor){
                DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) user;
                
                if (accessor.getRowType() == DataSet.ROW_TYPE_INSERTED){
                	careerDAO.insertCareerVO(user);
                }else if (accessor.getRowType() == DataSet.ROW_TYPE_UPDATED){
                	careerDAO.updateCareerVO(user);
                }else if (accessor.getRowType() == DataSet.ROW_TYPE_DELETED){
                	careerDAO.deleteCareerVO(user);
                }
            }
            
        }
    }

}
