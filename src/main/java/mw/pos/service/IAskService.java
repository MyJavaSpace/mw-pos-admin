package mw.pos.service;

import com.pos.entity.*;

public interface IAskService {
	int insert(ask ask);
	ask selectByPrimaryKey(askKey askKey);
	int updateByPrimaryKeySelective(ask ask);
	int deleteByPrimaryKey(askKey askKey);
	int updateByPrimaryKey(ask ask);
	int insertSelective(ask ask);

}
