package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("MenuingredientgpService")
public class MenuingredientgpService implements IMenuingredientgpService {
	@Resource
	private MenuingredientgpMapper MenuingredientgpMapper;

	public int insert(Menuingredientgp menuingredientgp){
		return MenuingredientgpMapper.insert(menuingredientgp);
	}
	public int insertSelective(Menuingredientgp menuingredientgp){
		return MenuingredientgpMapper.insertSelective(menuingredientgp);
	}
	public int deleteByPrimaryKey(MenuingredientgpKey menuingredientgpKey){
		return MenuingredientgpMapper.deleteByPrimaryKey(menuingredientgpKey);
	}
	public Menuingredientgp selectByPrimaryKey(MenuingredientgpKey menuingredientgpKey){
		return MenuingredientgpMapper.selectByPrimaryKey(menuingredientgpKey);
	}
	public int updateByPrimaryKey(Menuingredientgp menuingredientgp){
		return MenuingredientgpMapper.updateByPrimaryKey(menuingredientgp);
	}
	public int updateByPrimaryKeySelective(Menuingredientgp menuingredientgp){
		return MenuingredientgpMapper.updateByPrimaryKeySelective(menuingredientgp);
	}


}
