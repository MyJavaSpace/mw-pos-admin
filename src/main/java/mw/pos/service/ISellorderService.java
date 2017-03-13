package mw.pos.service;

import com.pos.entity.*;

public interface ISellorderService {
	int insert(sellorder sellorder);
	sellorder selectByPrimaryKey(sellorderKey sellorderKey);
	int updateByPrimaryKeySelective(sellorder sellorder);
	int deleteByPrimaryKey(sellorderKey sellorderKey);
	int updateByPrimaryKey(sellorder sellorder);
	int insertSelective(sellorder sellorder);

}
