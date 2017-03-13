package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("paymenttypeService")
public class PaymenttypeService implements IPaymenttypeService {
	@Resource
	private PaymenttypeMapper paymenttypeMapper;

	public int insert(Paymenttype paymenttype){
		return paymenttypeMapper.insert(paymenttype);
	}
	public int insertSelective(Paymenttype paymenttype){
		return paymenttypeMapper.insertSelective(paymenttype);
	}
	public int deleteByPrimaryKey(PaymenttypeKey paymenttypeKey){
		return paymenttypeMapper.deleteByPrimaryKey(paymenttypeKey);
	}
	public Paymenttype selectByPrimaryKey(PaymenttypeKey paymenttypeKey){
		return paymenttypeMapper.selectByPrimaryKey(paymenttypeKey);
	}
	public int updateByPrimaryKeySelective(Paymenttype paymenttype){
		return paymenttypeMapper.updateByPrimaryKeySelective(paymenttype);
	}
	public int updateByPrimaryKey(Paymenttype paymenttype){
		return paymenttypeMapper.updateByPrimaryKey(paymenttype);
	}


}
