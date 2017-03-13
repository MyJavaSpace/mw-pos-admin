package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("CustService")
public class CustService implements ICustService {
	@Resource
	private CustMapper CustMapper;

	public int insert(Cust cust){
		return CustMapper.insert(cust);
	}
	public int insertSelective(Cust cust){
		return CustMapper.insertSelective(cust);
	}
	public int deleteByPrimaryKey(String string){
		return CustMapper.deleteByPrimaryKey(string);
	}
	public Cust selectByPrimaryKey(String string){
		return CustMapper.selectByPrimaryKey(string);
	}
	public int updateByPrimaryKey(Cust cust){
		return CustMapper.updateByPrimaryKey(cust);
	}
	public int updateByPrimaryKeySelective(Cust cust){
		return CustMapper.updateByPrimaryKeySelective(cust);
	}


}
