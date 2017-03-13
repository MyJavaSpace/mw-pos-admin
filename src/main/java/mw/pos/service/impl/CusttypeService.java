package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("CusttypeService")
public class CusttypeService implements ICusttypeService {
	@Resource
	private CusttypeMapper CusttypeMapper;

	public int insert(Custtype custtype){
		return CusttypeMapper.insert(custtype);
	}
	public int insertSelective(Custtype custtype){
		return CusttypeMapper.insertSelective(custtype);
	}
	public int deleteByPrimaryKey(CusttypeKey custtypeKey){
		return CusttypeMapper.deleteByPrimaryKey(custtypeKey);
	}
	public Custtype selectByPrimaryKey(CusttypeKey custtypeKey){
		return CusttypeMapper.selectByPrimaryKey(custtypeKey);
	}
	public int updateByPrimaryKey(Custtype custtype){
		return CusttypeMapper.updateByPrimaryKey(custtype);
	}
	public int updateByPrimaryKeySelective(Custtype custtype){
		return CusttypeMapper.updateByPrimaryKeySelective(custtype);
	}


}
