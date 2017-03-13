package mw.pos.service;

import com.pos.entity.*;

public interface IReportconfigurationService {
	int insert(Reportconfiguration reportconfiguration);
	int deleteByPrimaryKey(ReportconfigurationKey reportconfigurationKey);
	int updateByPrimaryKey(Reportconfiguration reportconfiguration);
	Reportconfiguration selectByPrimaryKey(ReportconfigurationKey reportconfigurationKey);
	int insertSelective(Reportconfiguration reportconfiguration);
	int updateByPrimaryKeySelective(Reportconfiguration reportconfiguration);

}
