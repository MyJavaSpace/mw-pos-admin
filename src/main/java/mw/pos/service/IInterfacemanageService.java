package mw.pos.service;

import com.pos.entity.*;

public interface IInterfacemanageService {
	int insert(interfacemanage interfacemanage);
	interfacemanage selectByPrimaryKey(Integer integer);
	int updateByPrimaryKeySelective(interfacemanage interfacemanage);
	int deleteByPrimaryKey(Integer integer);
	int updateByPrimaryKey(interfacemanage interfacemanage);
	int insertSelective(interfacemanage interfacemanage);

}
