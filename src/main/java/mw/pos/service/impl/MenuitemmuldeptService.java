package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("menuitemmuldeptService")
public class MenuitemmuldeptService implements IMenuitemmuldeptService {
	@Resource
	private menuitemmuldeptMapper menuitemmuldeptMapper;

	public int insert(menuitemmuldept menuitemmuldept){
		return menuitemmuldeptMapper.insert(menuitemmuldept);
	}
	public int insertSelective(menuitemmuldept menuitemmuldept){
		return menuitemmuldeptMapper.insertSelective(menuitemmuldept);
	}
	public menuitemmuldept selectByPrimaryKey(menuitemmuldeptKey menuitemmuldeptKey){
		return menuitemmuldeptMapper.selectByPrimaryKey(menuitemmuldeptKey);
	}
	public int deleteByPrimaryKey(menuitemmuldeptKey menuitemmuldeptKey){
		return menuitemmuldeptMapper.deleteByPrimaryKey(menuitemmuldeptKey);
	}
	public int updateByPrimaryKeySelective(menuitemmuldept menuitemmuldept){
		return menuitemmuldeptMapper.updateByPrimaryKeySelective(menuitemmuldept);
	}
	public int updateByPrimaryKey(menuitemmuldept menuitemmuldept){
		return menuitemmuldeptMapper.updateByPrimaryKey(menuitemmuldept);
	}


}
