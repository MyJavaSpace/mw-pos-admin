package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("shopgroupdtlService")
public class ShopgroupdtlService implements IShopgroupdtlService {
	@Resource
	private shopgroupdtlMapper shopgroupdtlMapper;

	public int insert(shopgroupdtl shopgroupdtl){
		return shopgroupdtlMapper.insert(shopgroupdtl);
	}
	public int insertSelective(shopgroupdtl shopgroupdtl){
		return shopgroupdtlMapper.insertSelective(shopgroupdtl);
	}
	public shopgroupdtl selectByPrimaryKey(shopgroupdtlKey shopgroupdtlKey){
		return shopgroupdtlMapper.selectByPrimaryKey(shopgroupdtlKey);
	}
	public int deleteByPrimaryKey(shopgroupdtlKey shopgroupdtlKey){
		return shopgroupdtlMapper.deleteByPrimaryKey(shopgroupdtlKey);
	}
	public int updateByPrimaryKeySelective(shopgroupdtl shopgroupdtl){
		return shopgroupdtlMapper.updateByPrimaryKeySelective(shopgroupdtl);
	}
	public int updateByPrimaryKey(shopgroupdtl shopgroupdtl){
		return shopgroupdtlMapper.updateByPrimaryKey(shopgroupdtl);
	}


}
