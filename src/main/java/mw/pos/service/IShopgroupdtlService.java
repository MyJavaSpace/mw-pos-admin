package mw.pos.service;

import com.pos.entity.*;

public interface IShopgroupdtlService {
	int insert(Shopgroupdtl shopgroupdtl);
	int deleteByPrimaryKey(ShopgroupdtlKey shopgroupdtlKey);
	int updateByPrimaryKey(Shopgroupdtl shopgroupdtl);
	Shopgroupdtl selectByPrimaryKey(ShopgroupdtlKey shopgroupdtlKey);
	int insertSelective(Shopgroupdtl shopgroupdtl);
	int updateByPrimaryKeySelective(Shopgroupdtl shopgroupdtl);

}
