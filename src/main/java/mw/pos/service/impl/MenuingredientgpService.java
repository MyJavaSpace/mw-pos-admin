package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("menuingredientgpService")
public class MenuingredientgpService implements IMenuingredientgpService {
	@Resource
	private MenuingredientgpMapper menuingredientgpMapper;

	public int insert(Menuingredientgp menuingredientgp){
		return menuingredientgpMapper.insert(menuingredientgp);
	}
	public int insertSelective(Menuingredientgp menuingredientgp){
		return menuingredientgpMapper.insertSelective(menuingredientgp);
	}
	public int deleteByPrimaryKey(MenuingredientgpKey menuingredientgpKey){
		return menuingredientgpMapper.deleteByPrimaryKey(menuingredientgpKey);
	}
	public Menuingredientgp selectByPrimaryKey(MenuingredientgpKey menuingredientgpKey){
		return menuingredientgpMapper.selectByPrimaryKey(menuingredientgpKey);
	}
	public int updateByPrimaryKeySelective(Menuingredientgp menuingredientgp){
		return menuingredientgpMapper.updateByPrimaryKeySelective(menuingredientgp);
	}
	public int updateByPrimaryKey(Menuingredientgp menuingredientgp){
		return menuingredientgpMapper.updateByPrimaryKey(menuingredientgp);
	}


}
