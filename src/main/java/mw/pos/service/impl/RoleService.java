package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("RoleService")
public class RoleService implements IRoleService {
	@Resource
	private RoleMapper RoleMapper;

	public int insert(Role role){
		return RoleMapper.insert(role);
	}
	public int insertSelective(Role role){
		return RoleMapper.insertSelective(role);
	}
	public int deleteByPrimaryKey(RoleKey roleKey){
		return RoleMapper.deleteByPrimaryKey(roleKey);
	}
	public Role selectByPrimaryKey(RoleKey roleKey){
		return RoleMapper.selectByPrimaryKey(roleKey);
	}
	public int updateByPrimaryKey(Role role){
		return RoleMapper.updateByPrimaryKey(role);
	}
	public int updateByPrimaryKeySelective(Role role){
		return RoleMapper.updateByPrimaryKeySelective(role);
	}


}
