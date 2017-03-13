package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("softtypeService")
public class SofttypeService implements ISofttypeService {
	@Resource
	private SofttypeMapper softtypeMapper;

	public int insert(Softtype softtype){
		return softtypeMapper.insert(softtype);
	}
	public int insertSelective(Softtype softtype){
		return softtypeMapper.insertSelective(softtype);
	}
	public int deleteByPrimaryKey(SofttypeKey softtypeKey){
		return softtypeMapper.deleteByPrimaryKey(softtypeKey);
	}
	public Softtype selectByPrimaryKey(SofttypeKey softtypeKey){
		return softtypeMapper.selectByPrimaryKey(softtypeKey);
	}
	public int updateByPrimaryKeySelective(Softtype softtype){
		return softtypeMapper.updateByPrimaryKeySelective(softtype);
	}
	public int updateByPrimaryKey(Softtype softtype){
		return softtypeMapper.updateByPrimaryKey(softtype);
	}


}
