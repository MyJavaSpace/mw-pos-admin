package mw.pos.service;

import com.pos.entity.*;

public interface IUserroleService {
	int insert(Userrole userrole);
	int deleteByPrimaryKey(UserroleKey userroleKey);
	int updateByPrimaryKey(Userrole userrole);
	Userrole selectByPrimaryKey(UserroleKey userroleKey);
	int insertSelective(Userrole userrole);
	int updateByPrimaryKeySelective(Userrole userrole);

}
