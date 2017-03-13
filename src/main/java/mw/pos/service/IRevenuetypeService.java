package mw.pos.service;

import com.pos.entity.*;

public interface IRevenuetypeService {
	int insert(revenuetype revenuetype);
	revenuetype selectByPrimaryKey(revenuetypeKey revenuetypeKey);
	int updateByPrimaryKeySelective(revenuetype revenuetype);
	int deleteByPrimaryKey(revenuetypeKey revenuetypeKey);
	int updateByPrimaryKey(revenuetype revenuetype);
	int insertSelective(revenuetype revenuetype);

}
