package mw.pos.service;

import com.pos.entity.*;

public interface IUserauthdataService {
	int insert(userauthdata userauthdata);
	userauthdata selectByPrimaryKey(userauthdataKey userauthdataKey);
	int updateByPrimaryKeySelective(userauthdata userauthdata);
	int deleteByPrimaryKey(userauthdataKey userauthdataKey);
	int updateByPrimaryKey(userauthdata userauthdata);
	int insertSelective(userauthdata userauthdata);

}
