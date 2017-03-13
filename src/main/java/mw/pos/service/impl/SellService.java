package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("sellService")
public class SellService implements ISellService {
	@Resource
	private SellMapper sellMapper;

	public int insert(Sell sell){
		return sellMapper.insert(sell);
	}
	public int insertSelective(Sell sell){
		return sellMapper.insertSelective(sell);
	}
	public int deleteByPrimaryKey(SellKey sellKey){
		return sellMapper.deleteByPrimaryKey(sellKey);
	}
	public Sell selectByPrimaryKey(SellKey sellKey){
		return sellMapper.selectByPrimaryKey(sellKey);
	}
	public int updateByPrimaryKeySelective(Sell sell){
		return sellMapper.updateByPrimaryKeySelective(sell);
	}
	public int updateByPrimaryKey(Sell sell){
		return sellMapper.updateByPrimaryKey(sell);
	}


}
