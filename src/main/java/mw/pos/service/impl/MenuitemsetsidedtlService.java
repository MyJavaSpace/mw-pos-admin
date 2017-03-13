package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("menuitemsetsidedtlService")
public class MenuitemsetsidedtlService implements IMenuitemsetsidedtlService {
	@Resource
	private MenuitemsetsidedtlMapper menuitemsetsidedtlMapper;

	public int insert(Menuitemsetsidedtl menuitemsetsidedtl){
		return menuitemsetsidedtlMapper.insert(menuitemsetsidedtl);
	}
	public int insertSelective(Menuitemsetsidedtl menuitemsetsidedtl){
		return menuitemsetsidedtlMapper.insertSelective(menuitemsetsidedtl);
	}
	public int deleteByPrimaryKey(MenuitemsetsidedtlKey menuitemsetsidedtlKey){
		return menuitemsetsidedtlMapper.deleteByPrimaryKey(menuitemsetsidedtlKey);
	}
	public Menuitemsetsidedtl selectByPrimaryKey(MenuitemsetsidedtlKey menuitemsetsidedtlKey){
		return menuitemsetsidedtlMapper.selectByPrimaryKey(menuitemsetsidedtlKey);
	}
	public int updateByPrimaryKeySelective(Menuitemsetsidedtl menuitemsetsidedtl){
		return menuitemsetsidedtlMapper.updateByPrimaryKeySelective(menuitemsetsidedtl);
	}
	public int updateByPrimaryKey(Menuitemsetsidedtl menuitemsetsidedtl){
		return menuitemsetsidedtlMapper.updateByPrimaryKey(menuitemsetsidedtl);
	}


}
