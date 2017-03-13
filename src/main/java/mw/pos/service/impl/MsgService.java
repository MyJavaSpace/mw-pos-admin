package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("msgService")
public class MsgService implements IMsgService {
	@Resource
	private MsgMapper msgMapper;

	public int insert(Msg msg){
		return msgMapper.insert(msg);
	}
	public int insertSelective(Msg msg){
		return msgMapper.insertSelective(msg);
	}
	public int deleteByPrimaryKey(Integer integer){
		return msgMapper.deleteByPrimaryKey(integer);
	}
	public Msg selectByPrimaryKey(Integer integer){
		return msgMapper.selectByPrimaryKey(integer);
	}
	public int updateByPrimaryKeySelective(Msg msg){
		return msgMapper.updateByPrimaryKeySelective(msg);
	}
	public int updateByPrimaryKey(Msg msg){
		return msgMapper.updateByPrimaryKey(msg);
	}


}
