package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("TradeService")
public class TradeService implements ITradeService {
	@Resource
	private TradeMapper TradeMapper;

	public int insert(Trade trade){
		return TradeMapper.insert(trade);
	}
	public int insertSelective(Trade trade){
		return TradeMapper.insertSelective(trade);
	}
	public int deleteByPrimaryKey(TradeKey tradeKey){
		return TradeMapper.deleteByPrimaryKey(tradeKey);
	}
	public Trade selectByPrimaryKey(TradeKey tradeKey){
		return TradeMapper.selectByPrimaryKey(tradeKey);
	}
	public int updateByPrimaryKey(Trade trade){
		return TradeMapper.updateByPrimaryKey(trade);
	}
	public int updateByPrimaryKeySelective(Trade trade){
		return TradeMapper.updateByPrimaryKeySelective(trade);
	}


}
