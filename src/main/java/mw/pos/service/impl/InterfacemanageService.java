package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("interfacemanageService")
public class InterfacemanageService implements IInterfacemanageService {
	@Resource
	private InterfacemanageMapper interfacemanageMapper;

	public int insert(Interfacemanage interfacemanage){
		return interfacemanageMapper.insert(interfacemanage);
	}
	public int insertSelective(Interfacemanage interfacemanage){
		return interfacemanageMapper.insertSelective(interfacemanage);
	}
	public int deleteByPrimaryKey(Integer integer){
		return interfacemanageMapper.deleteByPrimaryKey(integer);
	}
	public Interfacemanage selectByPrimaryKey(Integer integer){
		return interfacemanageMapper.selectByPrimaryKey(integer);
	}
	public int updateByPrimaryKeySelective(Interfacemanage interfacemanage){
		return interfacemanageMapper.updateByPrimaryKeySelective(interfacemanage);
	}
	public int updateByPrimaryKey(Interfacemanage interfacemanage){
		return interfacemanageMapper.updateByPrimaryKey(interfacemanage);
	}


}
