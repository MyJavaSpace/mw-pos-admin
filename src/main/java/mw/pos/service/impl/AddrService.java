package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("addrService")
public class AddrService implements IAddrService {
	@Resource
	private AddrMapper addrMapper;

	public int insert(Addr addr){
		return addrMapper.insert(addr);
	}
	public int insertSelective(Addr addr){
		return addrMapper.insertSelective(addr);
	}
	public int deleteByPrimaryKey(AddrKey addrKey){
		return addrMapper.deleteByPrimaryKey(addrKey);
	}
	public Addr selectByPrimaryKey(AddrKey addrKey){
		return addrMapper.selectByPrimaryKey(addrKey);
	}
	public int updateByPrimaryKeySelective(Addr addr){
		return addrMapper.updateByPrimaryKeySelective(addr);
	}
	public int updateByPrimaryKey(Addr addr){
		return addrMapper.updateByPrimaryKey(addr);
	}


}
