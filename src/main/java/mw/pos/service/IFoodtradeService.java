package mw.pos.service;

import com.pos.entity.*;

public interface IFoodtradeService {
	int insert(foodtrade foodtrade);
	foodtrade selectByPrimaryKey(String string);
	int updateByPrimaryKeySelective(foodtrade foodtrade);
	int deleteByPrimaryKey(String string);
	int updateByPrimaryKey(foodtrade foodtrade);
	int insertSelective(foodtrade foodtrade);

}
