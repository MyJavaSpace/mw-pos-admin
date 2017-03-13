package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("PublishService")
public class PublishService implements IPublishService {
	@Resource
	private PublishMapper PublishMapper;

	public int insert(Publish publish){
		return PublishMapper.insert(publish);
	}
	public int insertSelective(Publish publish){
		return PublishMapper.insertSelective(publish);
	}
	public int deleteByPrimaryKey(PublishKey publishKey){
		return PublishMapper.deleteByPrimaryKey(publishKey);
	}
	public Publish selectByPrimaryKey(PublishKey publishKey){
		return PublishMapper.selectByPrimaryKey(publishKey);
	}
	public int updateByPrimaryKey(Publish publish){
		return PublishMapper.updateByPrimaryKey(publish);
	}
	public int updateByPrimaryKeySelective(Publish publish){
		return PublishMapper.updateByPrimaryKeySelective(publish);
	}


}
