package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("UsermenuitemroleService")
public class UsermenuitemroleService implements IUsermenuitemroleService {
	@Resource
	private UsermenuitemroleMapper UsermenuitemroleMapper;

	public int insert(Usermenuitemrole usermenuitemrole){
		return UsermenuitemroleMapper.insert(usermenuitemrole);
	}
	public int insertSelective(Usermenuitemrole usermenuitemrole){
		return UsermenuitemroleMapper.insertSelective(usermenuitemrole);
	}
	public int deleteByPrimaryKey(UsermenuitemroleKey usermenuitemroleKey){
		return UsermenuitemroleMapper.deleteByPrimaryKey(usermenuitemroleKey);
	}
	public Usermenuitemrole selectByPrimaryKey(UsermenuitemroleKey usermenuitemroleKey){
		return UsermenuitemroleMapper.selectByPrimaryKey(usermenuitemroleKey);
	}
	public int updateByPrimaryKey(Usermenuitemrole usermenuitemrole){
		return UsermenuitemroleMapper.updateByPrimaryKey(usermenuitemrole);
	}
	public int updateByPrimaryKeySelective(Usermenuitemrole usermenuitemrole){
		return UsermenuitemroleMapper.updateByPrimaryKeySelective(usermenuitemrole);
	}


}
