package mw.pos.service;

import com.pos.entity.*;

public interface IRevenuetypeService {
	int insert(Revenuetype revenuetype);
	int deleteByPrimaryKey(RevenuetypeKey revenuetypeKey);
	int updateByPrimaryKey(Revenuetype revenuetype);
	Revenuetype selectByPrimaryKey(RevenuetypeKey revenuetypeKey);
	int insertSelective(Revenuetype revenuetype);
	int updateByPrimaryKeySelective(Revenuetype revenuetype);

}
