package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("useroperationlogService")
public class UseroperationlogService implements IUseroperationlogService {
	@Resource
	private UseroperationlogMapper useroperationlogMapper;

	public int insert(Useroperationlog useroperationlog){
		return useroperationlogMapper.insert(useroperationlog);
	}
	public int insertSelective(Useroperationlog useroperationlog){
		return useroperationlogMapper.insertSelective(useroperationlog);
	}
	public int deleteByPrimaryKey(String string){
		return useroperationlogMapper.deleteByPrimaryKey(string);
	}
	public Useroperationlog selectByPrimaryKey(String string){
		return useroperationlogMapper.selectByPrimaryKey(string);
	}
	public int updateByPrimaryKeySelective(Useroperationlog useroperationlog){
		return useroperationlogMapper.updateByPrimaryKeySelective(useroperationlog);
	}
	public int updateByPrimaryKey(Useroperationlog useroperationlog){
		return useroperationlogMapper.updateByPrimaryKey(useroperationlog);
	}


}
