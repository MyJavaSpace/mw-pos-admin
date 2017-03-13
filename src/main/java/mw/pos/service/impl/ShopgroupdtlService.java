package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("ShopgroupdtlService")
public class ShopgroupdtlService implements IShopgroupdtlService {
	@Resource
	private ShopgroupdtlMapper ShopgroupdtlMapper;

	public int insert(Shopgroupdtl shopgroupdtl){
		return ShopgroupdtlMapper.insert(shopgroupdtl);
	}
	public int insertSelective(Shopgroupdtl shopgroupdtl){
		return ShopgroupdtlMapper.insertSelective(shopgroupdtl);
	}
	public int deleteByPrimaryKey(ShopgroupdtlKey shopgroupdtlKey){
		return ShopgroupdtlMapper.deleteByPrimaryKey(shopgroupdtlKey);
	}
	public Shopgroupdtl selectByPrimaryKey(ShopgroupdtlKey shopgroupdtlKey){
		return ShopgroupdtlMapper.selectByPrimaryKey(shopgroupdtlKey);
	}
	public int updateByPrimaryKey(Shopgroupdtl shopgroupdtl){
		return ShopgroupdtlMapper.updateByPrimaryKey(shopgroupdtl);
	}
	public int updateByPrimaryKeySelective(Shopgroupdtl shopgroupdtl){
		return ShopgroupdtlMapper.updateByPrimaryKeySelective(shopgroupdtl);
	}


}
