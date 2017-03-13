package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("usermenuitemroleService")
public class UsermenuitemroleService implements IUsermenuitemroleService {
	@Resource
	private usermenuitemroleMapper usermenuitemroleMapper;

	public int insert(usermenuitemrole usermenuitemrole){
		return usermenuitemroleMapper.insert(usermenuitemrole);
	}
	public int insertSelective(usermenuitemrole usermenuitemrole){
		return usermenuitemroleMapper.insertSelective(usermenuitemrole);
	}
	public usermenuitemrole selectByPrimaryKey(usermenuitemroleKey usermenuitemroleKey){
		return usermenuitemroleMapper.selectByPrimaryKey(usermenuitemroleKey);
	}
	public int deleteByPrimaryKey(usermenuitemroleKey usermenuitemroleKey){
		return usermenuitemroleMapper.deleteByPrimaryKey(usermenuitemroleKey);
	}
	public int updateByPrimaryKeySelective(usermenuitemrole usermenuitemrole){
		return usermenuitemroleMapper.updateByPrimaryKeySelective(usermenuitemrole);
	}
	public int updateByPrimaryKey(usermenuitemrole usermenuitemrole){
		return usermenuitemroleMapper.updateByPrimaryKey(usermenuitemrole);
	}


}
