package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("addrService")
public class AddrService implements IAddrService {
	@Resource
	private addrMapper addrMapper;

	public int insert(addr addr){
		return addrMapper.insert(addr);
	}
	public int insertSelective(addr addr){
		return addrMapper.insertSelective(addr);
	}
	public addr selectByPrimaryKey(addrKey addrKey){
		return addrMapper.selectByPrimaryKey(addrKey);
	}
	public int deleteByPrimaryKey(addrKey addrKey){
		return addrMapper.deleteByPrimaryKey(addrKey);
	}
	public int updateByPrimaryKeySelective(addr addr){
		return addrMapper.updateByPrimaryKeySelective(addr);
	}
	public int updateByPrimaryKey(addr addr){
		return addrMapper.updateByPrimaryKey(addr);
	}


}
