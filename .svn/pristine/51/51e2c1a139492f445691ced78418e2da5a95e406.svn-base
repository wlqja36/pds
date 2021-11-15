package nexacro.sample.service.dao.ibatis.atticode;

import java.util.List;

import nexacro.sample.vo.atticode.AttiCodeVO;
import nexacro.sample.vo.atticode.VacCodeVO;
import nexacro.sample.vo.vacation.vacationCodeVO;

import org.springframework.stereotype.Repository;

import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;

@Repository("attiCodeDAO")
public class AttiCodeDAO  extends NexacroIbatisAbstractDAO{
	
	public List<AttiCodeVO> loadAttiCodeList(){
		return (List<AttiCodeVO>) list("loadAttiCodeList");
	}
	
	public List<VacCodeVO> loadVacCodeList(){
		return (List<VacCodeVO>) list("atticode.loadVacCodeList");
	}
	
	public void insertAttiCodeList(AttiCodeVO attiCodeVO){
		insert("insertAttiCodeList", attiCodeVO);
	}
	
	public void updateAttiCodeList(AttiCodeVO attiCodeVO){
		update("updateAttiCodeList", attiCodeVO);
	}
	
	public void deleteAttiCodeList(AttiCodeVO attiCodeVO){
		delete("deleteAttiCodeList", attiCodeVO);
	}
}
