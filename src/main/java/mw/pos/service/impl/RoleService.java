package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("roleService")
public class RoleService implements IRoleService {
	@Resource
	private RoleMapper roleMapper;

	public int insert(Role role){
		return roleMapper.insert(role);
	}
	public int insertSelective(Role role){
		return roleMapper.insertSelective(role);
	}
	public int deleteByPrimaryKey(RoleKey roleKey){
		return roleMapper.deleteByPrimaryKey(roleKey);
	}
	public Role selectByPrimaryKey(RoleKey roleKey){
		return roleMapper.selectByPrimaryKey(roleKey);
	}
	public int updateByPrimaryKeySelective(Role role){
		return roleMapper.updateByPrimaryKeySelective(role);
	}
	public int updateByPrimaryKey(Role role){
		return roleMapper.updateByPrimaryKey(role);
	}


}
