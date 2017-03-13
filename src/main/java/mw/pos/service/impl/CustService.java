package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("custService")
public class CustService implements ICustService {
	@Resource
	private CustMapper custMapper;

	public int insert(Cust cust){
		return custMapper.insert(cust);
	}
	public int insertSelective(Cust cust){
		return custMapper.insertSelective(cust);
	}
	public int deleteByPrimaryKey(String string){
		return custMapper.deleteByPrimaryKey(string);
	}
	public Cust selectByPrimaryKey(String string){
		return custMapper.selectByPrimaryKey(string);
	}
	public int updateByPrimaryKeySelective(Cust cust){
		return custMapper.updateByPrimaryKeySelective(cust);
	}
	public int updateByPrimaryKey(Cust cust){
		return custMapper.updateByPrimaryKey(cust);
	}


}
