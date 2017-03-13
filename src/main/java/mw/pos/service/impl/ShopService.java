package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("shopService")
public class ShopService implements IShopService {
	@Resource
	private shopMapper shopMapper;

	public int insert(shop shop){
		return shopMapper.insert(shop);
	}
	public int insertSelective(shop shop){
		return shopMapper.insertSelective(shop);
	}
	public shop selectByPrimaryKey(String string){
		return shopMapper.selectByPrimaryKey(string);
	}
	public int deleteByPrimaryKey(String string){
		return shopMapper.deleteByPrimaryKey(string);
	}
	public int updateByPrimaryKeySelective(shop shop){
		return shopMapper.updateByPrimaryKeySelective(shop);
	}
	public int updateByPrimaryKey(shop shop){
		return shopMapper.updateByPrimaryKey(shop);
	}


}
