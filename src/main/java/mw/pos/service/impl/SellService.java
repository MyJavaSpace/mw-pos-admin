package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("sellService")
public class SellService implements ISellService {
	@Resource
	private sellMapper sellMapper;

	public int insert(sell sell){
		return sellMapper.insert(sell);
	}
	public int insertSelective(sell sell){
		return sellMapper.insertSelective(sell);
	}
	public sell selectByPrimaryKey(sellKey sellKey){
		return sellMapper.selectByPrimaryKey(sellKey);
	}
	public int deleteByPrimaryKey(sellKey sellKey){
		return sellMapper.deleteByPrimaryKey(sellKey);
	}
	public int updateByPrimaryKeySelective(sell sell){
		return sellMapper.updateByPrimaryKeySelective(sell);
	}
	public int updateByPrimaryKey(sell sell){
		return sellMapper.updateByPrimaryKey(sell);
	}


}
