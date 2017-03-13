package mw.pos.service;

import com.pos.entity.*;

public interface IUsermenuitemroleService {
	int insert(usermenuitemrole usermenuitemrole);
	usermenuitemrole selectByPrimaryKey(usermenuitemroleKey usermenuitemroleKey);
	int updateByPrimaryKeySelective(usermenuitemrole usermenuitemrole);
	int deleteByPrimaryKey(usermenuitemroleKey usermenuitemroleKey);
	int updateByPrimaryKey(usermenuitemrole usermenuitemrole);
	int insertSelective(usermenuitemrole usermenuitemrole);

}
