package mw.pos.service;

import com.pos.entity.*;

public interface IDelivererService {
	int insert(deliverer deliverer);
	deliverer selectByPrimaryKey(delivererKey delivererKey);
	int updateByPrimaryKeySelective(deliverer deliverer);
	int deleteByPrimaryKey(delivererKey delivererKey);
	int updateByPrimaryKey(deliverer deliverer);
	int insertSelective(deliverer deliverer);

}
