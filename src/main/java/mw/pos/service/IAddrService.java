package mw.pos.service;

import com.pos.entity.*;

public interface IAddrService {
	int insert(addr addr);
	addr selectByPrimaryKey(addrKey addrKey);
	int updateByPrimaryKeySelective(addr addr);
	int deleteByPrimaryKey(addrKey addrKey);
	int updateByPrimaryKey(addr addr);
	int insertSelective(addr addr);

}
