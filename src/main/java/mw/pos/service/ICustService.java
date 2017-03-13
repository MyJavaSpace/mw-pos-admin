package mw.pos.service;

import com.pos.entity.*;

public interface ICustService {
	int insert(cust cust);
	cust selectByPrimaryKey(String string);
	int updateByPrimaryKeySelective(cust cust);
	int deleteByPrimaryKey(String string);
	int updateByPrimaryKey(cust cust);
	int insertSelective(cust cust);

}
