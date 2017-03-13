package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("custtypeService")
public class CusttypeService implements ICusttypeService {
	@Resource
	private CusttypeMapper custtypeMapper;

	public int insert(Custtype custtype){
		return custtypeMapper.insert(custtype);
	}
	public int insertSelective(Custtype custtype){
		return custtypeMapper.insertSelective(custtype);
	}
	public int deleteByPrimaryKey(CusttypeKey custtypeKey){
		return custtypeMapper.deleteByPrimaryKey(custtypeKey);
	}
	public Custtype selectByPrimaryKey(CusttypeKey custtypeKey){
		return custtypeMapper.selectByPrimaryKey(custtypeKey);
	}
	public int updateByPrimaryKeySelective(Custtype custtype){
		return custtypeMapper.updateByPrimaryKeySelective(custtype);
	}
	public int updateByPrimaryKey(Custtype custtype){
		return custtypeMapper.updateByPrimaryKey(custtype);
	}


}
