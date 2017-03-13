package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("SellorderService")
public class SellorderService implements ISellorderService {
	@Resource
	private SellorderMapper SellorderMapper;

	public int insert(Sellorder sellorder){
		return SellorderMapper.insert(sellorder);
	}
	public int insertSelective(Sellorder sellorder){
		return SellorderMapper.insertSelective(sellorder);
	}
	public int deleteByPrimaryKey(SellorderKey sellorderKey){
		return SellorderMapper.deleteByPrimaryKey(sellorderKey);
	}
	public Sellorder selectByPrimaryKey(SellorderKey sellorderKey){
		return SellorderMapper.selectByPrimaryKey(sellorderKey);
	}
	public int updateByPrimaryKey(Sellorder sellorder){
		return SellorderMapper.updateByPrimaryKey(sellorder);
	}
	public int updateByPrimaryKeySelective(Sellorder sellorder){
		return SellorderMapper.updateByPrimaryKeySelective(sellorder);
	}


}
