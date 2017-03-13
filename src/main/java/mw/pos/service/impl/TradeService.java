package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("tradeService")
public class TradeService implements ITradeService {
	@Resource
	private TradeMapper tradeMapper;

	public int insert(Trade trade){
		return tradeMapper.insert(trade);
	}
	public int insertSelective(Trade trade){
		return tradeMapper.insertSelective(trade);
	}
	public int deleteByPrimaryKey(TradeKey tradeKey){
		return tradeMapper.deleteByPrimaryKey(tradeKey);
	}
	public Trade selectByPrimaryKey(TradeKey tradeKey){
		return tradeMapper.selectByPrimaryKey(tradeKey);
	}
	public int updateByPrimaryKeySelective(Trade trade){
		return tradeMapper.updateByPrimaryKeySelective(trade);
	}
	public int updateByPrimaryKey(Trade trade){
		return tradeMapper.updateByPrimaryKey(trade);
	}


}
