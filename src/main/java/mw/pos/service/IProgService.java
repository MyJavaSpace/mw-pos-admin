package mw.pos.service;

import com.pos.entity.*;

public interface IProgService {
	int insert(Prog prog);
	int deleteByPrimaryKey(String string);
	int updateByPrimaryKey(Prog prog);
	Prog selectByPrimaryKey(String string);
	int insertSelective(Prog prog);
	int updateByPrimaryKeySelective(Prog prog);

}
