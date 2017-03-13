package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("deptService")
public class DeptService implements IDeptService {
	@Resource
	private deptMapper deptMapper;

	public int insert(dept dept){
		return deptMapper.insert(dept);
	}
	public int insertSelective(dept dept){
		return deptMapper.insertSelective(dept);
	}
	public dept selectByPrimaryKey(deptKey deptKey){
		return deptMapper.selectByPrimaryKey(deptKey);
	}
	public int deleteByPrimaryKey(deptKey deptKey){
		return deptMapper.deleteByPrimaryKey(deptKey);
	}
	public int updateByPrimaryKeySelective(dept dept){
		return deptMapper.updateByPrimaryKeySelective(dept);
	}
	public int updateByPrimaryKey(dept dept){
		return deptMapper.updateByPrimaryKey(dept);
	}


}
