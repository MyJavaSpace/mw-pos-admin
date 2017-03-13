package mw.pos.service;

import com.pos.entity.*;

public interface IBillsourceService {
	int insert(Billsource billsource);
	int deleteByPrimaryKey(BillsourceKey billsourceKey);
	int updateByPrimaryKey(Billsource billsource);
	Billsource selectByPrimaryKey(BillsourceKey billsourceKey);
	int insertSelective(Billsource billsource);
	int updateByPrimaryKeySelective(Billsource billsource);

}
