package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("ShopgroupService")
public class ShopgroupService implements IShopgroupService {
	@Resource
	private ShopgroupMapper ShopgroupMapper;

	public int insert(ShopgroupWithBLOBs shopgroupWithBLOBs){
		return ShopgroupMapper.insert(shopgroupWithBLOBs);
	}
	public int insertSelective(ShopgroupWithBLOBs shopgroupWithBLOBs){
		return ShopgroupMapper.insertSelective(shopgroupWithBLOBs);
	}
	public int deleteByPrimaryKey(Integer integer){
		return ShopgroupMapper.deleteByPrimaryKey(integer);
	}
	public ShopgroupWithBLOBs selectByPrimaryKey(Integer integer){
		return ShopgroupMapper.selectByPrimaryKey(integer);
	}
	public int updateByPrimaryKey(Shopgroup shopgroup){
		return ShopgroupMapper.updateByPrimaryKey(shopgroup);
	}
	public int updateByPrimaryKeySelective(ShopgroupWithBLOBs shopgroupWithBLOBs){
		return ShopgroupMapper.updateByPrimaryKeySelective(shopgroupWithBLOBs);
	}
	public int updateByPrimaryKeyWithBLOBs(ShopgroupWithBLOBs shopgroupWithBLOBs){
		return ShopgroupMapper.updateByPrimaryKeyWithBLOBs(shopgroupWithBLOBs);
	}


}
