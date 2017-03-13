package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("ReportService")
public class ReportService implements IReportService {
	@Resource
	private ReportMapper ReportMapper;

	public int insert(Report report){
		return ReportMapper.insert(report);
	}
	public int insertSelective(Report report){
		return ReportMapper.insertSelective(report);
	}
	public int deleteByPrimaryKey(ReportKey reportKey){
		return ReportMapper.deleteByPrimaryKey(reportKey);
	}
	public Report selectByPrimaryKey(ReportKey reportKey){
		return ReportMapper.selectByPrimaryKey(reportKey);
	}
	public int updateByPrimaryKey(Report report){
		return ReportMapper.updateByPrimaryKey(report);
	}
	public int updateByPrimaryKeySelective(Report report){
		return ReportMapper.updateByPrimaryKeySelective(report);
	}


}
