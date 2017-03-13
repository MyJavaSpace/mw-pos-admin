package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("sellorderService")
public class SellorderService implements ISellorderService {
	@Resource
	private SellorderMapper sellorderMapper;

	public int insert(Sellorder sellorder){
		return sellorderMapper.insert(sellorder);
	}
	public int insertSelective(Sellorder sellorder){
		return sellorderMapper.insertSelective(sellorder);
	}
	public int deleteByPrimaryKey(SellorderKey sellorderKey){
		return sellorderMapper.deleteByPrimaryKey(sellorderKey);
	}
	public Sellorder selectByPrimaryKey(SellorderKey sellorderKey){
		return sellorderMapper.selectByPrimaryKey(sellorderKey);
	}
	public int updateByPrimaryKeySelective(Sellorder sellorder){
		return sellorderMapper.updateByPrimaryKeySelective(sellorder);
	}
	public int updateByPrimaryKey(Sellorder sellorder){
		return sellorderMapper.updateByPrimaryKey(sellorder);
	}


}
