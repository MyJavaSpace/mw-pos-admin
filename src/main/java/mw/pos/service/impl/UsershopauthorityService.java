package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("usershopauthorityService")
public class UsershopauthorityService implements IUsershopauthorityService {
	@Resource
	private usershopauthorityMapper usershopauthorityMapper;

	public int insert(usershopauthority usershopauthority){
		return usershopauthorityMapper.insert(usershopauthority);
	}
	public int insertSelective(usershopauthority usershopauthority){
		return usershopauthorityMapper.insertSelective(usershopauthority);
	}
	public usershopauthority selectByPrimaryKey(usershopauthorityKey usershopauthorityKey){
		return usershopauthorityMapper.selectByPrimaryKey(usershopauthorityKey);
	}
	public int deleteByPrimaryKey(usershopauthorityKey usershopauthorityKey){
		return usershopauthorityMapper.deleteByPrimaryKey(usershopauthorityKey);
	}
	public int updateByPrimaryKeySelective(usershopauthority usershopauthority){
		return usershopauthorityMapper.updateByPrimaryKeySelective(usershopauthority);
	}
	public int updateByPrimaryKey(usershopauthority usershopauthority){
		return usershopauthorityMapper.updateByPrimaryKey(usershopauthority);
	}


}
