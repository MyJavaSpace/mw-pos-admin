package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("SofttypeService")
public class SofttypeService implements ISofttypeService {
	@Resource
	private SofttypeMapper SofttypeMapper;

	public int insert(Softtype softtype){
		return SofttypeMapper.insert(softtype);
	}
	public int insertSelective(Softtype softtype){
		return SofttypeMapper.insertSelective(softtype);
	}
	public int deleteByPrimaryKey(SofttypeKey softtypeKey){
		return SofttypeMapper.deleteByPrimaryKey(softtypeKey);
	}
	public Softtype selectByPrimaryKey(SofttypeKey softtypeKey){
		return SofttypeMapper.selectByPrimaryKey(softtypeKey);
	}
	public int updateByPrimaryKey(Softtype softtype){
		return SofttypeMapper.updateByPrimaryKey(softtype);
	}
	public int updateByPrimaryKeySelective(Softtype softtype){
		return SofttypeMapper.updateByPrimaryKeySelective(softtype);
	}


}
