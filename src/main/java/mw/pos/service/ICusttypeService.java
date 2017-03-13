package mw.pos.service;

import com.pos.entity.*;

public interface ICusttypeService {
	int insert(Custtype custtype);
	int deleteByPrimaryKey(CusttypeKey custtypeKey);
	int updateByPrimaryKey(Custtype custtype);
	Custtype selectByPrimaryKey(CusttypeKey custtypeKey);
	int insertSelective(Custtype custtype);
	int updateByPrimaryKeySelective(Custtype custtype);

}
