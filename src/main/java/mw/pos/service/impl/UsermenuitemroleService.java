package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("usermenuitemroleService")
public class UsermenuitemroleService implements IUsermenuitemroleService {
	@Resource
	private UsermenuitemroleMapper usermenuitemroleMapper;

	public int insert(Usermenuitemrole usermenuitemrole){
		return usermenuitemroleMapper.insert(usermenuitemrole);
	}
	public int insertSelective(Usermenuitemrole usermenuitemrole){
		return usermenuitemroleMapper.insertSelective(usermenuitemrole);
	}
	public int deleteByPrimaryKey(UsermenuitemroleKey usermenuitemroleKey){
		return usermenuitemroleMapper.deleteByPrimaryKey(usermenuitemroleKey);
	}
	public Usermenuitemrole selectByPrimaryKey(UsermenuitemroleKey usermenuitemroleKey){
		return usermenuitemroleMapper.selectByPrimaryKey(usermenuitemroleKey);
	}
	public int updateByPrimaryKeySelective(Usermenuitemrole usermenuitemrole){
		return usermenuitemroleMapper.updateByPrimaryKeySelective(usermenuitemrole);
	}
	public int updateByPrimaryKey(Usermenuitemrole usermenuitemrole){
		return usermenuitemroleMapper.updateByPrimaryKey(usermenuitemrole);
	}


}
