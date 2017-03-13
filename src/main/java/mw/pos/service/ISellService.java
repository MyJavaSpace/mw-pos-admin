package mw.pos.service;

import com.pos.entity.*;

public interface ISellService {
	int insert(sell sell);
	sell selectByPrimaryKey(sellKey sellKey);
	int updateByPrimaryKeySelective(sell sell);
	int deleteByPrimaryKey(sellKey sellKey);
	int updateByPrimaryKey(sell sell);
	int insertSelective(sell sell);

}
