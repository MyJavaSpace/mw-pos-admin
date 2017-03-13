package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("menuitemsetsideService")
public class MenuitemsetsideService implements IMenuitemsetsideService {
	@Resource
	private MenuitemsetsideMapper menuitemsetsideMapper;

	public int insert(Menuitemsetside menuitemsetside){
		return menuitemsetsideMapper.insert(menuitemsetside);
	}
	public int insertSelective(Menuitemsetside menuitemsetside){
		return menuitemsetsideMapper.insertSelective(menuitemsetside);
	}
	public int deleteByPrimaryKey(MenuitemsetsideKey menuitemsetsideKey){
		return menuitemsetsideMapper.deleteByPrimaryKey(menuitemsetsideKey);
	}
	public Menuitemsetside selectByPrimaryKey(MenuitemsetsideKey menuitemsetsideKey){
		return menuitemsetsideMapper.selectByPrimaryKey(menuitemsetsideKey);
	}
	public int updateByPrimaryKeySelective(Menuitemsetside menuitemsetside){
		return menuitemsetsideMapper.updateByPrimaryKeySelective(menuitemsetside);
	}
	public int updateByPrimaryKey(Menuitemsetside menuitemsetside){
		return menuitemsetsideMapper.updateByPrimaryKey(menuitemsetside);
	}


}
