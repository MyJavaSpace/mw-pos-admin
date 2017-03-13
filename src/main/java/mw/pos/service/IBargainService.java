package mw.pos.service;

import com.pos.entity.*;

public interface IBargainService {
	int insert(bargain bargain);
	bargain selectByPrimaryKey(bargainKey bargainKey);
	int updateByPrimaryKeySelective(bargain bargain);
	int deleteByPrimaryKey(bargainKey bargainKey);
	int updateByPrimaryKey(bargain bargain);
	int insertSelective(bargain bargain);

}
