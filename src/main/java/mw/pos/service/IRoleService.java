package mw.pos.service;

import com.pos.entity.*;

public interface IRoleService {
	int insert(role role);
	role selectByPrimaryKey(roleKey roleKey);
	int updateByPrimaryKeySelective(role role);
	int deleteByPrimaryKey(roleKey roleKey);
	int updateByPrimaryKey(role role);
	int insertSelective(role role);

}
