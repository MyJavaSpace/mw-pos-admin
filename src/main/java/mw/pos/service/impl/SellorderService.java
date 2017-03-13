package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("sellorderService")
public class SellorderService implements ISellorderService {
	@Resource
	private sellorderMapper sellorderMapper;

	public int insert(sellorder sellorder){
		return sellorderMapper.insert(sellorder);
	}
	public int insertSelective(sellorder sellorder){
		return sellorderMapper.insertSelective(sellorder);
	}
	public sellorder selectByPrimaryKey(sellorderKey sellorderKey){
		return sellorderMapper.selectByPrimaryKey(sellorderKey);
	}
	public int deleteByPrimaryKey(sellorderKey sellorderKey){
		return sellorderMapper.deleteByPrimaryKey(sellorderKey);
	}
	public int updateByPrimaryKeySelective(sellorder sellorder){
		return sellorderMapper.updateByPrimaryKeySelective(sellorder);
	}
	public int updateByPrimaryKey(sellorder sellorder){
		return sellorderMapper.updateByPrimaryKey(sellorder);
	}


}
