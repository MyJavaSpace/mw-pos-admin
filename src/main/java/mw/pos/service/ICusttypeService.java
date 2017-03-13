package mw.pos.service;

import com.pos.entity.*;

public interface ICusttypeService {
	int insert(custtype custtype);
	custtype selectByPrimaryKey(custtypeKey custtypeKey);
	int updateByPrimaryKeySelective(custtype custtype);
	int deleteByPrimaryKey(custtypeKey custtypeKey);
	int updateByPrimaryKey(custtype custtype);
	int insertSelective(custtype custtype);

}
