package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("shopService")
public class ShopService implements IShopService {
	@Resource
	private ShopMapper shopMapper;

	public int insert(Shop shop){
		return shopMapper.insert(shop);
	}
	public int insertSelective(Shop shop){
		return shopMapper.insertSelective(shop);
	}
	public int deleteByPrimaryKey(String string){
		return shopMapper.deleteByPrimaryKey(string);
	}
	public Shop selectByPrimaryKey(String string){
		return shopMapper.selectByPrimaryKey(string);
	}
	public int updateByPrimaryKeySelective(Shop shop){
		return shopMapper.updateByPrimaryKeySelective(shop);
	}
	public int updateByPrimaryKey(Shop shop){
		return shopMapper.updateByPrimaryKey(shop);
	}


}
