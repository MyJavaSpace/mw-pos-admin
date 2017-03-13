package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("paymentdetailService")
public class PaymentdetailService implements IPaymentdetailService {
	@Resource
	private PaymentdetailMapper paymentdetailMapper;

	public int insert(PaymentdetailWithBLOBs paymentdetailWithBLOBs){
		return paymentdetailMapper.insert(paymentdetailWithBLOBs);
	}
	public int insertSelective(PaymentdetailWithBLOBs paymentdetailWithBLOBs){
		return paymentdetailMapper.insertSelective(paymentdetailWithBLOBs);
	}
	public int deleteByPrimaryKey(PaymentdetailKey paymentdetailKey){
		return paymentdetailMapper.deleteByPrimaryKey(paymentdetailKey);
	}
	public PaymentdetailWithBLOBs selectByPrimaryKey(PaymentdetailKey paymentdetailKey){
		return paymentdetailMapper.selectByPrimaryKey(paymentdetailKey);
	}
	public int updateByPrimaryKeySelective(PaymentdetailWithBLOBs paymentdetailWithBLOBs){
		return paymentdetailMapper.updateByPrimaryKeySelective(paymentdetailWithBLOBs);
	}
	public int updateByPrimaryKey(Paymentdetail paymentdetail){
		return paymentdetailMapper.updateByPrimaryKey(paymentdetail);
	}
	public int updateByPrimaryKeyWithBLOBs(PaymentdetailWithBLOBs paymentdetailWithBLOBs){
		return paymentdetailMapper.updateByPrimaryKeyWithBLOBs(paymentdetailWithBLOBs);
	}


}
