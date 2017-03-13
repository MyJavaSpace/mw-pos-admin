package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("paymentfullcutService")
public class PaymentfullcutService implements IPaymentfullcutService {
	@Resource
	private paymentfullcutMapper paymentfullcutMapper;

	public int insert(paymentfullcut paymentfullcut){
		return paymentfullcutMapper.insert(paymentfullcut);
	}
	public int insertSelective(paymentfullcut paymentfullcut){
		return paymentfullcutMapper.insertSelective(paymentfullcut);
	}
	public paymentfullcut selectByPrimaryKey(paymentfullcutKey paymentfullcutKey){
		return paymentfullcutMapper.selectByPrimaryKey(paymentfullcutKey);
	}
	public int deleteByPrimaryKey(paymentfullcutKey paymentfullcutKey){
		return paymentfullcutMapper.deleteByPrimaryKey(paymentfullcutKey);
	}
	public int updateByPrimaryKeySelective(paymentfullcut paymentfullcut){
		return paymentfullcutMapper.updateByPrimaryKeySelective(paymentfullcut);
	}
	public int updateByPrimaryKey(paymentfullcut paymentfullcut){
		return paymentfullcutMapper.updateByPrimaryKey(paymentfullcut);
	}


}
