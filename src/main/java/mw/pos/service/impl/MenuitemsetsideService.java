package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("MenuitemsetsideService")
public class MenuitemsetsideService implements IMenuitemsetsideService {
	@Resource
	private MenuitemsetsideMapper MenuitemsetsideMapper;

	public int insert(Menuitemsetside menuitemsetside){
		return MenuitemsetsideMapper.insert(menuitemsetside);
	}
	public int insertSelective(Menuitemsetside menuitemsetside){
		return MenuitemsetsideMapper.insertSelective(menuitemsetside);
	}
	public int deleteByPrimaryKey(MenuitemsetsideKey menuitemsetsideKey){
		return MenuitemsetsideMapper.deleteByPrimaryKey(menuitemsetsideKey);
	}
	public Menuitemsetside selectByPrimaryKey(MenuitemsetsideKey menuitemsetsideKey){
		return MenuitemsetsideMapper.selectByPrimaryKey(menuitemsetsideKey);
	}
	public int updateByPrimaryKey(Menuitemsetside menuitemsetside){
		return MenuitemsetsideMapper.updateByPrimaryKey(menuitemsetside);
	}
	public int updateByPrimaryKeySelective(Menuitemsetside menuitemsetside){
		return MenuitemsetsideMapper.updateByPrimaryKeySelective(menuitemsetside);
	}


}
