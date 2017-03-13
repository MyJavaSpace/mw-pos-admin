package mw.pos.service;

import com.pos.entity.*;

public interface IMtableService {
	int insert(mtable mtable);
	mtable selectByPrimaryKey(mtableKey mtableKey);
	int updateByPrimaryKeySelective(mtable mtable);
	int deleteByPrimaryKey(mtableKey mtableKey);
	int updateByPrimaryKey(mtable mtable);
	int insertSelective(mtable mtable);

}
