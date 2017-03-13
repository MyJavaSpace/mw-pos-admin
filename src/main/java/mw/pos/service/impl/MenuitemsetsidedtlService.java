package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("MenuitemsetsidedtlService")
public class MenuitemsetsidedtlService implements IMenuitemsetsidedtlService {
	@Resource
	private MenuitemsetsidedtlMapper MenuitemsetsidedtlMapper;

	public int insert(Menuitemsetsidedtl menuitemsetsidedtl){
		return MenuitemsetsidedtlMapper.insert(menuitemsetsidedtl);
	}
	public int insertSelective(Menuitemsetsidedtl menuitemsetsidedtl){
		return MenuitemsetsidedtlMapper.insertSelective(menuitemsetsidedtl);
	}
	public int deleteByPrimaryKey(MenuitemsetsidedtlKey menuitemsetsidedtlKey){
		return MenuitemsetsidedtlMapper.deleteByPrimaryKey(menuitemsetsidedtlKey);
	}
	public Menuitemsetsidedtl selectByPrimaryKey(MenuitemsetsidedtlKey menuitemsetsidedtlKey){
		return MenuitemsetsidedtlMapper.selectByPrimaryKey(menuitemsetsidedtlKey);
	}
	public int updateByPrimaryKey(Menuitemsetsidedtl menuitemsetsidedtl){
		return MenuitemsetsidedtlMapper.updateByPrimaryKey(menuitemsetsidedtl);
	}
	public int updateByPrimaryKeySelective(Menuitemsetsidedtl menuitemsetsidedtl){
		return MenuitemsetsidedtlMapper.updateByPrimaryKeySelective(menuitemsetsidedtl);
	}


}
