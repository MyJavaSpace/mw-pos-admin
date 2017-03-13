package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("InterfacemanageService")
public class InterfacemanageService implements IInterfacemanageService {
	@Resource
	private InterfacemanageMapper InterfacemanageMapper;

	public int insert(Interfacemanage interfacemanage){
		return InterfacemanageMapper.insert(interfacemanage);
	}
	public int insertSelective(Interfacemanage interfacemanage){
		return InterfacemanageMapper.insertSelective(interfacemanage);
	}
	public int deleteByPrimaryKey(Integer integer){
		return InterfacemanageMapper.deleteByPrimaryKey(integer);
	}
	public Interfacemanage selectByPrimaryKey(Integer integer){
		return InterfacemanageMapper.selectByPrimaryKey(integer);
	}
	public int updateByPrimaryKey(Interfacemanage interfacemanage){
		return InterfacemanageMapper.updateByPrimaryKey(interfacemanage);
	}
	public int updateByPrimaryKeySelective(Interfacemanage interfacemanage){
		return InterfacemanageMapper.updateByPrimaryKeySelective(interfacemanage);
	}


}
