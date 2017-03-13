package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("reportService")
public class ReportService implements IReportService {
	@Resource
	private ReportMapper reportMapper;

	public int insert(Report report){
		return reportMapper.insert(report);
	}
	public int insertSelective(Report report){
		return reportMapper.insertSelective(report);
	}
	public int deleteByPrimaryKey(ReportKey reportKey){
		return reportMapper.deleteByPrimaryKey(reportKey);
	}
	public Report selectByPrimaryKey(ReportKey reportKey){
		return reportMapper.selectByPrimaryKey(reportKey);
	}
	public int updateByPrimaryKeySelective(Report report){
		return reportMapper.updateByPrimaryKeySelective(report);
	}
	public int updateByPrimaryKey(Report report){
		return reportMapper.updateByPrimaryKey(report);
	}


}
