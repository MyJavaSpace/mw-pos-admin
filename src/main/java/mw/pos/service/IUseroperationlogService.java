package mw.pos.service;

import com.pos.entity.*;

public interface IUseroperationlogService {
	int insert(useroperationlog useroperationlog);
	useroperationlog selectByPrimaryKey(String string);
	int updateByPrimaryKeySelective(useroperationlog useroperationlog);
	int deleteByPrimaryKey(String string);
	int updateByPrimaryKey(useroperationlog useroperationlog);
	int insertSelective(useroperationlog useroperationlog);

}
