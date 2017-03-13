package mw.pos.service;

import com.pos.entity.*;

public interface INoticeService {
	int insert(Notice notice);
	int deleteByPrimaryKey(Integer integer);
	int updateByPrimaryKey(Notice notice);
	Notice selectByPrimaryKey(Integer integer);
	int insertSelective(Notice notice);
	int updateByPrimaryKeySelective(Notice notice);

}
