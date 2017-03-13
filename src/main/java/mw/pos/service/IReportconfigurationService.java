package mw.pos.service;

import com.pos.entity.*;

public interface IReportconfigurationService {
	int insert(reportconfiguration reportconfiguration);
	reportconfiguration selectByPrimaryKey(reportconfigurationKey reportconfigurationKey);
	int updateByPrimaryKeySelective(reportconfiguration reportconfiguration);
	int deleteByPrimaryKey(reportconfigurationKey reportconfigurationKey);
	int updateByPrimaryKey(reportconfiguration reportconfiguration);
	int insertSelective(reportconfiguration reportconfiguration);

}
