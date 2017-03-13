package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("PaymentfullcutService")
public class PaymentfullcutService implements IPaymentfullcutService {
	@Resource
	private PaymentfullcutMapper PaymentfullcutMapper;

	public int insert(Paymentfullcut paymentfullcut){
		return PaymentfullcutMapper.insert(paymentfullcut);
	}
	public int insertSelective(Paymentfullcut paymentfullcut){
		return PaymentfullcutMapper.insertSelective(paymentfullcut);
	}
	public int deleteByPrimaryKey(PaymentfullcutKey paymentfullcutKey){
		return PaymentfullcutMapper.deleteByPrimaryKey(paymentfullcutKey);
	}
	public Paymentfullcut selectByPrimaryKey(PaymentfullcutKey paymentfullcutKey){
		return PaymentfullcutMapper.selectByPrimaryKey(paymentfullcutKey);
	}
	public int updateByPrimaryKey(Paymentfullcut paymentfullcut){
		return PaymentfullcutMapper.updateByPrimaryKey(paymentfullcut);
	}
	public int updateByPrimaryKeySelective(Paymentfullcut paymentfullcut){
		return PaymentfullcutMapper.updateByPrimaryKeySelective(paymentfullcut);
	}


}
