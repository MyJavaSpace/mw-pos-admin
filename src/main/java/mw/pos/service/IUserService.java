package mw.pos.service;

import com.pos.entity.*;

public interface IUserService {
	int insert(User user);
	int deleteByPrimaryKey(UserKey userKey);
	int updateByPrimaryKey(User user);
	User selectByPrimaryKey(UserKey userKey);
	int insertSelective(User user);
	int updateByPrimaryKeySelective(User user);

}
