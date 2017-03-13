package mw.pos.service;

import com.pos.entity.*;

public interface IApplicationService {
	int insert(Application application);
	int deleteByPrimaryKey(ApplicationKey applicationKey);
	int updateByPrimaryKey(Application application);
	Application selectByPrimaryKey(ApplicationKey applicationKey);
	int insertSelective(Application application);
	int updateByPrimaryKeySelective(Application application);

}
