package mw.pos.service;

import com.pos.entity.*;

public interface IBargainitemService {
	int insert(bargainitem bargainitem);
	bargainitem selectByPrimaryKey(bargainitemKey bargainitemKey);
	int updateByPrimaryKeySelective(bargainitem bargainitem);
	int deleteByPrimaryKey(bargainitemKey bargainitemKey);
	int updateByPrimaryKey(bargainitem bargainitem);
	int insertSelective(bargainitem bargainitem);

}
