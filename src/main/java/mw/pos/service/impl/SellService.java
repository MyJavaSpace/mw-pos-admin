package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("SellService")
public class SellService implements ISellService {
	@Resource
	private SellMapper SellMapper;

	public int insert(Sell sell){
		return SellMapper.insert(sell);
	}
	public int insertSelective(Sell sell){
		return SellMapper.insertSelective(sell);
	}
	public int deleteByPrimaryKey(SellKey sellKey){
		return SellMapper.deleteByPrimaryKey(sellKey);
	}
	public Sell selectByPrimaryKey(SellKey sellKey){
		return SellMapper.selectByPrimaryKey(sellKey);
	}
	public int updateByPrimaryKey(Sell sell){
		return SellMapper.updateByPrimaryKey(sell);
	}
	public int updateByPrimaryKeySelective(Sell sell){
		return SellMapper.updateByPrimaryKeySelective(sell);
	}


}
