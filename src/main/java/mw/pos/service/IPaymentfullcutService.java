package mw.pos.service;

import com.pos.entity.*;

public interface IPaymentfullcutService {
	int insert(Paymentfullcut paymentfullcut);
	int deleteByPrimaryKey(PaymentfullcutKey paymentfullcutKey);
	int updateByPrimaryKey(Paymentfullcut paymentfullcut);
	Paymentfullcut selectByPrimaryKey(PaymentfullcutKey paymentfullcutKey);
	int insertSelective(Paymentfullcut paymentfullcut);
	int updateByPrimaryKeySelective(Paymentfullcut paymentfullcut);

}
