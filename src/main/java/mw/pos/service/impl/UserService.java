package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("userService")
public class UserService implements IUserService {
	@Resource
	private userMapper userMapper;

	public int insert(user user){
		return userMapper.insert(user);
	}
	public int insertSelective(user user){
		return userMapper.insertSelective(user);
	}
	public user selectByPrimaryKey(userKey userKey){
		return userMapper.selectByPrimaryKey(userKey);
	}
	public int deleteByPrimaryKey(userKey userKey){
		return userMapper.deleteByPrimaryKey(userKey);
	}
	public int updateByPrimaryKeySelective(user user){
		return userMapper.updateByPrimaryKeySelective(user);
	}
	public int updateByPrimaryKey(user user){
		return userMapper.updateByPrimaryKey(user);
	}


}
