package mw.pos.service;

import com.pos.entity.*;

public interface IReportService {
	int insert(report report);
	report selectByPrimaryKey(reportKey reportKey);
	int updateByPrimaryKeySelective(report report);
	int deleteByPrimaryKey(reportKey reportKey);
	int updateByPrimaryKey(report report);
	int insertSelective(report report);

}
