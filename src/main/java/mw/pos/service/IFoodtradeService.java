package mw.pos.service;

import com.pos.entity.*;

public interface IFoodtradeService {
	int insert(Foodtrade foodtrade);
	int deleteByPrimaryKey(String string);
	int updateByPrimaryKey(Foodtrade foodtrade);
	Foodtrade selectByPrimaryKey(String string);
	int insertSelective(Foodtrade foodtrade);
	int updateByPrimaryKeySelective(Foodtrade foodtrade);

}
