package mw.pos.service;

import com.pos.entity.*;

public interface IReporttempletService {
	int insert(Reporttemplet reporttemplet);
	int deleteByPrimaryKey(ReporttempletKey reporttempletKey);
	int updateByPrimaryKey(Reporttemplet reporttemplet);
	Reporttemplet selectByPrimaryKey(ReporttempletKey reporttempletKey);
	int insertSelective(Reporttemplet reporttemplet);
	int updateByPrimaryKeySelective(Reporttemplet reporttemplet);

}
