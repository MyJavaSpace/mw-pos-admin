package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("shopgroupService")
public class ShopgroupService implements IShopgroupService {
	@Resource
	private ShopgroupMapper shopgroupMapper;

	public int insert(ShopgroupWithBLOBs shopgroupWithBLOBs){
		return shopgroupMapper.insert(shopgroupWithBLOBs);
	}
	public int insertSelective(ShopgroupWithBLOBs shopgroupWithBLOBs){
		return shopgroupMapper.insertSelective(shopgroupWithBLOBs);
	}
	public int deleteByPrimaryKey(Integer integer){
		return shopgroupMapper.deleteByPrimaryKey(integer);
	}
	public ShopgroupWithBLOBs selectByPrimaryKey(Integer integer){
		return shopgroupMapper.selectByPrimaryKey(integer);
	}
	public int updateByPrimaryKeySelective(ShopgroupWithBLOBs shopgroupWithBLOBs){
		return shopgroupMapper.updateByPrimaryKeySelective(shopgroupWithBLOBs);
	}
	public int updateByPrimaryKey(Shopgroup shopgroup){
		return shopgroupMapper.updateByPrimaryKey(shopgroup);
	}
	public int updateByPrimaryKeyWithBLOBs(ShopgroupWithBLOBs shopgroupWithBLOBs){
		return shopgroupMapper.updateByPrimaryKeyWithBLOBs(shopgroupWithBLOBs);
	}


}
