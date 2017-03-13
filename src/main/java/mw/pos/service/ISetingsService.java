package mw.pos.service;

import com.pos.entity.*;

public interface ISetingsService {
	int insert(setings setings);
	setings selectByPrimaryKey(String string);
	int updateByPrimaryKeySelective(setings setings);
	int deleteByPrimaryKey(String string);
	int updateByPrimaryKey(setings setings);
	int insertSelective(setings setings);

}
