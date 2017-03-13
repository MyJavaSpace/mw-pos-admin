package mw.pos.service;

import com.pos.entity.*;

public interface IUserroleService {
	int insert(userrole userrole);
	userrole selectByPrimaryKey(userroleKey userroleKey);
	int updateByPrimaryKeySelective(userrole userrole);
	int deleteByPrimaryKey(userroleKey userroleKey);
	int updateByPrimaryKey(userrole userrole);
	int insertSelective(userrole userrole);

}
