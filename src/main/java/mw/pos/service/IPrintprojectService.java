package mw.pos.service;

import com.pos.entity.*;

public interface IPrintprojectService {
	int insert(printproject printproject);
	printproject selectByPrimaryKey(Integer integer);
	int updateByPrimaryKeySelective(printproject printproject);
	int deleteByPrimaryKey(Integer integer);
	int updateByPrimaryKey(printproject printproject);
	int insertSelective(printproject printproject);

}
