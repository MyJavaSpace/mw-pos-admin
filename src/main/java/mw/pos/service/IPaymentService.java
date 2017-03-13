package mw.pos.service;

import com.pos.entity.*;

public interface IPaymentService {
	int insert(Payment payment);
	int deleteByPrimaryKey(PaymentKey paymentKey);
	int updateByPrimaryKey(Payment payment);
	Payment selectByPrimaryKey(PaymentKey paymentKey);
	int insertSelective(Payment payment);
	int updateByPrimaryKeySelective(Payment payment);

}
