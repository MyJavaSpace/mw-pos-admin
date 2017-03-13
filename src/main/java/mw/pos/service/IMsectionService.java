package mw.pos.service;

import com.pos.entity.*;

public interface IMsectionService {
	int insert(msection msection);
	msection selectByPrimaryKey(msectionKey msectionKey);
	int updateByPrimaryKeySelective(msection msection);
	int deleteByPrimaryKey(msectionKey msectionKey);
	int updateByPrimaryKey(msection msection);
	int insertSelective(msection msection);

}
