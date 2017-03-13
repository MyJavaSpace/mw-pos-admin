package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("PaymentdetailService")
public class PaymentdetailService implements IPaymentdetailService {
	@Resource
	private PaymentdetailMapper PaymentdetailMapper;

	public int insert(PaymentdetailWithBLOBs paymentdetailWithBLOBs){
		return PaymentdetailMapper.insert(paymentdetailWithBLOBs);
	}
	public int insertSelective(PaymentdetailWithBLOBs paymentdetailWithBLOBs){
		return PaymentdetailMapper.insertSelective(paymentdetailWithBLOBs);
	}
	public int deleteByPrimaryKey(PaymentdetailKey paymentdetailKey){
		return PaymentdetailMapper.deleteByPrimaryKey(paymentdetailKey);
	}
	public PaymentdetailWithBLOBs selectByPrimaryKey(PaymentdetailKey paymentdetailKey){
		return PaymentdetailMapper.selectByPrimaryKey(paymentdetailKey);
	}
	public int updateByPrimaryKey(Paymentdetail paymentdetail){
		return PaymentdetailMapper.updateByPrimaryKey(paymentdetail);
	}
	public int updateByPrimaryKeySelective(PaymentdetailWithBLOBs paymentdetailWithBLOBs){
		return PaymentdetailMapper.updateByPrimaryKeySelective(paymentdetailWithBLOBs);
	}
	public int updateByPrimaryKeyWithBLOBs(PaymentdetailWithBLOBs paymentdetailWithBLOBs){
		return PaymentdetailMapper.updateByPrimaryKeyWithBLOBs(paymentdetailWithBLOBs);
	}


}
