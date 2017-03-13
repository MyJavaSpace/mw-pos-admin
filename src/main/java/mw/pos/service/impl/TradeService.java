package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("tradeService")
public class TradeService implements ITradeService {
	@Resource
	private tradeMapper tradeMapper;

	public int insert(trade trade){
		return tradeMapper.insert(trade);
	}
	public int insertSelective(trade trade){
		return tradeMapper.insertSelective(trade);
	}
	public trade selectByPrimaryKey(tradeKey tradeKey){
		return tradeMapper.selectByPrimaryKey(tradeKey);
	}
	public int deleteByPrimaryKey(tradeKey tradeKey){
		return tradeMapper.deleteByPrimaryKey(tradeKey);
	}
	public int updateByPrimaryKeySelective(trade trade){
		return tradeMapper.updateByPrimaryKeySelective(trade);
	}
	public int updateByPrimaryKey(trade trade){
		return tradeMapper.updateByPrimaryKey(trade);
	}


}
