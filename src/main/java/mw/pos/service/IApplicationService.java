package mw.pos.service;

import com.pos.entity.*;

public interface IApplicationService {
	int insert(application application);
	application selectByPrimaryKey(applicationKey applicationKey);
	int updateByPrimaryKeySelective(application application);
	int deleteByPrimaryKey(applicationKey applicationKey);
	int updateByPrimaryKey(application application);
	int insertSelective(application application);

}
