package mw.pos.service;

import com.pos.entity.*;

public interface IDeptService {
	int insert(dept dept);
	dept selectByPrimaryKey(deptKey deptKey);
	int updateByPrimaryKeySelective(dept dept);
	int deleteByPrimaryKey(deptKey deptKey);
	int updateByPrimaryKey(dept dept);
	int insertSelective(dept dept);

}
