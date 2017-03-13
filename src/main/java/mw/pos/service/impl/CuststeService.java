package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("CuststeService")
public class CuststeService implements ICuststeService {
	@Resource
	private CuststeMapper CuststeMapper;

	public int insert(Custste custste){
		return CuststeMapper.insert(custste);
	}
	public int insertSelective(Custste custste){
		return CuststeMapper.insertSelective(custste);
	}
	public int deleteByPrimaryKey(CuststeKey custsteKey){
		return CuststeMapper.deleteByPrimaryKey(custsteKey);
	}
	public Custste selectByPrimaryKey(CuststeKey custsteKey){
		return CuststeMapper.selectByPrimaryKey(custsteKey);
	}
	public int updateByPrimaryKey(Custste custste){
		return CuststeMapper.updateByPrimaryKey(custste);
	}
	public int updateByPrimaryKeySelective(Custste custste){
		return CuststeMapper.updateByPrimaryKeySelective(custste);
	}


}
