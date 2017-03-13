package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("shopgroupService")
public class ShopgroupService implements IShopgroupService {
	@Resource
	private shopgroupMapper shopgroupMapper;

	public int insert(shopgroupWithBLOBs shopgroupWithBLOBs){
		return shopgroupMapper.insert(shopgroupWithBLOBs);
	}
	public int insertSelective(shopgroupWithBLOBs shopgroupWithBLOBs){
		return shopgroupMapper.insertSelective(shopgroupWithBLOBs);
	}
	public shopgroupWithBLOBs selectByPrimaryKey(Integer integer){
		return shopgroupMapper.selectByPrimaryKey(integer);
	}
	public int deleteByPrimaryKey(Integer integer){
		return shopgroupMapper.deleteByPrimaryKey(integer);
	}
	public int updateByPrimaryKeySelective(shopgroupWithBLOBs shopgroupWithBLOBs){
		return shopgroupMapper.updateByPrimaryKeySelective(shopgroupWithBLOBs);
	}
	public int updateByPrimaryKey(shopgroup shopgroup){
		return shopgroupMapper.updateByPrimaryKey(shopgroup);
	}
	public int updateByPrimaryKeyWithBLOBs(shopgroupWithBLOBs shopgroupWithBLOBs){
		return shopgroupMapper.updateByPrimaryKeyWithBLOBs(shopgroupWithBLOBs);
	}


}
