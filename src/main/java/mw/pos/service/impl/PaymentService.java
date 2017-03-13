package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("paymentService")
public class PaymentService implements IPaymentService {
	@Resource
	private paymentMapper paymentMapper;

	public int insert(payment payment){
		return paymentMapper.insert(payment);
	}
	public int insertSelective(payment payment){
		return paymentMapper.insertSelective(payment);
	}
	public payment selectByPrimaryKey(paymentKey paymentKey){
		return paymentMapper.selectByPrimaryKey(paymentKey);
	}
	public int deleteByPrimaryKey(paymentKey paymentKey){
		return paymentMapper.deleteByPrimaryKey(paymentKey);
	}
	public int updateByPrimaryKeySelective(payment payment){
		return paymentMapper.updateByPrimaryKeySelective(payment);
	}
	public int updateByPrimaryKey(payment payment){
		return paymentMapper.updateByPrimaryKey(payment);
	}


}
