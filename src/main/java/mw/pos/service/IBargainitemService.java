package mw.pos.service;

import com.pos.entity.*;

public interface IBargainitemService {
	int insert(Bargainitem bargainitem);
	int deleteByPrimaryKey(BargainitemKey bargainitemKey);
	int updateByPrimaryKey(Bargainitem bargainitem);
	Bargainitem selectByPrimaryKey(BargainitemKey bargainitemKey);
	int insertSelective(Bargainitem bargainitem);
	int updateByPrimaryKeySelective(Bargainitem bargainitem);

}
