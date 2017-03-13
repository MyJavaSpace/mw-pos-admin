package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("reportconfigurationService")
public class ReportconfigurationService implements IReportconfigurationService {
	@Resource
	private reportconfigurationMapper reportconfigurationMapper;

	public int insert(reportconfiguration reportconfiguration){
		return reportconfigurationMapper.insert(reportconfiguration);
	}
	public int insertSelective(reportconfiguration reportconfiguration){
		return reportconfigurationMapper.insertSelective(reportconfiguration);
	}
	public reportconfiguration selectByPrimaryKey(reportconfigurationKey reportconfigurationKey){
		return reportconfigurationMapper.selectByPrimaryKey(reportconfigurationKey);
	}
	public int deleteByPrimaryKey(reportconfigurationKey reportconfigurationKey){
		return reportconfigurationMapper.deleteByPrimaryKey(reportconfigurationKey);
	}
	public int updateByPrimaryKeySelective(reportconfiguration reportconfiguration){
		return reportconfigurationMapper.updateByPrimaryKeySelective(reportconfiguration);
	}
	public int updateByPrimaryKey(reportconfiguration reportconfiguration){
		return reportconfigurationMapper.updateByPrimaryKey(reportconfiguration);
	}


}
