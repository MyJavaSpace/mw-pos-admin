package mw.pos.service;

import com.pos.entity.*;

public interface IPaymenttypeService {
	int insert(paymenttype paymenttype);
	paymenttype selectByPrimaryKey(paymenttypeKey paymenttypeKey);
	int updateByPrimaryKeySelective(paymenttype paymenttype);
	int deleteByPrimaryKey(paymenttypeKey paymenttypeKey);
	int updateByPrimaryKey(paymenttype paymenttype);
	int insertSelective(paymenttype paymenttype);

}
