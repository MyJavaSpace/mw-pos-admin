package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("reporttempletService")
public class ReporttempletService implements IReporttempletService {
	@Resource
	private reporttempletMapper reporttempletMapper;

	public int insert(reporttemplet reporttemplet){
		return reporttempletMapper.insert(reporttemplet);
	}
	public int insertSelective(reporttemplet reporttemplet){
		return reporttempletMapper.insertSelective(reporttemplet);
	}
	public reporttemplet selectByPrimaryKey(reporttempletKey reporttempletKey){
		return reporttempletMapper.selectByPrimaryKey(reporttempletKey);
	}
	public int deleteByPrimaryKey(reporttempletKey reporttempletKey){
		return reporttempletMapper.deleteByPrimaryKey(reporttempletKey);
	}
	public int updateByPrimaryKeySelective(reporttemplet reporttemplet){
		return reporttempletMapper.updateByPrimaryKeySelective(reporttemplet);
	}
	public int updateByPrimaryKey(reporttemplet reporttemplet){
		return reporttempletMapper.updateByPrimaryKey(reporttemplet);
	}


}
