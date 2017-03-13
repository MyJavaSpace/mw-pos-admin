package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("publishService")
public class PublishService implements IPublishService {
	@Resource
	private PublishMapper publishMapper;

	public int insert(Publish publish){
		return publishMapper.insert(publish);
	}
	public int insertSelective(Publish publish){
		return publishMapper.insertSelective(publish);
	}
	public int deleteByPrimaryKey(PublishKey publishKey){
		return publishMapper.deleteByPrimaryKey(publishKey);
	}
	public Publish selectByPrimaryKey(PublishKey publishKey){
		return publishMapper.selectByPrimaryKey(publishKey);
	}
	public int updateByPrimaryKeySelective(Publish publish){
		return publishMapper.updateByPrimaryKeySelective(publish);
	}
	public int updateByPrimaryKey(Publish publish){
		return publishMapper.updateByPrimaryKey(publish);
	}


}
