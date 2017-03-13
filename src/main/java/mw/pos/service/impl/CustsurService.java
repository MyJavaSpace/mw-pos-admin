package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("custsurService")
public class CustsurService implements ICustsurService {
	@Resource
	private custsurMapper custsurMapper;

	public int insert(custsur custsur){
		return custsurMapper.insert(custsur);
	}
	public int insertSelective(custsur custsur){
		return custsurMapper.insertSelective(custsur);
	}
	public custsur selectByPrimaryKey(custsurKey custsurKey){
		return custsurMapper.selectByPrimaryKey(custsurKey);
	}
	public int deleteByPrimaryKey(custsurKey custsurKey){
		return custsurMapper.deleteByPrimaryKey(custsurKey);
	}
	public int updateByPrimaryKeySelective(custsur custsur){
		return custsurMapper.updateByPrimaryKeySelective(custsur);
	}
	public int updateByPrimaryKey(custsur custsur){
		return custsurMapper.updateByPrimaryKey(custsur);
	}


}
