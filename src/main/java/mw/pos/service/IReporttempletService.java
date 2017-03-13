package mw.pos.service;

import com.pos.entity.*;

public interface IReporttempletService {
	int insert(reporttemplet reporttemplet);
	reporttemplet selectByPrimaryKey(reporttempletKey reporttempletKey);
	int updateByPrimaryKeySelective(reporttemplet reporttemplet);
	int deleteByPrimaryKey(reporttempletKey reporttempletKey);
	int updateByPrimaryKey(reporttemplet reporttemplet);
	int insertSelective(reporttemplet reporttemplet);

}
