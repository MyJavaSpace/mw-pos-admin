package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("publishService")
public class PublishService implements IPublishService {
	@Resource
	private publishMapper publishMapper;

	public int insert(publish publish){
		return publishMapper.insert(publish);
	}
	public int insertSelective(publish publish){
		return publishMapper.insertSelective(publish);
	}
	public publish selectByPrimaryKey(publishKey publishKey){
		return publishMapper.selectByPrimaryKey(publishKey);
	}
	public int deleteByPrimaryKey(publishKey publishKey){
		return publishMapper.deleteByPrimaryKey(publishKey);
	}
	public int updateByPrimaryKeySelective(publish publish){
		return publishMapper.updateByPrimaryKeySelective(publish);
	}
	public int updateByPrimaryKey(publish publish){
		return publishMapper.updateByPrimaryKey(publish);
	}


}
