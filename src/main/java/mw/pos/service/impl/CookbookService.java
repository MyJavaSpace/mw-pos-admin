package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("cookbookService")
public class CookbookService implements ICookbookService {
	@Resource
	private CookbookMapper cookbookMapper;

	public int insert(Cookbook cookbook){
		return cookbookMapper.insert(cookbook);
	}
	public int insertSelective(Cookbook cookbook){
		return cookbookMapper.insertSelective(cookbook);
	}
	public int deleteByPrimaryKey(CookbookKey cookbookKey){
		return cookbookMapper.deleteByPrimaryKey(cookbookKey);
	}
	public Cookbook selectByPrimaryKey(CookbookKey cookbookKey){
		return cookbookMapper.selectByPrimaryKey(cookbookKey);
	}
	public int updateByPrimaryKeySelective(Cookbook cookbook){
		return cookbookMapper.updateByPrimaryKeySelective(cookbook);
	}
	public int updateByPrimaryKey(Cookbook cookbook){
		return cookbookMapper.updateByPrimaryKey(cookbook);
	}


}
