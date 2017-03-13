package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("CustsurService")
public class CustsurService implements ICustsurService {
	@Resource
	private CustsurMapper CustsurMapper;

	public int insert(Custsur custsur){
		return CustsurMapper.insert(custsur);
	}
	public int insertSelective(Custsur custsur){
		return CustsurMapper.insertSelective(custsur);
	}
	public int deleteByPrimaryKey(CustsurKey custsurKey){
		return CustsurMapper.deleteByPrimaryKey(custsurKey);
	}
	public Custsur selectByPrimaryKey(CustsurKey custsurKey){
		return CustsurMapper.selectByPrimaryKey(custsurKey);
	}
	public int updateByPrimaryKey(Custsur custsur){
		return CustsurMapper.updateByPrimaryKey(custsur);
	}
	public int updateByPrimaryKeySelective(Custsur custsur){
		return CustsurMapper.updateByPrimaryKeySelective(custsur);
	}


}
