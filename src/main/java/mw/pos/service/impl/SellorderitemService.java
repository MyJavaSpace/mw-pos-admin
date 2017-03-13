package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("sellorderitemService")
public class SellorderitemService implements ISellorderitemService {
	@Resource
	private SellorderitemMapper sellorderitemMapper;

	public int insert(SellorderitemWithBLOBs sellorderitemWithBLOBs){
		return sellorderitemMapper.insert(sellorderitemWithBLOBs);
	}
	public int insertSelective(SellorderitemWithBLOBs sellorderitemWithBLOBs){
		return sellorderitemMapper.insertSelective(sellorderitemWithBLOBs);
	}
	public int deleteByPrimaryKey(SellorderitemKey sellorderitemKey){
		return sellorderitemMapper.deleteByPrimaryKey(sellorderitemKey);
	}
	public SellorderitemWithBLOBs selectByPrimaryKey(SellorderitemKey sellorderitemKey){
		return sellorderitemMapper.selectByPrimaryKey(sellorderitemKey);
	}
	public int updateByPrimaryKeySelective(SellorderitemWithBLOBs sellorderitemWithBLOBs){
		return sellorderitemMapper.updateByPrimaryKeySelective(sellorderitemWithBLOBs);
	}
	public int updateByPrimaryKey(Sellorderitem sellorderitem){
		return sellorderitemMapper.updateByPrimaryKey(sellorderitem);
	}
	public int updateByPrimaryKeyWithBLOBs(SellorderitemWithBLOBs sellorderitemWithBLOBs){
		return sellorderitemMapper.updateByPrimaryKeyWithBLOBs(sellorderitemWithBLOBs);
	}


}
