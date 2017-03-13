package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("HostexternalService")
public class HostexternalService implements IHostexternalService {
	@Resource
	private HostexternalMapper HostexternalMapper;

	public int insert(Hostexternal hostexternal){
		return HostexternalMapper.insert(hostexternal);
	}
	public int insertSelective(Hostexternal hostexternal){
		return HostexternalMapper.insertSelective(hostexternal);
	}
	public int deleteByPrimaryKey(HostexternalKey hostexternalKey){
		return HostexternalMapper.deleteByPrimaryKey(hostexternalKey);
	}
	public Hostexternal selectByPrimaryKey(HostexternalKey hostexternalKey){
		return HostexternalMapper.selectByPrimaryKey(hostexternalKey);
	}
	public int updateByPrimaryKey(Hostexternal hostexternal){
		return HostexternalMapper.updateByPrimaryKey(hostexternal);
	}
	public int updateByPrimaryKeySelective(Hostexternal hostexternal){
		return HostexternalMapper.updateByPrimaryKeySelective(hostexternal);
	}
	public int updateByPrimaryKeyWithBLOBs(Hostexternal hostexternal){
		return HostexternalMapper.updateByPrimaryKeyWithBLOBs(hostexternal);
	}


}
