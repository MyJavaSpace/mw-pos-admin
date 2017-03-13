package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("ShopService")
public class ShopService implements IShopService {
	@Resource
	private ShopMapper ShopMapper;

	public int insert(Shop shop){
		return ShopMapper.insert(shop);
	}
	public int insertSelective(Shop shop){
		return ShopMapper.insertSelective(shop);
	}
	public int deleteByPrimaryKey(String string){
		return ShopMapper.deleteByPrimaryKey(string);
	}
	public Shop selectByPrimaryKey(String string){
		return ShopMapper.selectByPrimaryKey(string);
	}
	public int updateByPrimaryKey(Shop shop){
		return ShopMapper.updateByPrimaryKey(shop);
	}
	public int updateByPrimaryKeySelective(Shop shop){
		return ShopMapper.updateByPrimaryKeySelective(shop);
	}


}
