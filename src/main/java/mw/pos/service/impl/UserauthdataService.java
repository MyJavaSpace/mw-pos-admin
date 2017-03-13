package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("userauthdataService")
public class UserauthdataService implements IUserauthdataService {
	@Resource
	private UserauthdataMapper userauthdataMapper;

	public int insert(Userauthdata userauthdata){
		return userauthdataMapper.insert(userauthdata);
	}
	public int insertSelective(Userauthdata userauthdata){
		return userauthdataMapper.insertSelective(userauthdata);
	}
	public int deleteByPrimaryKey(UserauthdataKey userauthdataKey){
		return userauthdataMapper.deleteByPrimaryKey(userauthdataKey);
	}
	public Userauthdata selectByPrimaryKey(UserauthdataKey userauthdataKey){
		return userauthdataMapper.selectByPrimaryKey(userauthdataKey);
	}
	public int updateByPrimaryKeySelective(Userauthdata userauthdata){
		return userauthdataMapper.updateByPrimaryKeySelective(userauthdata);
	}
	public int updateByPrimaryKey(Userauthdata userauthdata){
		return userauthdataMapper.updateByPrimaryKey(userauthdata);
	}


}
