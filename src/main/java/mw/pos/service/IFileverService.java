package mw.pos.service;

import com.pos.entity.*;

public interface IFileverService {
	int insert(filever filever);
	filever selectByPrimaryKey(String string);
	int updateByPrimaryKeySelective(filever filever);
	int deleteByPrimaryKey(String string);
	int updateByPrimaryKey(filever filever);
	int insertSelective(filever filever);

}
