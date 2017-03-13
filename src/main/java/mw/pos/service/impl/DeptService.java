package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("DeptService")
public class DeptService implements IDeptService {
	@Resource
	private DeptMapper DeptMapper;

	public int insert(Dept dept){
		return DeptMapper.insert(dept);
	}
	public int insertSelective(Dept dept){
		return DeptMapper.insertSelective(dept);
	}
	public int deleteByPrimaryKey(DeptKey deptKey){
		return DeptMapper.deleteByPrimaryKey(deptKey);
	}
	public Dept selectByPrimaryKey(DeptKey deptKey){
		return DeptMapper.selectByPrimaryKey(deptKey);
	}
	public int updateByPrimaryKey(Dept dept){
		return DeptMapper.updateByPrimaryKey(dept);
	}
	public int updateByPrimaryKeySelective(Dept dept){
		return DeptMapper.updateByPrimaryKeySelective(dept);
	}


}
