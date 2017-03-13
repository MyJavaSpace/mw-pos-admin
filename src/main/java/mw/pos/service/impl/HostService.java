package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("hostService")
public class HostService implements IHostService {
	@Resource
	private hostMapper hostMapper;

	public int insert(host host){
		return hostMapper.insert(host);
	}
	public int insertSelective(host host){
		return hostMapper.insertSelective(host);
	}
	public host selectByPrimaryKey(hostKey hostKey){
		return hostMapper.selectByPrimaryKey(hostKey);
	}
	public int deleteByPrimaryKey(hostKey hostKey){
		return hostMapper.deleteByPrimaryKey(hostKey);
	}
	public int updateByPrimaryKeySelective(host host){
		return hostMapper.updateByPrimaryKeySelective(host);
	}
	public int updateByPrimaryKey(host host){
		return hostMapper.updateByPrimaryKey(host);
	}


}
