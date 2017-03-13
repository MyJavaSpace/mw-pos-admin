package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("menuingredientgpService")
public class MenuingredientgpService implements IMenuingredientgpService {
	@Resource
	private menuingredientgpMapper menuingredientgpMapper;

	public int insert(menuingredientgp menuingredientgp){
		return menuingredientgpMapper.insert(menuingredientgp);
	}
	public int insertSelective(menuingredientgp menuingredientgp){
		return menuingredientgpMapper.insertSelective(menuingredientgp);
	}
	public menuingredientgp selectByPrimaryKey(menuingredientgpKey menuingredientgpKey){
		return menuingredientgpMapper.selectByPrimaryKey(menuingredientgpKey);
	}
	public int deleteByPrimaryKey(menuingredientgpKey menuingredientgpKey){
		return menuingredientgpMapper.deleteByPrimaryKey(menuingredientgpKey);
	}
	public int updateByPrimaryKeySelective(menuingredientgp menuingredientgp){
		return menuingredientgpMapper.updateByPrimaryKeySelective(menuingredientgp);
	}
	public int updateByPrimaryKey(menuingredientgp menuingredientgp){
		return menuingredientgpMapper.updateByPrimaryKey(menuingredientgp);
	}


}
