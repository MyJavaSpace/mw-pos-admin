package mw.pos.service;

import com.pos.entity.*;

public interface IMtablesteService {
	int insert(mtableste mtableste);
	mtableste selectByPrimaryKey(mtablesteKey mtablesteKey);
	int updateByPrimaryKeySelective(mtableste mtableste);
	int deleteByPrimaryKey(mtablesteKey mtablesteKey);
	int updateByPrimaryKey(mtableste mtableste);
	int insertSelective(mtableste mtableste);

}
