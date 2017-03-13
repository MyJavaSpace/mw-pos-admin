package mw.pos.service;

import com.pos.entity.*;

public interface IMtablesteService {
	int insert(Mtableste mtableste);
	int deleteByPrimaryKey(MtablesteKey mtablesteKey);
	int updateByPrimaryKey(Mtableste mtableste);
	Mtableste selectByPrimaryKey(MtablesteKey mtablesteKey);
	int insertSelective(Mtableste mtableste);
	int updateByPrimaryKeySelective(Mtableste mtableste);

}
