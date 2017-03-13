package mw.pos.service;

import com.pos.entity.*;

public interface IPaymentfullcutService {
	int insert(paymentfullcut paymentfullcut);
	paymentfullcut selectByPrimaryKey(paymentfullcutKey paymentfullcutKey);
	int updateByPrimaryKeySelective(paymentfullcut paymentfullcut);
	int deleteByPrimaryKey(paymentfullcutKey paymentfullcutKey);
	int updateByPrimaryKey(paymentfullcut paymentfullcut);
	int insertSelective(paymentfullcut paymentfullcut);

}
