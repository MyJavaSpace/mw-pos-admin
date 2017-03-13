package mw.pos.service;

import com.pos.entity.*;

public interface ICustService {
	int insert(Cust cust);
	int deleteByPrimaryKey(String string);
	int updateByPrimaryKey(Cust cust);
	Cust selectByPrimaryKey(String string);
	int insertSelective(Cust cust);
	int updateByPrimaryKeySelective(Cust cust);

}
