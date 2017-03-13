package mw.pos.service;

import com.pos.entity.*;

public interface ISellorderService {
	int insert(Sellorder sellorder);
	int deleteByPrimaryKey(SellorderKey sellorderKey);
	int updateByPrimaryKey(Sellorder sellorder);
	Sellorder selectByPrimaryKey(SellorderKey sellorderKey);
	int insertSelective(Sellorder sellorder);
	int updateByPrimaryKeySelective(Sellorder sellorder);

}
