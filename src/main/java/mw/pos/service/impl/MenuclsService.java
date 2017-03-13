package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("menuclsService")
public class MenuclsService implements IMenuclsService {
	@Resource
	private MenuclsMapper menuclsMapper;

	public int insert(Menucls menucls){
		return menuclsMapper.insert(menucls);
	}
	public int insertSelective(Menucls menucls){
		return menuclsMapper.insertSelective(menucls);
	}
	public int deleteByPrimaryKey(MenuclsKey menuclsKey){
		return menuclsMapper.deleteByPrimaryKey(menuclsKey);
	}
	public Menucls selectByPrimaryKey(MenuclsKey menuclsKey){
		return menuclsMapper.selectByPrimaryKey(menuclsKey);
	}
	public int updateByPrimaryKeySelective(Menucls menucls){
		return menuclsMapper.updateByPrimaryKeySelective(menucls);
	}
	public int updateByPrimaryKey(Menucls menucls){
		return menuclsMapper.updateByPrimaryKey(menucls);
	}


}
