package mw.pos.service;

import com.pos.entity.*;

public interface IPaymenttypeService {
	int insert(Paymenttype paymenttype);
	int deleteByPrimaryKey(PaymenttypeKey paymenttypeKey);
	int updateByPrimaryKey(Paymenttype paymenttype);
	Paymenttype selectByPrimaryKey(PaymenttypeKey paymenttypeKey);
	int insertSelective(Paymenttype paymenttype);
	int updateByPrimaryKeySelective(Paymenttype paymenttype);

}
