package mw.pos.service;

import com.pos.entity.*;

public interface IShopService {
	int insert(shop shop);
	shop selectByPrimaryKey(String string);
	int updateByPrimaryKeySelective(shop shop);
	int deleteByPrimaryKey(String string);
	int updateByPrimaryKey(shop shop);
	int insertSelective(shop shop);

}
