package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("reportconfigurationService")
public class ReportconfigurationService implements IReportconfigurationService {
	@Resource
	private ReportconfigurationMapper reportconfigurationMapper;

	public int insert(Reportconfiguration reportconfiguration){
		return reportconfigurationMapper.insert(reportconfiguration);
	}
	public int insertSelective(Reportconfiguration reportconfiguration){
		return reportconfigurationMapper.insertSelective(reportconfiguration);
	}
	public int deleteByPrimaryKey(ReportconfigurationKey reportconfigurationKey){
		return reportconfigurationMapper.deleteByPrimaryKey(reportconfigurationKey);
	}
	public Reportconfiguration selectByPrimaryKey(ReportconfigurationKey reportconfigurationKey){
		return reportconfigurationMapper.selectByPrimaryKey(reportconfigurationKey);
	}
	public int updateByPrimaryKeySelective(Reportconfiguration reportconfiguration){
		return reportconfigurationMapper.updateByPrimaryKeySelective(reportconfiguration);
	}
	public int updateByPrimaryKey(Reportconfiguration reportconfiguration){
		return reportconfigurationMapper.updateByPrimaryKey(reportconfiguration);
	}


}
