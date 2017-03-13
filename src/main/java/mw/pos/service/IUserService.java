package mw.pos.service;

import com.pos.entity.*;

public interface IUserService {
	int insert(user user);
	user selectByPrimaryKey(userKey userKey);
	int updateByPrimaryKeySelective(user user);
	int deleteByPrimaryKey(userKey userKey);
	int updateByPrimaryKey(user user);
	int insertSelective(user user);

}
