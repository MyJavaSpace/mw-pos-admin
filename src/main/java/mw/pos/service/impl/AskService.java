package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("askService")
public class AskService implements IAskService {
	@Resource
	private askMapper askMapper;

	public int insert(ask ask){
		return askMapper.insert(ask);
	}
	public int insertSelective(ask ask){
		return askMapper.insertSelective(ask);
	}
	public ask selectByPrimaryKey(askKey askKey){
		return askMapper.selectByPrimaryKey(askKey);
	}
	public int deleteByPrimaryKey(askKey askKey){
		return askMapper.deleteByPrimaryKey(askKey);
	}
	public int updateByPrimaryKeySelective(ask ask){
		return askMapper.updateByPrimaryKeySelective(ask);
	}
	public int updateByPrimaryKey(ask ask){
		return askMapper.updateByPrimaryKey(ask);
	}


}
