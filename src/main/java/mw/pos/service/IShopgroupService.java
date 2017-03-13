package mw.pos.service;

import com.pos.entity.*;

public interface IShopgroupService {
	int insert(ShopgroupWithBLOBs shopgroupWithBLOBs);
	int updateByPrimaryKeyWithBLOBs(ShopgroupWithBLOBs shopgroupWithBLOBs);
	int deleteByPrimaryKey(Integer integer);
	int updateByPrimaryKey(Shopgroup shopgroup);
	ShopgroupWithBLOBs selectByPrimaryKey(Integer integer);
	int insertSelective(ShopgroupWithBLOBs shopgroupWithBLOBs);
	int updateByPrimaryKeySelective(ShopgroupWithBLOBs shopgroupWithBLOBs);

}
