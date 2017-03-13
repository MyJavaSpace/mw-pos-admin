package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("menuingredgprelService")
public class MenuingredgprelService implements IMenuingredgprelService {
	@Resource
	private MenuingredgprelMapper menuingredgprelMapper;

	public int insert(Menuingredgprel menuingredgprel){
		return menuingredgprelMapper.insert(menuingredgprel);
	}
	public int insertSelective(Menuingredgprel menuingredgprel){
		return menuingredgprelMapper.insertSelective(menuingredgprel);
	}
	public int deleteByPrimaryKey(MenuingredgprelKey menuingredgprelKey){
		return menuingredgprelMapper.deleteByPrimaryKey(menuingredgprelKey);
	}
	public Menuingredgprel selectByPrimaryKey(MenuingredgprelKey menuingredgprelKey){
		return menuingredgprelMapper.selectByPrimaryKey(menuingredgprelKey);
	}
	public int updateByPrimaryKeySelective(Menuingredgprel menuingredgprel){
		return menuingredgprelMapper.updateByPrimaryKeySelective(menuingredgprel);
	}
	public int updateByPrimaryKey(Menuingredgprel menuingredgprel){
		return menuingredgprelMapper.updateByPrimaryKey(menuingredgprel);
	}


}
