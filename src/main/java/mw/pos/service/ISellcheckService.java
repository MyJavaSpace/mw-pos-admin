package mw.pos.service;

import com.pos.entity.*;

public interface ISellcheckService {
	int insert(Sellcheck sellcheck);
	int deleteByPrimaryKey(SellcheckKey sellcheckKey);
	int updateByPrimaryKey(Sellcheck sellcheck);
	Sellcheck selectByPrimaryKey(SellcheckKey sellcheckKey);
	int insertSelective(Sellcheck sellcheck);
	int updateByPrimaryKeySelective(Sellcheck sellcheck);

}
