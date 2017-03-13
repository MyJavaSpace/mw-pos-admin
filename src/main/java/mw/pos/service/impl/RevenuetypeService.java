package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("RevenuetypeService")
public class RevenuetypeService implements IRevenuetypeService {
	@Resource
	private RevenuetypeMapper RevenuetypeMapper;

	public int insert(Revenuetype revenuetype){
		return RevenuetypeMapper.insert(revenuetype);
	}
	public int insertSelective(Revenuetype revenuetype){
		return RevenuetypeMapper.insertSelective(revenuetype);
	}
	public int deleteByPrimaryKey(RevenuetypeKey revenuetypeKey){
		return RevenuetypeMapper.deleteByPrimaryKey(revenuetypeKey);
	}
	public Revenuetype selectByPrimaryKey(RevenuetypeKey revenuetypeKey){
		return RevenuetypeMapper.selectByPrimaryKey(revenuetypeKey);
	}
	public int updateByPrimaryKey(Revenuetype revenuetype){
		return RevenuetypeMapper.updateByPrimaryKey(revenuetype);
	}
	public int updateByPrimaryKeySelective(Revenuetype revenuetype){
		return RevenuetypeMapper.updateByPrimaryKeySelective(revenuetype);
	}


}
