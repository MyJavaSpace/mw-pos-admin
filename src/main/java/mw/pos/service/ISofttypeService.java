package mw.pos.service;

import com.pos.entity.*;

public interface ISofttypeService {
	int insert(Softtype softtype);
	int deleteByPrimaryKey(SofttypeKey softtypeKey);
	int updateByPrimaryKey(Softtype softtype);
	Softtype selectByPrimaryKey(SofttypeKey softtypeKey);
	int insertSelective(Softtype softtype);
	int updateByPrimaryKeySelective(Softtype softtype);

}
