package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("ReporttempletService")
public class ReporttempletService implements IReporttempletService {
	@Resource
	private ReporttempletMapper ReporttempletMapper;

	public int insert(Reporttemplet reporttemplet){
		return ReporttempletMapper.insert(reporttemplet);
	}
	public int insertSelective(Reporttemplet reporttemplet){
		return ReporttempletMapper.insertSelective(reporttemplet);
	}
	public int deleteByPrimaryKey(ReporttempletKey reporttempletKey){
		return ReporttempletMapper.deleteByPrimaryKey(reporttempletKey);
	}
	public Reporttemplet selectByPrimaryKey(ReporttempletKey reporttempletKey){
		return ReporttempletMapper.selectByPrimaryKey(reporttempletKey);
	}
	public int updateByPrimaryKey(Reporttemplet reporttemplet){
		return ReporttempletMapper.updateByPrimaryKey(reporttemplet);
	}
	public int updateByPrimaryKeySelective(Reporttemplet reporttemplet){
		return ReporttempletMapper.updateByPrimaryKeySelective(reporttemplet);
	}


}
