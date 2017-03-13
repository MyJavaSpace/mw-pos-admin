package mw.pos.service;

import com.pos.entity.*;

public interface ISellcheckService {
	int insert(sellcheck sellcheck);
	sellcheck selectByPrimaryKey(sellcheckKey sellcheckKey);
	int updateByPrimaryKeySelective(sellcheck sellcheck);
	int deleteByPrimaryKey(sellcheckKey sellcheckKey);
	int updateByPrimaryKey(sellcheck sellcheck);
	int insertSelective(sellcheck sellcheck);

}
