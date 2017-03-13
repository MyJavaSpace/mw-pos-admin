package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("menuingredientService")
public class MenuingredientService implements IMenuingredientService {
	@Resource
	private menuingredientMapper menuingredientMapper;

	public int insert(menuingredient menuingredient){
		return menuingredientMapper.insert(menuingredient);
	}
	public int insertSelective(menuingredient menuingredient){
		return menuingredientMapper.insertSelective(menuingredient);
	}
	public menuingredient selectByPrimaryKey(menuingredientKey menuingredientKey){
		return menuingredientMapper.selectByPrimaryKey(menuingredientKey);
	}
	public int deleteByPrimaryKey(menuingredientKey menuingredientKey){
		return menuingredientMapper.deleteByPrimaryKey(menuingredientKey);
	}
	public int updateByPrimaryKeySelective(menuingredient menuingredient){
		return menuingredientMapper.updateByPrimaryKeySelective(menuingredient);
	}
	public int updateByPrimaryKey(menuingredient menuingredient){
		return menuingredientMapper.updateByPrimaryKey(menuingredient);
	}


}
