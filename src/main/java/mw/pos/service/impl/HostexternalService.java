package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("hostexternalService")
public class HostexternalService implements IHostexternalService {
	@Resource
	private hostexternalMapper hostexternalMapper;

	public int insert(hostexternal hostexternal){
		return hostexternalMapper.insert(hostexternal);
	}
	public int insertSelective(hostexternal hostexternal){
		return hostexternalMapper.insertSelective(hostexternal);
	}
	public hostexternal selectByPrimaryKey(hostexternalKey hostexternalKey){
		return hostexternalMapper.selectByPrimaryKey(hostexternalKey);
	}
	public int deleteByPrimaryKey(hostexternalKey hostexternalKey){
		return hostexternalMapper.deleteByPrimaryKey(hostexternalKey);
	}
	public int updateByPrimaryKeySelective(hostexternal hostexternal){
		return hostexternalMapper.updateByPrimaryKeySelective(hostexternal);
	}
	public int updateByPrimaryKey(hostexternal hostexternal){
		return hostexternalMapper.updateByPrimaryKey(hostexternal);
	}
	public int updateByPrimaryKeyWithBLOBs(hostexternal hostexternal){
		return hostexternalMapper.updateByPrimaryKeyWithBLOBs(hostexternal);
	}


}
