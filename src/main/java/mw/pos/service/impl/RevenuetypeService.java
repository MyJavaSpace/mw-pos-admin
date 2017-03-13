package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("revenuetypeService")
public class RevenuetypeService implements IRevenuetypeService {
	@Resource
	private RevenuetypeMapper revenuetypeMapper;

	public int insert(Revenuetype revenuetype){
		return revenuetypeMapper.insert(revenuetype);
	}
	public int insertSelective(Revenuetype revenuetype){
		return revenuetypeMapper.insertSelective(revenuetype);
	}
	public int deleteByPrimaryKey(RevenuetypeKey revenuetypeKey){
		return revenuetypeMapper.deleteByPrimaryKey(revenuetypeKey);
	}
	public Revenuetype selectByPrimaryKey(RevenuetypeKey revenuetypeKey){
		return revenuetypeMapper.selectByPrimaryKey(revenuetypeKey);
	}
	public int updateByPrimaryKeySelective(Revenuetype revenuetype){
		return revenuetypeMapper.updateByPrimaryKeySelective(revenuetype);
	}
	public int updateByPrimaryKey(Revenuetype revenuetype){
		return revenuetypeMapper.updateByPrimaryKey(revenuetype);
	}


}
