package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("userroleService")
public class UserroleService implements IUserroleService {
	@Resource
	private userroleMapper userroleMapper;

	public int insert(userrole userrole){
		return userroleMapper.insert(userrole);
	}
	public int insertSelective(userrole userrole){
		return userroleMapper.insertSelective(userrole);
	}
	public userrole selectByPrimaryKey(userroleKey userroleKey){
		return userroleMapper.selectByPrimaryKey(userroleKey);
	}
	public int deleteByPrimaryKey(userroleKey userroleKey){
		return userroleMapper.deleteByPrimaryKey(userroleKey);
	}
	public int updateByPrimaryKeySelective(userrole userrole){
		return userroleMapper.updateByPrimaryKeySelective(userrole);
	}
	public int updateByPrimaryKey(userrole userrole){
		return userroleMapper.updateByPrimaryKey(userrole);
	}


}
