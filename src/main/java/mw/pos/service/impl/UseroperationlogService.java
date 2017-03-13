package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("UseroperationlogService")
public class UseroperationlogService implements IUseroperationlogService {
	@Resource
	private UseroperationlogMapper UseroperationlogMapper;

	public int insert(Useroperationlog useroperationlog){
		return UseroperationlogMapper.insert(useroperationlog);
	}
	public int insertSelective(Useroperationlog useroperationlog){
		return UseroperationlogMapper.insertSelective(useroperationlog);
	}
	public int deleteByPrimaryKey(String string){
		return UseroperationlogMapper.deleteByPrimaryKey(string);
	}
	public Useroperationlog selectByPrimaryKey(String string){
		return UseroperationlogMapper.selectByPrimaryKey(string);
	}
	public int updateByPrimaryKey(Useroperationlog useroperationlog){
		return UseroperationlogMapper.updateByPrimaryKey(useroperationlog);
	}
	public int updateByPrimaryKeySelective(Useroperationlog useroperationlog){
		return UseroperationlogMapper.updateByPrimaryKeySelective(useroperationlog);
	}


}
