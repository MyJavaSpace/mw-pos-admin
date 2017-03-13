package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("UserauthdataService")
public class UserauthdataService implements IUserauthdataService {
	@Resource
	private UserauthdataMapper UserauthdataMapper;

	public int insert(Userauthdata userauthdata){
		return UserauthdataMapper.insert(userauthdata);
	}
	public int insertSelective(Userauthdata userauthdata){
		return UserauthdataMapper.insertSelective(userauthdata);
	}
	public int deleteByPrimaryKey(UserauthdataKey userauthdataKey){
		return UserauthdataMapper.deleteByPrimaryKey(userauthdataKey);
	}
	public Userauthdata selectByPrimaryKey(UserauthdataKey userauthdataKey){
		return UserauthdataMapper.selectByPrimaryKey(userauthdataKey);
	}
	public int updateByPrimaryKey(Userauthdata userauthdata){
		return UserauthdataMapper.updateByPrimaryKey(userauthdata);
	}
	public int updateByPrimaryKeySelective(Userauthdata userauthdata){
		return UserauthdataMapper.updateByPrimaryKeySelective(userauthdata);
	}


}
