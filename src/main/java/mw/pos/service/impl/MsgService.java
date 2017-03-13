package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("msgService")
public class MsgService implements IMsgService {
	@Resource
	private msgMapper msgMapper;

	public int insert(msg msg){
		return msgMapper.insert(msg);
	}
	public int insertSelective(msg msg){
		return msgMapper.insertSelective(msg);
	}
	public msg selectByPrimaryKey(Integer integer){
		return msgMapper.selectByPrimaryKey(integer);
	}
	public int deleteByPrimaryKey(Integer integer){
		return msgMapper.deleteByPrimaryKey(integer);
	}
	public int updateByPrimaryKeySelective(msg msg){
		return msgMapper.updateByPrimaryKeySelective(msg);
	}
	public int updateByPrimaryKey(msg msg){
		return msgMapper.updateByPrimaryKey(msg);
	}


}
