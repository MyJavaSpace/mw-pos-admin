package mw.pos.service;

import com.pos.entity.*;

public interface INoticeService {
	int insert(notice notice);
	notice selectByPrimaryKey(Integer integer);
	int updateByPrimaryKeySelective(notice notice);
	int deleteByPrimaryKey(Integer integer);
	int updateByPrimaryKey(notice notice);
	int insertSelective(notice notice);

}
