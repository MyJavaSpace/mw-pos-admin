package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("softtypeService")
public class SofttypeService implements ISofttypeService {
	@Resource
	private softtypeMapper softtypeMapper;

	public int insert(softtype softtype){
		return softtypeMapper.insert(softtype);
	}
	public int insertSelective(softtype softtype){
		return softtypeMapper.insertSelective(softtype);
	}
	public softtype selectByPrimaryKey(softtypeKey softtypeKey){
		return softtypeMapper.selectByPrimaryKey(softtypeKey);
	}
	public int deleteByPrimaryKey(softtypeKey softtypeKey){
		return softtypeMapper.deleteByPrimaryKey(softtypeKey);
	}
	public int updateByPrimaryKeySelective(softtype softtype){
		return softtypeMapper.updateByPrimaryKeySelective(softtype);
	}
	public int updateByPrimaryKey(softtype softtype){
		return softtypeMapper.updateByPrimaryKey(softtype);
	}


}
