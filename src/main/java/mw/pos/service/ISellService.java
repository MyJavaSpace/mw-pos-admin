package mw.pos.service;

import com.pos.entity.*;

public interface ISellService {
	int insert(Sell sell);
	int deleteByPrimaryKey(SellKey sellKey);
	int updateByPrimaryKey(Sell sell);
	Sell selectByPrimaryKey(SellKey sellKey);
	int insertSelective(Sell sell);
	int updateByPrimaryKeySelective(Sell sell);

}
