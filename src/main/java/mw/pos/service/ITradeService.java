package mw.pos.service;

import com.pos.entity.*;

public interface ITradeService {
	int insert(Trade trade);
	int deleteByPrimaryKey(TradeKey tradeKey);
	int updateByPrimaryKey(Trade trade);
	Trade selectByPrimaryKey(TradeKey tradeKey);
	int insertSelective(Trade trade);
	int updateByPrimaryKeySelective(Trade trade);

}
