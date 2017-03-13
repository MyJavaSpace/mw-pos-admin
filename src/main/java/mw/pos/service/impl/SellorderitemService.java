package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("sellorderitemService")
public class SellorderitemService implements ISellorderitemService {
	@Resource
	private sellorderitemMapper sellorderitemMapper;

	public int insert(sellorderitemWithBLOBs sellorderitemWithBLOBs){
		return sellorderitemMapper.insert(sellorderitemWithBLOBs);
	}
	public int insertSelective(sellorderitemWithBLOBs sellorderitemWithBLOBs){
		return sellorderitemMapper.insertSelective(sellorderitemWithBLOBs);
	}
	public sellorderitemWithBLOBs selectByPrimaryKey(sellorderitemKey sellorderitemKey){
		return sellorderitemMapper.selectByPrimaryKey(sellorderitemKey);
	}
	public int deleteByPrimaryKey(sellorderitemKey sellorderitemKey){
		return sellorderitemMapper.deleteByPrimaryKey(sellorderitemKey);
	}
	public int updateByPrimaryKeySelective(sellorderitemWithBLOBs sellorderitemWithBLOBs){
		return sellorderitemMapper.updateByPrimaryKeySelective(sellorderitemWithBLOBs);
	}
	public int updateByPrimaryKey(sellorderitem sellorderitem){
		return sellorderitemMapper.updateByPrimaryKey(sellorderitem);
	}
	public int updateByPrimaryKeyWithBLOBs(sellorderitemWithBLOBs sellorderitemWithBLOBs){
		return sellorderitemMapper.updateByPrimaryKeyWithBLOBs(sellorderitemWithBLOBs);
	}


}
