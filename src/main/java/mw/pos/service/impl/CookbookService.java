package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("cookbookService")
public class CookbookService implements ICookbookService {
	@Resource
	private cookbookMapper cookbookMapper;

	public int insert(cookbook cookbook){
		return cookbookMapper.insert(cookbook);
	}
	public int insertSelective(cookbook cookbook){
		return cookbookMapper.insertSelective(cookbook);
	}
	public cookbook selectByPrimaryKey(cookbookKey cookbookKey){
		return cookbookMapper.selectByPrimaryKey(cookbookKey);
	}
	public int deleteByPrimaryKey(cookbookKey cookbookKey){
		return cookbookMapper.deleteByPrimaryKey(cookbookKey);
	}
	public int updateByPrimaryKeySelective(cookbook cookbook){
		return cookbookMapper.updateByPrimaryKeySelective(cookbook);
	}
	public int updateByPrimaryKey(cookbook cookbook){
		return cookbookMapper.updateByPrimaryKey(cookbook);
	}


}
