package mw.pos.service;

import com.pos.entity.*;

public interface IShopgroupService {
	int insert(shopgroupWithBLOBs shopgroupWithBLOBs);
	shopgroupWithBLOBs selectByPrimaryKey(Integer integer);
	int updateByPrimaryKeySelective(shopgroupWithBLOBs shopgroupWithBLOBs);
	int deleteByPrimaryKey(Integer integer);
	int updateByPrimaryKey(shopgroup shopgroup);
	int insertSelective(shopgroupWithBLOBs shopgroupWithBLOBs);
	int updateByPrimaryKeyWithBLOBs(shopgroupWithBLOBs shopgroupWithBLOBs);

}
