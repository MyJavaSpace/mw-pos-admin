package mw.pos.service;

import com.pos.entity.*;

public interface IFileverService {
	int insert(Filever filever);
	int deleteByPrimaryKey(String string);
	int updateByPrimaryKey(Filever filever);
	Filever selectByPrimaryKey(String string);
	int insertSelective(Filever filever);
	int updateByPrimaryKeySelective(Filever filever);

}
