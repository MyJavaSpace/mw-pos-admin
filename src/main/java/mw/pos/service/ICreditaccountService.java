package mw.pos.service;

import com.pos.entity.*;

public interface ICreditaccountService {
	int insert(Creditaccount creditaccount);
	int deleteByPrimaryKey(CreditaccountKey creditaccountKey);
	int updateByPrimaryKey(Creditaccount creditaccount);
	Creditaccount selectByPrimaryKey(CreditaccountKey creditaccountKey);
	int insertSelective(Creditaccount creditaccount);
	int updateByPrimaryKeySelective(Creditaccount creditaccount);

}
