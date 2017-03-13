package mw.pos.service;

import com.pos.entity.*;

public interface ISellorderitemService {
	int insert(SellorderitemWithBLOBs sellorderitemWithBLOBs);
	int updateByPrimaryKeyWithBLOBs(SellorderitemWithBLOBs sellorderitemWithBLOBs);
	int deleteByPrimaryKey(SellorderitemKey sellorderitemKey);
	int updateByPrimaryKey(Sellorderitem sellorderitem);
	SellorderitemWithBLOBs selectByPrimaryKey(SellorderitemKey sellorderitemKey);
	int insertSelective(SellorderitemWithBLOBs sellorderitemWithBLOBs);
	int updateByPrimaryKeySelective(SellorderitemWithBLOBs sellorderitemWithBLOBs);

}
