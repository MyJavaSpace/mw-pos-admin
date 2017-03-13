package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("reportService")
public class ReportService implements IReportService {
	@Resource
	private reportMapper reportMapper;

	public int insert(report report){
		return reportMapper.insert(report);
	}
	public int insertSelective(report report){
		return reportMapper.insertSelective(report);
	}
	public report selectByPrimaryKey(reportKey reportKey){
		return reportMapper.selectByPrimaryKey(reportKey);
	}
	public int deleteByPrimaryKey(reportKey reportKey){
		return reportMapper.deleteByPrimaryKey(reportKey);
	}
	public int updateByPrimaryKeySelective(report report){
		return reportMapper.updateByPrimaryKeySelective(report);
	}
	public int updateByPrimaryKey(report report){
		return reportMapper.updateByPrimaryKey(report);
	}


}
