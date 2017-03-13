package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("paymentfullcutService")
public class PaymentfullcutService implements IPaymentfullcutService {
	@Resource
	private PaymentfullcutMapper paymentfullcutMapper;

	public int insert(Paymentfullcut paymentfullcut){
		return paymentfullcutMapper.insert(paymentfullcut);
	}
	public int insertSelective(Paymentfullcut paymentfullcut){
		return paymentfullcutMapper.insertSelective(paymentfullcut);
	}
	public int deleteByPrimaryKey(PaymentfullcutKey paymentfullcutKey){
		return paymentfullcutMapper.deleteByPrimaryKey(paymentfullcutKey);
	}
	public Paymentfullcut selectByPrimaryKey(PaymentfullcutKey paymentfullcutKey){
		return paymentfullcutMapper.selectByPrimaryKey(paymentfullcutKey);
	}
	public int updateByPrimaryKeySelective(Paymentfullcut paymentfullcut){
		return paymentfullcutMapper.updateByPrimaryKeySelective(paymentfullcut);
	}
	public int updateByPrimaryKey(Paymentfullcut paymentfullcut){
		return paymentfullcutMapper.updateByPrimaryKey(paymentfullcut);
	}


}
