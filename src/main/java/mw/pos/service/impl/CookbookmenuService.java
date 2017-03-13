package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("cookbookmenuService")
public class CookbookmenuService implements ICookbookmenuService {
	@Resource
	private CookbookmenuMapper cookbookmenuMapper;

	public int insert(Cookbookmenu cookbookmenu){
		return cookbookmenuMapper.insert(cookbookmenu);
	}
	public int insertSelective(Cookbookmenu cookbookmenu){
		return cookbookmenuMapper.insertSelective(cookbookmenu);
	}
	public int deleteByPrimaryKey(CookbookmenuKey cookbookmenuKey){
		return cookbookmenuMapper.deleteByPrimaryKey(cookbookmenuKey);
	}
	public Cookbookmenu selectByPrimaryKey(CookbookmenuKey cookbookmenuKey){
		return cookbookmenuMapper.selectByPrimaryKey(cookbookmenuKey);
	}
	public int updateByPrimaryKeySelective(Cookbookmenu cookbookmenu){
		return cookbookmenuMapper.updateByPrimaryKeySelective(cookbookmenu);
	}
	public int updateByPrimaryKey(Cookbookmenu cookbookmenu){
		return cookbookmenuMapper.updateByPrimaryKey(cookbookmenu);
	}


}
