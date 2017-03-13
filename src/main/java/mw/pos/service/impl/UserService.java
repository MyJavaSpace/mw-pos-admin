package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("userService")
public class UserService implements IUserService {
	@Resource
	private UserMapper userMapper;

	public int insert(User user){
		return userMapper.insert(user);
	}
	public int insertSelective(User user){
		return userMapper.insertSelective(user);
	}
	public int deleteByPrimaryKey(UserKey userKey){
		return userMapper.deleteByPrimaryKey(userKey);
	}
	public User selectByPrimaryKey(UserKey userKey){
		return userMapper.selectByPrimaryKey(userKey);
	}
	public int updateByPrimaryKeySelective(User user){
		return userMapper.updateByPrimaryKeySelective(user);
	}
	public int updateByPrimaryKey(User user){
		return userMapper.updateByPrimaryKey(user);
	}


}
