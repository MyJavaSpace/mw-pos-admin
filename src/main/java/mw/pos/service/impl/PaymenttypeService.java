package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("paymenttypeService")
public class PaymenttypeService implements IPaymenttypeService {
	@Resource
	private paymenttypeMapper paymenttypeMapper;

	public int insert(paymenttype paymenttype){
		return paymenttypeMapper.insert(paymenttype);
	}
	public int insertSelective(paymenttype paymenttype){
		return paymenttypeMapper.insertSelective(paymenttype);
	}
	public paymenttype selectByPrimaryKey(paymenttypeKey paymenttypeKey){
		return paymenttypeMapper.selectByPrimaryKey(paymenttypeKey);
	}
	public int deleteByPrimaryKey(paymenttypeKey paymenttypeKey){
		return paymenttypeMapper.deleteByPrimaryKey(paymenttypeKey);
	}
	public int updateByPrimaryKeySelective(paymenttype paymenttype){
		return paymenttypeMapper.updateByPrimaryKeySelective(paymenttype);
	}
	public int updateByPrimaryKey(paymenttype paymenttype){
		return paymenttypeMapper.updateByPrimaryKey(paymenttype);
	}


}
