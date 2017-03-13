package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("menuitemService")
public class MenuitemService implements IMenuitemService {
	@Resource
	private MenuitemMapper menuitemMapper;

	public int insert(Menuitem menuitem){
		return menuitemMapper.insert(menuitem);
	}
	public int insertSelective(Menuitem menuitem){
		return menuitemMapper.insertSelective(menuitem);
	}
	public int deleteByPrimaryKey(MenuitemKey menuitemKey){
		return menuitemMapper.deleteByPrimaryKey(menuitemKey);
	}
	public Menuitem selectByPrimaryKey(MenuitemKey menuitemKey){
		return menuitemMapper.selectByPrimaryKey(menuitemKey);
	}
	public int updateByPrimaryKeySelective(Menuitem menuitem){
		return menuitemMapper.updateByPrimaryKeySelective(menuitem);
	}
	public int updateByPrimaryKey(Menuitem menuitem){
		return menuitemMapper.updateByPrimaryKey(menuitem);
	}


}
