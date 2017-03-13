package mw.pos.service;

import com.pos.entity.*;

public interface IUserauthdataService {
	int insert(Userauthdata userauthdata);
	int deleteByPrimaryKey(UserauthdataKey userauthdataKey);
	int updateByPrimaryKey(Userauthdata userauthdata);
	Userauthdata selectByPrimaryKey(UserauthdataKey userauthdataKey);
	int insertSelective(Userauthdata userauthdata);
	int updateByPrimaryKeySelective(Userauthdata userauthdata);

}
