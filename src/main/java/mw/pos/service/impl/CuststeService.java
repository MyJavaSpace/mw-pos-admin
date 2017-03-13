package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("custsteService")
public class CuststeService implements ICuststeService {
	@Resource
	private custsteMapper custsteMapper;

	public int insert(custste custste){
		return custsteMapper.insert(custste);
	}
	public int insertSelective(custste custste){
		return custsteMapper.insertSelective(custste);
	}
	public custste selectByPrimaryKey(custsteKey custsteKey){
		return custsteMapper.selectByPrimaryKey(custsteKey);
	}
	public int deleteByPrimaryKey(custsteKey custsteKey){
		return custsteMapper.deleteByPrimaryKey(custsteKey);
	}
	public int updateByPrimaryKeySelective(custste custste){
		return custsteMapper.updateByPrimaryKeySelective(custste);
	}
	public int updateByPrimaryKey(custste custste){
		return custsteMapper.updateByPrimaryKey(custste);
	}


}
