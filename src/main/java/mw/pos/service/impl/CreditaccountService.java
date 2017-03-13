package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("CreditaccountService")
public class CreditaccountService implements ICreditaccountService {
	@Resource
	private CreditaccountMapper CreditaccountMapper;

	public int insert(Creditaccount creditaccount){
		return CreditaccountMapper.insert(creditaccount);
	}
	public int insertSelective(Creditaccount creditaccount){
		return CreditaccountMapper.insertSelective(creditaccount);
	}
	public int deleteByPrimaryKey(CreditaccountKey creditaccountKey){
		return CreditaccountMapper.deleteByPrimaryKey(creditaccountKey);
	}
	public Creditaccount selectByPrimaryKey(CreditaccountKey creditaccountKey){
		return CreditaccountMapper.selectByPrimaryKey(creditaccountKey);
	}
	public int updateByPrimaryKey(Creditaccount creditaccount){
		return CreditaccountMapper.updateByPrimaryKey(creditaccount);
	}
	public int updateByPrimaryKeySelective(Creditaccount creditaccount){
		return CreditaccountMapper.updateByPrimaryKeySelective(creditaccount);
	}


}
