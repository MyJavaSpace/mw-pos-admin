package mw.pos.service;

import com.pos.entity.*;

public interface IInterfacemanageService {
	int insert(Interfacemanage interfacemanage);
	int deleteByPrimaryKey(Integer integer);
	int updateByPrimaryKey(Interfacemanage interfacemanage);
	Interfacemanage selectByPrimaryKey(Integer integer);
	int insertSelective(Interfacemanage interfacemanage);
	int updateByPrimaryKeySelective(Interfacemanage interfacemanage);

}
