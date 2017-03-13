package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("hostverService")
public class HostverService implements IHostverService {
	@Resource
	private HostverMapper hostverMapper;

	public int insert(Hostver hostver){
		return hostverMapper.insert(hostver);
	}
	public int insertSelective(Hostver hostver){
		return hostverMapper.insertSelective(hostver);
	}
	public int deleteByPrimaryKey(HostverKey hostverKey){
		return hostverMapper.deleteByPrimaryKey(hostverKey);
	}
	public Hostver selectByPrimaryKey(HostverKey hostverKey){
		return hostverMapper.selectByPrimaryKey(hostverKey);
	}
	public int updateByPrimaryKeySelective(Hostver hostver){
		return hostverMapper.updateByPrimaryKeySelective(hostver);
	}
	public int updateByPrimaryKey(Hostver hostver){
		return hostverMapper.updateByPrimaryKey(hostver);
	}


}
