package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("menuitemsetsideService")
public class MenuitemsetsideService implements IMenuitemsetsideService {
	@Resource
	private menuitemsetsideMapper menuitemsetsideMapper;

	public int insert(menuitemsetside menuitemsetside){
		return menuitemsetsideMapper.insert(menuitemsetside);
	}
	public int insertSelective(menuitemsetside menuitemsetside){
		return menuitemsetsideMapper.insertSelective(menuitemsetside);
	}
	public menuitemsetside selectByPrimaryKey(menuitemsetsideKey menuitemsetsideKey){
		return menuitemsetsideMapper.selectByPrimaryKey(menuitemsetsideKey);
	}
	public int deleteByPrimaryKey(menuitemsetsideKey menuitemsetsideKey){
		return menuitemsetsideMapper.deleteByPrimaryKey(menuitemsetsideKey);
	}
	public int updateByPrimaryKeySelective(menuitemsetside menuitemsetside){
		return menuitemsetsideMapper.updateByPrimaryKeySelective(menuitemsetside);
	}
	public int updateByPrimaryKey(menuitemsetside menuitemsetside){
		return menuitemsetsideMapper.updateByPrimaryKey(menuitemsetside);
	}


}
