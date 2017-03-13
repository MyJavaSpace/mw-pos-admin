package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("hostverService")
public class HostverService implements IHostverService {
	@Resource
	private hostverMapper hostverMapper;

	public int insert(hostver hostver){
		return hostverMapper.insert(hostver);
	}
	public int insertSelective(hostver hostver){
		return hostverMapper.insertSelective(hostver);
	}
	public hostver selectByPrimaryKey(hostverKey hostverKey){
		return hostverMapper.selectByPrimaryKey(hostverKey);
	}
	public int deleteByPrimaryKey(hostverKey hostverKey){
		return hostverMapper.deleteByPrimaryKey(hostverKey);
	}
	public int updateByPrimaryKeySelective(hostver hostver){
		return hostverMapper.updateByPrimaryKeySelective(hostver);
	}
	public int updateByPrimaryKey(hostver hostver){
		return hostverMapper.updateByPrimaryKey(hostver);
	}


}
