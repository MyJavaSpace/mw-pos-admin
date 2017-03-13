package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("roleService")
public class RoleService implements IRoleService {
	@Resource
	private roleMapper roleMapper;

	public int insert(role role){
		return roleMapper.insert(role);
	}
	public int insertSelective(role role){
		return roleMapper.insertSelective(role);
	}
	public role selectByPrimaryKey(roleKey roleKey){
		return roleMapper.selectByPrimaryKey(roleKey);
	}
	public int deleteByPrimaryKey(roleKey roleKey){
		return roleMapper.deleteByPrimaryKey(roleKey);
	}
	public int updateByPrimaryKeySelective(role role){
		return roleMapper.updateByPrimaryKeySelective(role);
	}
	public int updateByPrimaryKey(role role){
		return roleMapper.updateByPrimaryKey(role);
	}


}
