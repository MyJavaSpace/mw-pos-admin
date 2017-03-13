package mw.pos.service;

import com.pos.entity.*;

public interface IBillsourceService {
	int insert(billsource billsource);
	billsource selectByPrimaryKey(billsourceKey billsourceKey);
	int updateByPrimaryKeySelective(billsource billsource);
	int deleteByPrimaryKey(billsourceKey billsourceKey);
	int updateByPrimaryKey(billsource billsource);
	int insertSelective(billsource billsource);

}
