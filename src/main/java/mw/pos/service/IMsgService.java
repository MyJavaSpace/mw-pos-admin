package mw.pos.service;

import com.pos.entity.*;

public interface IMsgService {
	int insert(msg msg);
	msg selectByPrimaryKey(Integer integer);
	int updateByPrimaryKeySelective(msg msg);
	int deleteByPrimaryKey(Integer integer);
	int updateByPrimaryKey(msg msg);
	int insertSelective(msg msg);

}
