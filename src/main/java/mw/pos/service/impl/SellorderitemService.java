package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("SellorderitemService")
public class SellorderitemService implements ISellorderitemService {
	@Resource
	private SellorderitemMapper SellorderitemMapper;

	public int insert(SellorderitemWithBLOBs sellorderitemWithBLOBs){
		return SellorderitemMapper.insert(sellorderitemWithBLOBs);
	}
	public int insertSelective(SellorderitemWithBLOBs sellorderitemWithBLOBs){
		return SellorderitemMapper.insertSelective(sellorderitemWithBLOBs);
	}
	public int deleteByPrimaryKey(SellorderitemKey sellorderitemKey){
		return SellorderitemMapper.deleteByPrimaryKey(sellorderitemKey);
	}
	public SellorderitemWithBLOBs selectByPrimaryKey(SellorderitemKey sellorderitemKey){
		return SellorderitemMapper.selectByPrimaryKey(sellorderitemKey);
	}
	public int updateByPrimaryKey(Sellorderitem sellorderitem){
		return SellorderitemMapper.updateByPrimaryKey(sellorderitem);
	}
	public int updateByPrimaryKeySelective(SellorderitemWithBLOBs sellorderitemWithBLOBs){
		return SellorderitemMapper.updateByPrimaryKeySelective(sellorderitemWithBLOBs);
	}
	public int updateByPrimaryKeyWithBLOBs(SellorderitemWithBLOBs sellorderitemWithBLOBs){
		return SellorderitemMapper.updateByPrimaryKeyWithBLOBs(sellorderitemWithBLOBs);
	}


}
