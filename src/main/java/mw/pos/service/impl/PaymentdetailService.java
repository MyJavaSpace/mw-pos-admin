package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("paymentdetailService")
public class PaymentdetailService implements IPaymentdetailService {
	@Resource
	private paymentdetailMapper paymentdetailMapper;

	public int insert(paymentdetailWithBLOBs paymentdetailWithBLOBs){
		return paymentdetailMapper.insert(paymentdetailWithBLOBs);
	}
	public int insertSelective(paymentdetailWithBLOBs paymentdetailWithBLOBs){
		return paymentdetailMapper.insertSelective(paymentdetailWithBLOBs);
	}
	public paymentdetailWithBLOBs selectByPrimaryKey(paymentdetailKey paymentdetailKey){
		return paymentdetailMapper.selectByPrimaryKey(paymentdetailKey);
	}
	public int deleteByPrimaryKey(paymentdetailKey paymentdetailKey){
		return paymentdetailMapper.deleteByPrimaryKey(paymentdetailKey);
	}
	public int updateByPrimaryKeySelective(paymentdetailWithBLOBs paymentdetailWithBLOBs){
		return paymentdetailMapper.updateByPrimaryKeySelective(paymentdetailWithBLOBs);
	}
	public int updateByPrimaryKey(paymentdetail paymentdetail){
		return paymentdetailMapper.updateByPrimaryKey(paymentdetail);
	}
	public int updateByPrimaryKeyWithBLOBs(paymentdetailWithBLOBs paymentdetailWithBLOBs){
		return paymentdetailMapper.updateByPrimaryKeyWithBLOBs(paymentdetailWithBLOBs);
	}


}
