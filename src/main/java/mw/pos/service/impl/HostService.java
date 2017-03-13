package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("hostService")
public class HostService implements IHostService {
	@Resource
	private HostMapper hostMapper;

	public int insert(Host host){
		return hostMapper.insert(host);
	}
	public int insertSelective(Host host){
		return hostMapper.insertSelective(host);
	}
	public int deleteByPrimaryKey(HostKey hostKey){
		return hostMapper.deleteByPrimaryKey(hostKey);
	}
	public Host selectByPrimaryKey(HostKey hostKey){
		return hostMapper.selectByPrimaryKey(hostKey);
	}
	public int updateByPrimaryKeySelective(Host host){
		return hostMapper.updateByPrimaryKeySelective(host);
	}
	public int updateByPrimaryKey(Host host){
		return hostMapper.updateByPrimaryKey(host);
	}


}
