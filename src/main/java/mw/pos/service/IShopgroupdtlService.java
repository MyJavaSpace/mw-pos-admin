package mw.pos.service;

import com.pos.entity.*;

public interface IShopgroupdtlService {
	int insert(shopgroupdtl shopgroupdtl);
	shopgroupdtl selectByPrimaryKey(shopgroupdtlKey shopgroupdtlKey);
	int updateByPrimaryKeySelective(shopgroupdtl shopgroupdtl);
	int deleteByPrimaryKey(shopgroupdtlKey shopgroupdtlKey);
	int updateByPrimaryKey(shopgroupdtl shopgroupdtl);
	int insertSelective(shopgroupdtl shopgroupdtl);

}
