package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("MenuitemmuldeptService")
public class MenuitemmuldeptService implements IMenuitemmuldeptService {
	@Resource
	private MenuitemmuldeptMapper MenuitemmuldeptMapper;

	public int insert(Menuitemmuldept menuitemmuldept){
		return MenuitemmuldeptMapper.insert(menuitemmuldept);
	}
	public int insertSelective(Menuitemmuldept menuitemmuldept){
		return MenuitemmuldeptMapper.insertSelective(menuitemmuldept);
	}
	public int deleteByPrimaryKey(MenuitemmuldeptKey menuitemmuldeptKey){
		return MenuitemmuldeptMapper.deleteByPrimaryKey(menuitemmuldeptKey);
	}
	public Menuitemmuldept selectByPrimaryKey(MenuitemmuldeptKey menuitemmuldeptKey){
		return MenuitemmuldeptMapper.selectByPrimaryKey(menuitemmuldeptKey);
	}
	public int updateByPrimaryKey(Menuitemmuldept menuitemmuldept){
		return MenuitemmuldeptMapper.updateByPrimaryKey(menuitemmuldept);
	}
	public int updateByPrimaryKeySelective(Menuitemmuldept menuitemmuldept){
		return MenuitemmuldeptMapper.updateByPrimaryKeySelective(menuitemmuldept);
	}


}
