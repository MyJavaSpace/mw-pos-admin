package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("menuitemService")
public class MenuitemService implements IMenuitemService {
	@Resource
	private menuitemMapper menuitemMapper;

	public int insert(menuitem menuitem){
		return menuitemMapper.insert(menuitem);
	}
	public int insertSelective(menuitem menuitem){
		return menuitemMapper.insertSelective(menuitem);
	}
	public menuitem selectByPrimaryKey(menuitemKey menuitemKey){
		return menuitemMapper.selectByPrimaryKey(menuitemKey);
	}
	public int deleteByPrimaryKey(menuitemKey menuitemKey){
		return menuitemMapper.deleteByPrimaryKey(menuitemKey);
	}
	public int updateByPrimaryKeySelective(menuitem menuitem){
		return menuitemMapper.updateByPrimaryKeySelective(menuitem);
	}
	public int updateByPrimaryKey(menuitem menuitem){
		return menuitemMapper.updateByPrimaryKey(menuitem);
	}


}
