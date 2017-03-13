package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("CookbookmenuService")
public class CookbookmenuService implements ICookbookmenuService {
	@Resource
	private CookbookmenuMapper CookbookmenuMapper;

	public int insert(Cookbookmenu cookbookmenu){
		return CookbookmenuMapper.insert(cookbookmenu);
	}
	public int insertSelective(Cookbookmenu cookbookmenu){
		return CookbookmenuMapper.insertSelective(cookbookmenu);
	}
	public int deleteByPrimaryKey(CookbookmenuKey cookbookmenuKey){
		return CookbookmenuMapper.deleteByPrimaryKey(cookbookmenuKey);
	}
	public Cookbookmenu selectByPrimaryKey(CookbookmenuKey cookbookmenuKey){
		return CookbookmenuMapper.selectByPrimaryKey(cookbookmenuKey);
	}
	public int updateByPrimaryKey(Cookbookmenu cookbookmenu){
		return CookbookmenuMapper.updateByPrimaryKey(cookbookmenu);
	}
	public int updateByPrimaryKeySelective(Cookbookmenu cookbookmenu){
		return CookbookmenuMapper.updateByPrimaryKeySelective(cookbookmenu);
	}


}
