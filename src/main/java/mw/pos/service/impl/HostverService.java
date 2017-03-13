package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("HostverService")
public class HostverService implements IHostverService {
	@Resource
	private HostverMapper HostverMapper;

	public int insert(Hostver hostver){
		return HostverMapper.insert(hostver);
	}
	public int insertSelective(Hostver hostver){
		return HostverMapper.insertSelective(hostver);
	}
	public int deleteByPrimaryKey(HostverKey hostverKey){
		return HostverMapper.deleteByPrimaryKey(hostverKey);
	}
	public Hostver selectByPrimaryKey(HostverKey hostverKey){
		return HostverMapper.selectByPrimaryKey(hostverKey);
	}
	public int updateByPrimaryKey(Hostver hostver){
		return HostverMapper.updateByPrimaryKey(hostver);
	}
	public int updateByPrimaryKeySelective(Hostver hostver){
		return HostverMapper.updateByPrimaryKeySelective(hostver);
	}


}
