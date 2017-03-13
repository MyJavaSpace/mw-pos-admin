package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("userroleService")
public class UserroleService implements IUserroleService {
	@Resource
	private UserroleMapper userroleMapper;

	public int insert(Userrole userrole){
		return userroleMapper.insert(userrole);
	}
	public int insertSelective(Userrole userrole){
		return userroleMapper.insertSelective(userrole);
	}
	public int deleteByPrimaryKey(UserroleKey userroleKey){
		return userroleMapper.deleteByPrimaryKey(userroleKey);
	}
	public Userrole selectByPrimaryKey(UserroleKey userroleKey){
		return userroleMapper.selectByPrimaryKey(userroleKey);
	}
	public int updateByPrimaryKeySelective(Userrole userrole){
		return userroleMapper.updateByPrimaryKeySelective(userrole);
	}
	public int updateByPrimaryKey(Userrole userrole){
		return userroleMapper.updateByPrimaryKey(userrole);
	}


}
