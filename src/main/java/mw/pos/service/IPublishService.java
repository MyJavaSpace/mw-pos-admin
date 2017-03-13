package mw.pos.service;

import com.pos.entity.*;

public interface IPublishService {
	int insert(Publish publish);
	int deleteByPrimaryKey(PublishKey publishKey);
	int updateByPrimaryKey(Publish publish);
	Publish selectByPrimaryKey(PublishKey publishKey);
	int insertSelective(Publish publish);
	int updateByPrimaryKeySelective(Publish publish);

}
