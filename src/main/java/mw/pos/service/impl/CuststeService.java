package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("custsteService")
public class CuststeService implements ICuststeService {
	@Resource
	private CuststeMapper custsteMapper;

	public int insert(Custste custste){
		return custsteMapper.insert(custste);
	}
	public int insertSelective(Custste custste){
		return custsteMapper.insertSelective(custste);
	}
	public int deleteByPrimaryKey(CuststeKey custsteKey){
		return custsteMapper.deleteByPrimaryKey(custsteKey);
	}
	public Custste selectByPrimaryKey(CuststeKey custsteKey){
		return custsteMapper.selectByPrimaryKey(custsteKey);
	}
	public int updateByPrimaryKeySelective(Custste custste){
		return custsteMapper.updateByPrimaryKeySelective(custste);
	}
	public int updateByPrimaryKey(Custste custste){
		return custsteMapper.updateByPrimaryKey(custste);
	}


}
