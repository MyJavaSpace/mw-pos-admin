package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("MenuitemService")
public class MenuitemService implements IMenuitemService {
	@Resource
	private MenuitemMapper MenuitemMapper;

	public int insert(Menuitem menuitem){
		return MenuitemMapper.insert(menuitem);
	}
	public int insertSelective(Menuitem menuitem){
		return MenuitemMapper.insertSelective(menuitem);
	}
	public int deleteByPrimaryKey(MenuitemKey menuitemKey){
		return MenuitemMapper.deleteByPrimaryKey(menuitemKey);
	}
	public Menuitem selectByPrimaryKey(MenuitemKey menuitemKey){
		return MenuitemMapper.selectByPrimaryKey(menuitemKey);
	}
	public int updateByPrimaryKey(Menuitem menuitem){
		return MenuitemMapper.updateByPrimaryKey(menuitem);
	}
	public int updateByPrimaryKeySelective(Menuitem menuitem){
		return MenuitemMapper.updateByPrimaryKeySelective(menuitem);
	}


}
