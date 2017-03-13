package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("deptService")
public class DeptService implements IDeptService {
	@Resource
	private DeptMapper deptMapper;

	public int insert(Dept dept){
		return deptMapper.insert(dept);
	}
	public int insertSelective(Dept dept){
		return deptMapper.insertSelective(dept);
	}
	public int deleteByPrimaryKey(DeptKey deptKey){
		return deptMapper.deleteByPrimaryKey(deptKey);
	}
	public Dept selectByPrimaryKey(DeptKey deptKey){
		return deptMapper.selectByPrimaryKey(deptKey);
	}
	public int updateByPrimaryKeySelective(Dept dept){
		return deptMapper.updateByPrimaryKeySelective(dept);
	}
	public int updateByPrimaryKey(Dept dept){
		return deptMapper.updateByPrimaryKey(dept);
	}


}
