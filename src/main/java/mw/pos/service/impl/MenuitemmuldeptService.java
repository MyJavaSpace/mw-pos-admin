package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("menuitemmuldeptService")
public class MenuitemmuldeptService implements IMenuitemmuldeptService {
	@Resource
	private MenuitemmuldeptMapper menuitemmuldeptMapper;

	public int insert(Menuitemmuldept menuitemmuldept){
		return menuitemmuldeptMapper.insert(menuitemmuldept);
	}
	public int insertSelective(Menuitemmuldept menuitemmuldept){
		return menuitemmuldeptMapper.insertSelective(menuitemmuldept);
	}
	public int deleteByPrimaryKey(MenuitemmuldeptKey menuitemmuldeptKey){
		return menuitemmuldeptMapper.deleteByPrimaryKey(menuitemmuldeptKey);
	}
	public Menuitemmuldept selectByPrimaryKey(MenuitemmuldeptKey menuitemmuldeptKey){
		return menuitemmuldeptMapper.selectByPrimaryKey(menuitemmuldeptKey);
	}
	public int updateByPrimaryKeySelective(Menuitemmuldept menuitemmuldept){
		return menuitemmuldeptMapper.updateByPrimaryKeySelective(menuitemmuldept);
	}
	public int updateByPrimaryKey(Menuitemmuldept menuitemmuldept){
		return menuitemmuldeptMapper.updateByPrimaryKey(menuitemmuldept);
	}


}
