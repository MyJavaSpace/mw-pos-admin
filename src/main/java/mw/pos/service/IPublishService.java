package mw.pos.service;

import com.pos.entity.*;

public interface IPublishService {
	int insert(publish publish);
	publish selectByPrimaryKey(publishKey publishKey);
	int updateByPrimaryKeySelective(publish publish);
	int deleteByPrimaryKey(publishKey publishKey);
	int updateByPrimaryKey(publish publish);
	int insertSelective(publish publish);

}
