package mw.pos.service;

import com.pos.entity.*;

public interface ISofttypeService {
	int insert(softtype softtype);
	softtype selectByPrimaryKey(softtypeKey softtypeKey);
	int updateByPrimaryKeySelective(softtype softtype);
	int deleteByPrimaryKey(softtypeKey softtypeKey);
	int updateByPrimaryKey(softtype softtype);
	int insertSelective(softtype softtype);

}
