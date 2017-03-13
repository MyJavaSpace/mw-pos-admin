package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("AddrService")
public class AddrService implements IAddrService {
	@Resource
	private AddrMapper AddrMapper;

	public int insert(Addr addr){
		return AddrMapper.insert(addr);
	}
	public int insertSelective(Addr addr){
		return AddrMapper.insertSelective(addr);
	}
	public int deleteByPrimaryKey(AddrKey addrKey){
		return AddrMapper.deleteByPrimaryKey(addrKey);
	}
	public Addr selectByPrimaryKey(AddrKey addrKey){
		return AddrMapper.selectByPrimaryKey(addrKey);
	}
	public int updateByPrimaryKey(Addr addr){
		return AddrMapper.updateByPrimaryKey(addr);
	}
	public int updateByPrimaryKeySelective(Addr addr){
		return AddrMapper.updateByPrimaryKeySelective(addr);
	}


}
