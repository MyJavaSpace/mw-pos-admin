package mw.pos.service;

import com.pos.entity.*;

public interface IPaymentdetailService {
	int insert(PaymentdetailWithBLOBs paymentdetailWithBLOBs);
	int updateByPrimaryKeyWithBLOBs(PaymentdetailWithBLOBs paymentdetailWithBLOBs);
	int deleteByPrimaryKey(PaymentdetailKey paymentdetailKey);
	int updateByPrimaryKey(Paymentdetail paymentdetail);
	PaymentdetailWithBLOBs selectByPrimaryKey(PaymentdetailKey paymentdetailKey);
	int insertSelective(PaymentdetailWithBLOBs paymentdetailWithBLOBs);
	int updateByPrimaryKeySelective(PaymentdetailWithBLOBs paymentdetailWithBLOBs);

}
