package mw.pos.service;

import com.pos.entity.*;

public interface IReportService {
	int insert(Report report);
	int deleteByPrimaryKey(ReportKey reportKey);
	int updateByPrimaryKey(Report report);
	Report selectByPrimaryKey(ReportKey reportKey);
	int insertSelective(Report report);
	int updateByPrimaryKeySelective(Report report);

}
