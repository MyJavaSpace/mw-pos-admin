package mw.pos.service;

import com.pos.entity.*;

public interface ISetingsService {
	int insert(Setings setings);
	int deleteByPrimaryKey(String string);
	int updateByPrimaryKey(Setings setings);
	Setings selectByPrimaryKey(String string);
	int insertSelective(Setings setings);
	int updateByPrimaryKeySelective(Setings setings);

}
