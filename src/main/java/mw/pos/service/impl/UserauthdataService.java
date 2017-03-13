package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("userauthdataService")
public class UserauthdataService implements IUserauthdataService {
	@Resource
	private userauthdataMapper userauthdataMapper;

	public int insert(userauthdata userauthdata){
		return userauthdataMapper.insert(userauthdata);
	}
	public int insertSelective(userauthdata userauthdata){
		return userauthdataMapper.insertSelective(userauthdata);
	}
	public userauthdata selectByPrimaryKey(userauthdataKey userauthdataKey){
		return userauthdataMapper.selectByPrimaryKey(userauthdataKey);
	}
	public int deleteByPrimaryKey(userauthdataKey userauthdataKey){
		return userauthdataMapper.deleteByPrimaryKey(userauthdataKey);
	}
	public int updateByPrimaryKeySelective(userauthdata userauthdata){
		return userauthdataMapper.updateByPrimaryKeySelective(userauthdata);
	}
	public int updateByPrimaryKey(userauthdata userauthdata){
		return userauthdataMapper.updateByPrimaryKey(userauthdata);
	}


}
