package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("shopgroupdtlService")
public class ShopgroupdtlService implements IShopgroupdtlService {
	@Resource
	private ShopgroupdtlMapper shopgroupdtlMapper;

	public int insert(Shopgroupdtl shopgroupdtl){
		return shopgroupdtlMapper.insert(shopgroupdtl);
	}
	public int insertSelective(Shopgroupdtl shopgroupdtl){
		return shopgroupdtlMapper.insertSelective(shopgroupdtl);
	}
	public int deleteByPrimaryKey(ShopgroupdtlKey shopgroupdtlKey){
		return shopgroupdtlMapper.deleteByPrimaryKey(shopgroupdtlKey);
	}
	public Shopgroupdtl selectByPrimaryKey(ShopgroupdtlKey shopgroupdtlKey){
		return shopgroupdtlMapper.selectByPrimaryKey(shopgroupdtlKey);
	}
	public int updateByPrimaryKeySelective(Shopgroupdtl shopgroupdtl){
		return shopgroupdtlMapper.updateByPrimaryKeySelective(shopgroupdtl);
	}
	public int updateByPrimaryKey(Shopgroupdtl shopgroupdtl){
		return shopgroupdtlMapper.updateByPrimaryKey(shopgroupdtl);
	}


}
