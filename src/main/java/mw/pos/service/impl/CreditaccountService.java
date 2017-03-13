package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("creditaccountService")
public class CreditaccountService implements ICreditaccountService {
	@Resource
	private CreditaccountMapper creditaccountMapper;

	public int insert(Creditaccount creditaccount){
		return creditaccountMapper.insert(creditaccount);
	}
	public int insertSelective(Creditaccount creditaccount){
		return creditaccountMapper.insertSelective(creditaccount);
	}
	public int deleteByPrimaryKey(CreditaccountKey creditaccountKey){
		return creditaccountMapper.deleteByPrimaryKey(creditaccountKey);
	}
	public Creditaccount selectByPrimaryKey(CreditaccountKey creditaccountKey){
		return creditaccountMapper.selectByPrimaryKey(creditaccountKey);
	}
	public int updateByPrimaryKeySelective(Creditaccount creditaccount){
		return creditaccountMapper.updateByPrimaryKeySelective(creditaccount);
	}
	public int updateByPrimaryKey(Creditaccount creditaccount){
		return creditaccountMapper.updateByPrimaryKey(creditaccount);
	}


}
