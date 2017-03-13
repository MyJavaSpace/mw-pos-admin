package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("PaymentService")
public class PaymentService implements IPaymentService {
	@Resource
	private PaymentMapper PaymentMapper;

	public int insert(Payment payment){
		return PaymentMapper.insert(payment);
	}
	public int insertSelective(Payment payment){
		return PaymentMapper.insertSelective(payment);
	}
	public int deleteByPrimaryKey(PaymentKey paymentKey){
		return PaymentMapper.deleteByPrimaryKey(paymentKey);
	}
	public Payment selectByPrimaryKey(PaymentKey paymentKey){
		return PaymentMapper.selectByPrimaryKey(paymentKey);
	}
	public int updateByPrimaryKey(Payment payment){
		return PaymentMapper.updateByPrimaryKey(payment);
	}
	public int updateByPrimaryKeySelective(Payment payment){
		return PaymentMapper.updateByPrimaryKeySelective(payment);
	}


}
