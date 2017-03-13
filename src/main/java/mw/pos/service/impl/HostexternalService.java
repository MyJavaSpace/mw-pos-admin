package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("hostexternalService")
public class HostexternalService implements IHostexternalService {
	@Resource
	private HostexternalMapper hostexternalMapper;

	public int insert(Hostexternal hostexternal){
		return hostexternalMapper.insert(hostexternal);
	}
	public int insertSelective(Hostexternal hostexternal){
		return hostexternalMapper.insertSelective(hostexternal);
	}
	public int deleteByPrimaryKey(HostexternalKey hostexternalKey){
		return hostexternalMapper.deleteByPrimaryKey(hostexternalKey);
	}
	public Hostexternal selectByPrimaryKey(HostexternalKey hostexternalKey){
		return hostexternalMapper.selectByPrimaryKey(hostexternalKey);
	}
	public int updateByPrimaryKeySelective(Hostexternal hostexternal){
		return hostexternalMapper.updateByPrimaryKeySelective(hostexternal);
	}
	public int updateByPrimaryKey(Hostexternal hostexternal){
		return hostexternalMapper.updateByPrimaryKey(hostexternal);
	}
	public int updateByPrimaryKeyWithBLOBs(Hostexternal hostexternal){
		return hostexternalMapper.updateByPrimaryKeyWithBLOBs(hostexternal);
	}


}
