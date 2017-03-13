package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("custtypeService")
public class CusttypeService implements ICusttypeService {
	@Resource
	private custtypeMapper custtypeMapper;

	public int insert(custtype custtype){
		return custtypeMapper.insert(custtype);
	}
	public int insertSelective(custtype custtype){
		return custtypeMapper.insertSelective(custtype);
	}
	public custtype selectByPrimaryKey(custtypeKey custtypeKey){
		return custtypeMapper.selectByPrimaryKey(custtypeKey);
	}
	public int deleteByPrimaryKey(custtypeKey custtypeKey){
		return custtypeMapper.deleteByPrimaryKey(custtypeKey);
	}
	public int updateByPrimaryKeySelective(custtype custtype){
		return custtypeMapper.updateByPrimaryKeySelective(custtype);
	}
	public int updateByPrimaryKey(custtype custtype){
		return custtypeMapper.updateByPrimaryKey(custtype);
	}


}
