package mw.pos.service;

import com.pos.entity.*;

public interface IDeptService {
	int insert(Dept dept);
	int deleteByPrimaryKey(DeptKey deptKey);
	int updateByPrimaryKey(Dept dept);
	Dept selectByPrimaryKey(DeptKey deptKey);
	int insertSelective(Dept dept);
	int updateByPrimaryKeySelective(Dept dept);

}
