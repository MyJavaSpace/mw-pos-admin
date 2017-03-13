package mw.pos.service;

import com.pos.entity.*;

public interface IAskService {
	int insert(Ask ask);
	int deleteByPrimaryKey(AskKey askKey);
	int updateByPrimaryKey(Ask ask);
	Ask selectByPrimaryKey(AskKey askKey);
	int insertSelective(Ask ask);
	int updateByPrimaryKeySelective(Ask ask);

}
