package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("ReportconfigurationService")
public class ReportconfigurationService implements IReportconfigurationService {
	@Resource
	private ReportconfigurationMapper ReportconfigurationMapper;

	public int insert(Reportconfiguration reportconfiguration){
		return ReportconfigurationMapper.insert(reportconfiguration);
	}
	public int insertSelective(Reportconfiguration reportconfiguration){
		return ReportconfigurationMapper.insertSelective(reportconfiguration);
	}
	public int deleteByPrimaryKey(ReportconfigurationKey reportconfigurationKey){
		return ReportconfigurationMapper.deleteByPrimaryKey(reportconfigurationKey);
	}
	public Reportconfiguration selectByPrimaryKey(ReportconfigurationKey reportconfigurationKey){
		return ReportconfigurationMapper.selectByPrimaryKey(reportconfigurationKey);
	}
	public int updateByPrimaryKey(Reportconfiguration reportconfiguration){
		return ReportconfigurationMapper.updateByPrimaryKey(reportconfiguration);
	}
	public int updateByPrimaryKeySelective(Reportconfiguration reportconfiguration){
		return ReportconfigurationMapper.updateByPrimaryKeySelective(reportconfiguration);
	}


}
