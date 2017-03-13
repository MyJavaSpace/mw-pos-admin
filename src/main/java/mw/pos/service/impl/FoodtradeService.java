package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("foodtradeService")
public class FoodtradeService implements IFoodtradeService {
	@Resource
	private foodtradeMapper foodtradeMapper;

	public int insert(foodtrade foodtrade){
		return foodtradeMapper.insert(foodtrade);
	}
	public int insertSelective(foodtrade foodtrade){
		return foodtradeMapper.insertSelective(foodtrade);
	}
	public foodtrade selectByPrimaryKey(String string){
		return foodtradeMapper.selectByPrimaryKey(string);
	}
	public int deleteByPrimaryKey(String string){
		return foodtradeMapper.deleteByPrimaryKey(string);
	}
	public int updateByPrimaryKeySelective(foodtrade foodtrade){
		return foodtradeMapper.updateByPrimaryKeySelective(foodtrade);
	}
	public int updateByPrimaryKey(foodtrade foodtrade){
		return foodtradeMapper.updateByPrimaryKey(foodtrade);
	}


}
