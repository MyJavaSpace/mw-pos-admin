package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("custService")
public class CustService implements ICustService {
	@Resource
	private custMapper custMapper;

	public int insert(cust cust){
		return custMapper.insert(cust);
	}
	public int insertSelective(cust cust){
		return custMapper.insertSelective(cust);
	}
	public cust selectByPrimaryKey(String string){
		return custMapper.selectByPrimaryKey(string);
	}
	public int deleteByPrimaryKey(String string){
		return custMapper.deleteByPrimaryKey(string);
	}
	public int updateByPrimaryKeySelective(cust cust){
		return custMapper.updateByPrimaryKeySelective(cust);
	}
	public int updateByPrimaryKey(cust cust){
		return custMapper.updateByPrimaryKey(cust);
	}


}
