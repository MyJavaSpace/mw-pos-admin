package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("MsgService")
public class MsgService implements IMsgService {
	@Resource
	private MsgMapper MsgMapper;

	public int insert(Msg msg){
		return MsgMapper.insert(msg);
	}
	public int insertSelective(Msg msg){
		return MsgMapper.insertSelective(msg);
	}
	public int deleteByPrimaryKey(Integer integer){
		return MsgMapper.deleteByPrimaryKey(integer);
	}
	public Msg selectByPrimaryKey(Integer integer){
		return MsgMapper.selectByPrimaryKey(integer);
	}
	public int updateByPrimaryKey(Msg msg){
		return MsgMapper.updateByPrimaryKey(msg);
	}
	public int updateByPrimaryKeySelective(Msg msg){
		return MsgMapper.updateByPrimaryKeySelective(msg);
	}


}
