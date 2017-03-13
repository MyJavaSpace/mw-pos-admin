package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("interfacemanageService")
public class InterfacemanageService implements IInterfacemanageService {
	@Resource
	private interfacemanageMapper interfacemanageMapper;

	public int insert(interfacemanage interfacemanage){
		return interfacemanageMapper.insert(interfacemanage);
	}
	public int insertSelective(interfacemanage interfacemanage){
		return interfacemanageMapper.insertSelective(interfacemanage);
	}
	public interfacemanage selectByPrimaryKey(Integer integer){
		return interfacemanageMapper.selectByPrimaryKey(integer);
	}
	public int deleteByPrimaryKey(Integer integer){
		return interfacemanageMapper.deleteByPrimaryKey(integer);
	}
	public int updateByPrimaryKeySelective(interfacemanage interfacemanage){
		return interfacemanageMapper.updateByPrimaryKeySelective(interfacemanage);
	}
	public int updateByPrimaryKey(interfacemanage interfacemanage){
		return interfacemanageMapper.updateByPrimaryKey(interfacemanage);
	}


}
