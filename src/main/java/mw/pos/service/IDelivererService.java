package mw.pos.service;

import com.pos.entity.*;

public interface IDelivererService {
	int insert(Deliverer deliverer);
	int deleteByPrimaryKey(DelivererKey delivererKey);
	int updateByPrimaryKey(Deliverer deliverer);
	Deliverer selectByPrimaryKey(DelivererKey delivererKey);
	int insertSelective(Deliverer deliverer);
	int updateByPrimaryKeySelective(Deliverer deliverer);

}
