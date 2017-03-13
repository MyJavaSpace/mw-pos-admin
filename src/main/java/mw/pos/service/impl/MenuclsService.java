package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("MenuclsService")
public class MenuclsService implements IMenuclsService {
	@Resource
	private MenuclsMapper MenuclsMapper;

	public int insert(Menucls menucls){
		return MenuclsMapper.insert(menucls);
	}
	public int insertSelective(Menucls menucls){
		return MenuclsMapper.insertSelective(menucls);
	}
	public int deleteByPrimaryKey(MenuclsKey menuclsKey){
		return MenuclsMapper.deleteByPrimaryKey(menuclsKey);
	}
	public Menucls selectByPrimaryKey(MenuclsKey menuclsKey){
		return MenuclsMapper.selectByPrimaryKey(menuclsKey);
	}
	public int updateByPrimaryKey(Menucls menucls){
		return MenuclsMapper.updateByPrimaryKey(menucls);
	}
	public int updateByPrimaryKeySelective(Menucls menucls){
		return MenuclsMapper.updateByPrimaryKeySelective(menucls);
	}


}
