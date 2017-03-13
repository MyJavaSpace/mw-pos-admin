package mw.pos.service;

import com.pos.entity.*;

public interface ITradeService {
	int insert(trade trade);
	trade selectByPrimaryKey(tradeKey tradeKey);
	int updateByPrimaryKeySelective(trade trade);
	int deleteByPrimaryKey(tradeKey tradeKey);
	int updateByPrimaryKey(trade trade);
	int insertSelective(trade trade);

}
