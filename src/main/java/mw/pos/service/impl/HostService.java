package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("HostService")
public class HostService implements IHostService {
	@Resource
	private HostMapper HostMapper;

	public int insert(Host host){
		return HostMapper.insert(host);
	}
	public int insertSelective(Host host){
		return HostMapper.insertSelective(host);
	}
	public int deleteByPrimaryKey(HostKey hostKey){
		return HostMapper.deleteByPrimaryKey(hostKey);
	}
	public Host selectByPrimaryKey(HostKey hostKey){
		return HostMapper.selectByPrimaryKey(hostKey);
	}
	public int updateByPrimaryKey(Host host){
		return HostMapper.updateByPrimaryKey(host);
	}
	public int updateByPrimaryKeySelective(Host host){
		return HostMapper.updateByPrimaryKeySelective(host);
	}


}
