package mw.pos.service;

import com.pos.entity.*;

public interface IShopService {
	int insert(Shop shop);
	int deleteByPrimaryKey(String string);
	int updateByPrimaryKey(Shop shop);
	Shop selectByPrimaryKey(String string);
	int insertSelective(Shop shop);
	int updateByPrimaryKeySelective(Shop shop);

}
