package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("CookbookService")
public class CookbookService implements ICookbookService {
	@Resource
	private CookbookMapper CookbookMapper;

	public int insert(Cookbook cookbook){
		return CookbookMapper.insert(cookbook);
	}
	public int insertSelective(Cookbook cookbook){
		return CookbookMapper.insertSelective(cookbook);
	}
	public int deleteByPrimaryKey(CookbookKey cookbookKey){
		return CookbookMapper.deleteByPrimaryKey(cookbookKey);
	}
	public Cookbook selectByPrimaryKey(CookbookKey cookbookKey){
		return CookbookMapper.selectByPrimaryKey(cookbookKey);
	}
	public int updateByPrimaryKey(Cookbook cookbook){
		return CookbookMapper.updateByPrimaryKey(cookbook);
	}
	public int updateByPrimaryKeySelective(Cookbook cookbook){
		return CookbookMapper.updateByPrimaryKeySelective(cookbook);
	}


}
