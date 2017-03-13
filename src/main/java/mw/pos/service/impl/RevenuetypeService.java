package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("revenuetypeService")
public class RevenuetypeService implements IRevenuetypeService {
	@Resource
	private revenuetypeMapper revenuetypeMapper;

	public int insert(revenuetype revenuetype){
		return revenuetypeMapper.insert(revenuetype);
	}
	public int insertSelective(revenuetype revenuetype){
		return revenuetypeMapper.insertSelective(revenuetype);
	}
	public revenuetype selectByPrimaryKey(revenuetypeKey revenuetypeKey){
		return revenuetypeMapper.selectByPrimaryKey(revenuetypeKey);
	}
	public int deleteByPrimaryKey(revenuetypeKey revenuetypeKey){
		return revenuetypeMapper.deleteByPrimaryKey(revenuetypeKey);
	}
	public int updateByPrimaryKeySelective(revenuetype revenuetype){
		return revenuetypeMapper.updateByPrimaryKeySelective(revenuetype);
	}
	public int updateByPrimaryKey(revenuetype revenuetype){
		return revenuetypeMapper.updateByPrimaryKey(revenuetype);
	}


}
