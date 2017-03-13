package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("cookbookmenuService")
public class CookbookmenuService implements ICookbookmenuService {
	@Resource
	private cookbookmenuMapper cookbookmenuMapper;

	public int insert(cookbookmenu cookbookmenu){
		return cookbookmenuMapper.insert(cookbookmenu);
	}
	public int insertSelective(cookbookmenu cookbookmenu){
		return cookbookmenuMapper.insertSelective(cookbookmenu);
	}
	public cookbookmenu selectByPrimaryKey(cookbookmenuKey cookbookmenuKey){
		return cookbookmenuMapper.selectByPrimaryKey(cookbookmenuKey);
	}
	public int deleteByPrimaryKey(cookbookmenuKey cookbookmenuKey){
		return cookbookmenuMapper.deleteByPrimaryKey(cookbookmenuKey);
	}
	public int updateByPrimaryKeySelective(cookbookmenu cookbookmenu){
		return cookbookmenuMapper.updateByPrimaryKeySelective(cookbookmenu);
	}
	public int updateByPrimaryKey(cookbookmenu cookbookmenu){
		return cookbookmenuMapper.updateByPrimaryKey(cookbookmenu);
	}


}
