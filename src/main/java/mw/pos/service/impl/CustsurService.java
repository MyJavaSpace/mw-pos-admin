package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("custsurService")
public class CustsurService implements ICustsurService {
	@Resource
	private CustsurMapper custsurMapper;

	public int insert(Custsur custsur){
		return custsurMapper.insert(custsur);
	}
	public int insertSelective(Custsur custsur){
		return custsurMapper.insertSelective(custsur);
	}
	public int deleteByPrimaryKey(CustsurKey custsurKey){
		return custsurMapper.deleteByPrimaryKey(custsurKey);
	}
	public Custsur selectByPrimaryKey(CustsurKey custsurKey){
		return custsurMapper.selectByPrimaryKey(custsurKey);
	}
	public int updateByPrimaryKeySelective(Custsur custsur){
		return custsurMapper.updateByPrimaryKeySelective(custsur);
	}
	public int updateByPrimaryKey(Custsur custsur){
		return custsurMapper.updateByPrimaryKey(custsur);
	}


}
