package mw.pos.service;

import com.pos.entity.*;

public interface IPaymentService {
	int insert(payment payment);
	payment selectByPrimaryKey(paymentKey paymentKey);
	int updateByPrimaryKeySelective(payment payment);
	int deleteByPrimaryKey(paymentKey paymentKey);
	int updateByPrimaryKey(payment payment);
	int insertSelective(payment payment);

}
