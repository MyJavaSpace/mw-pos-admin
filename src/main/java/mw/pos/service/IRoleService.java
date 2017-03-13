package mw.pos.service;

import com.pos.entity.*;

public interface IRoleService {
	int insert(Role role);
	int deleteByPrimaryKey(RoleKey roleKey);
	int updateByPrimaryKey(Role role);
	Role selectByPrimaryKey(RoleKey roleKey);
	int insertSelective(Role role);
	int updateByPrimaryKeySelective(Role role);

}
