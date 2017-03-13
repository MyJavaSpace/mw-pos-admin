package mw.pos.service;

import com.pos.entity.*;

public interface IAddrService {
	int insert(Addr addr);
	int deleteByPrimaryKey(AddrKey addrKey);
	int updateByPrimaryKey(Addr addr);
	Addr selectByPrimaryKey(AddrKey addrKey);
	int insertSelective(Addr addr);
	int updateByPrimaryKeySelective(Addr addr);

}
