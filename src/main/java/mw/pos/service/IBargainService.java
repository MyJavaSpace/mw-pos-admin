package mw.pos.service;

import com.pos.entity.*;

public interface IBargainService {
	int insert(Bargain bargain);
	int deleteByPrimaryKey(BargainKey bargainKey);
	int updateByPrimaryKey(Bargain bargain);
	Bargain selectByPrimaryKey(BargainKey bargainKey);
	int insertSelective(Bargain bargain);
	int updateByPrimaryKeySelective(Bargain bargain);

}
