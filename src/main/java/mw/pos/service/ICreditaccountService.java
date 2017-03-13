package mw.pos.service;

import com.pos.entity.*;

public interface ICreditaccountService {
	int insert(creditaccount creditaccount);
	creditaccount selectByPrimaryKey(creditaccountKey creditaccountKey);
	int updateByPrimaryKeySelective(creditaccount creditaccount);
	int deleteByPrimaryKey(creditaccountKey creditaccountKey);
	int updateByPrimaryKey(creditaccount creditaccount);
	int insertSelective(creditaccount creditaccount);

}
