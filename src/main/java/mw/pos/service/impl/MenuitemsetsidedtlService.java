package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("menuitemsetsidedtlService")
public class MenuitemsetsidedtlService implements IMenuitemsetsidedtlService {
	@Resource
	private menuitemsetsidedtlMapper menuitemsetsidedtlMapper;

	public int insert(menuitemsetsidedtl menuitemsetsidedtl){
		return menuitemsetsidedtlMapper.insert(menuitemsetsidedtl);
	}
	public int insertSelective(menuitemsetsidedtl menuitemsetsidedtl){
		return menuitemsetsidedtlMapper.insertSelective(menuitemsetsidedtl);
	}
	public menuitemsetsidedtl selectByPrimaryKey(menuitemsetsidedtlKey menuitemsetsidedtlKey){
		return menuitemsetsidedtlMapper.selectByPrimaryKey(menuitemsetsidedtlKey);
	}
	public int deleteByPrimaryKey(menuitemsetsidedtlKey menuitemsetsidedtlKey){
		return menuitemsetsidedtlMapper.deleteByPrimaryKey(menuitemsetsidedtlKey);
	}
	public int updateByPrimaryKeySelective(menuitemsetsidedtl menuitemsetsidedtl){
		return menuitemsetsidedtlMapper.updateByPrimaryKeySelective(menuitemsetsidedtl);
	}
	public int updateByPrimaryKey(menuitemsetsidedtl menuitemsetsidedtl){
		return menuitemsetsidedtlMapper.updateByPrimaryKey(menuitemsetsidedtl);
	}


}
