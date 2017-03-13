package mw.pos.service;

import com.pos.entity.*;

public interface IUsermenuitemroleService {
	int insert(Usermenuitemrole usermenuitemrole);
	int deleteByPrimaryKey(UsermenuitemroleKey usermenuitemroleKey);
	int updateByPrimaryKey(Usermenuitemrole usermenuitemrole);
	Usermenuitemrole selectByPrimaryKey(UsermenuitemroleKey usermenuitemroleKey);
	int insertSelective(Usermenuitemrole usermenuitemrole);
	int updateByPrimaryKeySelective(Usermenuitemrole usermenuitemrole);

}
