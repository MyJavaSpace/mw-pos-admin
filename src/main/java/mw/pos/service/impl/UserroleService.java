package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("UserroleService")
public class UserroleService implements IUserroleService {
	@Resource
	private UserroleMapper UserroleMapper;

	public int insert(Userrole userrole){
		return UserroleMapper.insert(userrole);
	}
	public int insertSelective(Userrole userrole){
		return UserroleMapper.insertSelective(userrole);
	}
	public int deleteByPrimaryKey(UserroleKey userroleKey){
		return UserroleMapper.deleteByPrimaryKey(userroleKey);
	}
	public Userrole selectByPrimaryKey(UserroleKey userroleKey){
		return UserroleMapper.selectByPrimaryKey(userroleKey);
	}
	public int updateByPrimaryKey(Userrole userrole){
		return UserroleMapper.updateByPrimaryKey(userrole);
	}
	public int updateByPrimaryKeySelective(Userrole userrole){
		return UserroleMapper.updateByPrimaryKeySelective(userrole);
	}


}
