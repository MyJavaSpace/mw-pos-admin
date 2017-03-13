package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("paymentService")
public class PaymentService implements IPaymentService {
	@Resource
	private PaymentMapper paymentMapper;

	public int insert(Payment payment){
		return paymentMapper.insert(payment);
	}
	public int insertSelective(Payment payment){
		return paymentMapper.insertSelective(payment);
	}
	public int deleteByPrimaryKey(PaymentKey paymentKey){
		return paymentMapper.deleteByPrimaryKey(paymentKey);
	}
	public Payment selectByPrimaryKey(PaymentKey paymentKey){
		return paymentMapper.selectByPrimaryKey(paymentKey);
	}
	public int updateByPrimaryKeySelective(Payment payment){
		return paymentMapper.updateByPrimaryKeySelective(payment);
	}
	public int updateByPrimaryKey(Payment payment){
		return paymentMapper.updateByPrimaryKey(payment);
	}


}
