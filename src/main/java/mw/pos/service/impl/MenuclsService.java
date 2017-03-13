package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("menuclsService")
public class MenuclsService implements IMenuclsService {
	@Resource
	private menuclsMapper menuclsMapper;

	public int insert(menucls menucls){
		return menuclsMapper.insert(menucls);
	}
	public int insertSelective(menucls menucls){
		return menuclsMapper.insertSelective(menucls);
	}
	public menucls selectByPrimaryKey(menuclsKey menuclsKey){
		return menuclsMapper.selectByPrimaryKey(menuclsKey);
	}
	public int deleteByPrimaryKey(menuclsKey menuclsKey){
		return menuclsMapper.deleteByPrimaryKey(menuclsKey);
	}
	public int updateByPrimaryKeySelective(menucls menucls){
		return menuclsMapper.updateByPrimaryKeySelective(menucls);
	}
	public int updateByPrimaryKey(menucls menucls){
		return menuclsMapper.updateByPrimaryKey(menucls);
	}


}
