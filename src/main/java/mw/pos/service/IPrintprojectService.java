package mw.pos.service;

import com.pos.entity.*;

public interface IPrintprojectService {
	int insert(Printproject printproject);
	int deleteByPrimaryKey(Integer integer);
	int updateByPrimaryKey(Printproject printproject);
	Printproject selectByPrimaryKey(Integer integer);
	int insertSelective(Printproject printproject);
	int updateByPrimaryKeySelective(Printproject printproject);

}
