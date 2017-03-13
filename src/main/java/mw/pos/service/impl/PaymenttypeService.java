package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("PaymenttypeService")
public class PaymenttypeService implements IPaymenttypeService {
	@Resource
	private PaymenttypeMapper PaymenttypeMapper;

	public int insert(Paymenttype paymenttype){
		return PaymenttypeMapper.insert(paymenttype);
	}
	public int insertSelective(Paymenttype paymenttype){
		return PaymenttypeMapper.insertSelective(paymenttype);
	}
	public int deleteByPrimaryKey(PaymenttypeKey paymenttypeKey){
		return PaymenttypeMapper.deleteByPrimaryKey(paymenttypeKey);
	}
	public Paymenttype selectByPrimaryKey(PaymenttypeKey paymenttypeKey){
		return PaymenttypeMapper.selectByPrimaryKey(paymenttypeKey);
	}
	public int updateByPrimaryKey(Paymenttype paymenttype){
		return PaymenttypeMapper.updateByPrimaryKey(paymenttype);
	}
	public int updateByPrimaryKeySelective(Paymenttype paymenttype){
		return PaymenttypeMapper.updateByPrimaryKeySelective(paymenttype);
	}


}
