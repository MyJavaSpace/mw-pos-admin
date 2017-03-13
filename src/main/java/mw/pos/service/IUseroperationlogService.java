package mw.pos.service;

import com.pos.entity.*;

public interface IUseroperationlogService {
	int insert(Useroperationlog useroperationlog);
	int deleteByPrimaryKey(String string);
	int updateByPrimaryKey(Useroperationlog useroperationlog);
	Useroperationlog selectByPrimaryKey(String string);
	int insertSelective(Useroperationlog useroperationlog);
	int updateByPrimaryKeySelective(Useroperationlog useroperationlog);

}
