package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("UserService")
public class UserService implements IUserService {
	@Resource
	private UserMapper UserMapper;

	public int insert(User user){
		return UserMapper.insert(user);
	}
	public int insertSelective(User user){
		return UserMapper.insertSelective(user);
	}
	public int deleteByPrimaryKey(UserKey userKey){
		return UserMapper.deleteByPrimaryKey(userKey);
	}
	public User selectByPrimaryKey(UserKey userKey){
		return UserMapper.selectByPrimaryKey(userKey);
	}
	public int updateByPrimaryKey(User user){
		return UserMapper.updateByPrimaryKey(user);
	}
	public int updateByPrimaryKeySelective(User user){
		return UserMapper.updateByPrimaryKeySelective(user);
	}


}
