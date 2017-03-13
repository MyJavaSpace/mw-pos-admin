package mw.pos.service;

import com.pos.entity.*;

public interface ISellorderitemService {
	int insert(sellorderitemWithBLOBs sellorderitemWithBLOBs);
	sellorderitemWithBLOBs selectByPrimaryKey(sellorderitemKey sellorderitemKey);
	int updateByPrimaryKeySelective(sellorderitemWithBLOBs sellorderitemWithBLOBs);
	int deleteByPrimaryKey(sellorderitemKey sellorderitemKey);
	int updateByPrimaryKey(sellorderitem sellorderitem);
	int insertSelective(sellorderitemWithBLOBs sellorderitemWithBLOBs);
	int updateByPrimaryKeyWithBLOBs(sellorderitemWithBLOBs sellorderitemWithBLOBs);

}
