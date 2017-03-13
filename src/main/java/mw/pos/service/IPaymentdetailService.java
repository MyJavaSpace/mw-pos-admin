package mw.pos.service;

import com.pos.entity.*;

public interface IPaymentdetailService {
	int insert(paymentdetailWithBLOBs paymentdetailWithBLOBs);
	paymentdetailWithBLOBs selectByPrimaryKey(paymentdetailKey paymentdetailKey);
	int updateByPrimaryKeySelective(paymentdetailWithBLOBs paymentdetailWithBLOBs);
	int deleteByPrimaryKey(paymentdetailKey paymentdetailKey);
	int updateByPrimaryKey(paymentdetail paymentdetail);
	int insertSelective(paymentdetailWithBLOBs paymentdetailWithBLOBs);
	int updateByPrimaryKeyWithBLOBs(paymentdetailWithBLOBs paymentdetailWithBLOBs);

}
