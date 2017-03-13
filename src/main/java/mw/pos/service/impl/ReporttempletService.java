package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("reporttempletService")
public class ReporttempletService implements IReporttempletService {
	@Resource
	private ReporttempletMapper reporttempletMapper;

	public int insert(Reporttemplet reporttemplet){
		return reporttempletMapper.insert(reporttemplet);
	}
	public int insertSelective(Reporttemplet reporttemplet){
		return reporttempletMapper.insertSelective(reporttemplet);
	}
	public int deleteByPrimaryKey(ReporttempletKey reporttempletKey){
		return reporttempletMapper.deleteByPrimaryKey(reporttempletKey);
	}
	public Reporttemplet selectByPrimaryKey(ReporttempletKey reporttempletKey){
		return reporttempletMapper.selectByPrimaryKey(reporttempletKey);
	}
	public int updateByPrimaryKeySelective(Reporttemplet reporttemplet){
		return reporttempletMapper.updateByPrimaryKeySelective(reporttemplet);
	}
	public int updateByPrimaryKey(Reporttemplet reporttemplet){
		return reporttempletMapper.updateByPrimaryKey(reporttemplet);
	}


}
