package mw.pos.service;

import com.pos.entity.*;

public interface IMsgService {
	int insert(Msg msg);
	int deleteByPrimaryKey(Integer integer);
	int updateByPrimaryKey(Msg msg);
	Msg selectByPrimaryKey(Integer integer);
	int insertSelective(Msg msg);
	int updateByPrimaryKeySelective(Msg msg);

}
