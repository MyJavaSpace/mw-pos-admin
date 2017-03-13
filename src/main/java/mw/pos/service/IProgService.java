package mw.pos.service;

import com.pos.entity.*;

public interface IProgService {
	int insert(prog prog);
	prog selectByPrimaryKey(String string);
	int updateByPrimaryKeySelective(prog prog);
	int deleteByPrimaryKey(String string);
	int updateByPrimaryKey(prog prog);
	int insertSelective(prog prog);

}
