package mw.pos.service;

import com.pos.entity.*;

public interface IMsectionService {
	int insert(Msection msection);
	int deleteByPrimaryKey(MsectionKey msectionKey);
	int updateByPrimaryKey(Msection msection);
	Msection selectByPrimaryKey(MsectionKey msectionKey);
	int insertSelective(Msection msection);
	int updateByPrimaryKeySelective(Msection msection);

}
