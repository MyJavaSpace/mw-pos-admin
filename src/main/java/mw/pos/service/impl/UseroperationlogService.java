package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("useroperationlogService")
public class UseroperationlogService implements IUseroperationlogService {
	@Resource
	private useroperationlogMapper useroperationlogMapper;

	public int insert(useroperationlog useroperationlog){
		return useroperationlogMapper.insert(useroperationlog);
	}
	public int insertSelective(useroperationlog useroperationlog){
		return useroperationlogMapper.insertSelective(useroperationlog);
	}
	public useroperationlog selectByPrimaryKey(String string){
		return useroperationlogMapper.selectByPrimaryKey(string);
	}
	public int deleteByPrimaryKey(String string){
		return useroperationlogMapper.deleteByPrimaryKey(string);
	}
	public int updateByPrimaryKeySelective(useroperationlog useroperationlog){
		return useroperationlogMapper.updateByPrimaryKeySelective(useroperationlog);
	}
	public int updateByPrimaryKey(useroperationlog useroperationlog){
		return useroperationlogMapper.updateByPrimaryKey(useroperationlog);
	}


}
