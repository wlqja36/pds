package nexacro.sample.service.dao.ibatis.emp;

import java.util.List;

import nexacro.sample.vo.emp.CareerVO;


import org.springframework.stereotype.Repository;

import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;

@Repository("careerDAO")
public class CareerDAO extends NexacroIbatisAbstractDAO{

	public List<CareerVO> selectCareerVOList(CareerVO careerVO){
		return (List<CareerVO>) list("selectCareerVOList", careerVO);
		
	}
	public void insertCareerVO(CareerVO career){
		insert("insertCareerVO",career);		
	}

	public void updateCareerVO(CareerVO career){
		insert("updateCareerVO",career);		
	}
	public void deleteCareerVO(CareerVO career){
		insert("deleteCareerVO",career);		
	}
}
