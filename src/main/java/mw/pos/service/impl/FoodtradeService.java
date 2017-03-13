package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("FoodtradeService")
public class FoodtradeService implements IFoodtradeService {
	@Resource
	private FoodtradeMapper FoodtradeMapper;

	public int insert(Foodtrade foodtrade){
		return FoodtradeMapper.insert(foodtrade);
	}
	public int insertSelective(Foodtrade foodtrade){
		return FoodtradeMapper.insertSelective(foodtrade);
	}
	public int deleteByPrimaryKey(String string){
		return FoodtradeMapper.deleteByPrimaryKey(string);
	}
	public Foodtrade selectByPrimaryKey(String string){
		return FoodtradeMapper.selectByPrimaryKey(string);
	}
	public int updateByPrimaryKey(Foodtrade foodtrade){
		return FoodtradeMapper.updateByPrimaryKey(foodtrade);
	}
	public int updateByPrimaryKeySelective(Foodtrade foodtrade){
		return FoodtradeMapper.updateByPrimaryKeySelective(foodtrade);
	}


}
