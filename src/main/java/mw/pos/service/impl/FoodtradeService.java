package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("foodtradeService")
public class FoodtradeService implements IFoodtradeService {
	@Resource
	private FoodtradeMapper foodtradeMapper;

	public int insert(Foodtrade foodtrade){
		return foodtradeMapper.insert(foodtrade);
	}
	public int insertSelective(Foodtrade foodtrade){
		return foodtradeMapper.insertSelective(foodtrade);
	}
	public int deleteByPrimaryKey(String string){
		return foodtradeMapper.deleteByPrimaryKey(string);
	}
	public Foodtrade selectByPrimaryKey(String string){
		return foodtradeMapper.selectByPrimaryKey(string);
	}
	public int updateByPrimaryKeySelective(Foodtrade foodtrade){
		return foodtradeMapper.updateByPrimaryKeySelective(foodtrade);
	}
	public int updateByPrimaryKey(Foodtrade foodtrade){
		return foodtradeMapper.updateByPrimaryKey(foodtrade);
	}


}
