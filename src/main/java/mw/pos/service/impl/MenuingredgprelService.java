package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("MenuingredgprelService")
public class MenuingredgprelService implements IMenuingredgprelService {
	@Resource
	private MenuingredgprelMapper MenuingredgprelMapper;

	public int insert(Menuingredgprel menuingredgprel){
		return MenuingredgprelMapper.insert(menuingredgprel);
	}
	public int insertSelective(Menuingredgprel menuingredgprel){
		return MenuingredgprelMapper.insertSelective(menuingredgprel);
	}
	public int deleteByPrimaryKey(MenuingredgprelKey menuingredgprelKey){
		return MenuingredgprelMapper.deleteByPrimaryKey(menuingredgprelKey);
	}
	public Menuingredgprel selectByPrimaryKey(MenuingredgprelKey menuingredgprelKey){
		return MenuingredgprelMapper.selectByPrimaryKey(menuingredgprelKey);
	}
	public int updateByPrimaryKey(Menuingredgprel menuingredgprel){
		return MenuingredgprelMapper.updateByPrimaryKey(menuingredgprel);
	}
	public int updateByPrimaryKeySelective(Menuingredgprel menuingredgprel){
		return MenuingredgprelMapper.updateByPrimaryKeySelective(menuingredgprel);
	}


}
