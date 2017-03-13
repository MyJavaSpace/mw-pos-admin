package mw.pos.service;

import com.pos.entity.*;

public interface IMtableService {
	int insert(Mtable mtable);
	int deleteByPrimaryKey(MtableKey mtableKey);
	int updateByPrimaryKey(Mtable mtable);
	Mtable selectByPrimaryKey(MtableKey mtableKey);
	int insertSelective(Mtable mtable);
	int updateByPrimaryKeySelective(Mtable mtable);

}
