package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("creditaccountService")
public class CreditaccountService implements ICreditaccountService {
	@Resource
	private creditaccountMapper creditaccountMapper;

	public int insert(creditaccount creditaccount){
		return creditaccountMapper.insert(creditaccount);
	}
	public int insertSelective(creditaccount creditaccount){
		return creditaccountMapper.insertSelective(creditaccount);
	}
	public creditaccount selectByPrimaryKey(creditaccountKey creditaccountKey){
		return creditaccountMapper.selectByPrimaryKey(creditaccountKey);
	}
	public int deleteByPrimaryKey(creditaccountKey creditaccountKey){
		return creditaccountMapper.deleteByPrimaryKey(creditaccountKey);
	}
	public int updateByPrimaryKeySelective(creditaccount creditaccount){
		return creditaccountMapper.updateByPrimaryKeySelective(creditaccount);
	}
	public int updateByPrimaryKey(creditaccount creditaccount){
		return creditaccountMapper.updateByPrimaryKey(creditaccount);
	}


}
