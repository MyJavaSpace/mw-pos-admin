package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("usershopauthorityService")
public class UsershopauthorityService implements IUsershopauthorityService {
	@Resource
	private UsershopauthorityMapper usershopauthorityMapper;

	public int insert(Usershopauthority usershopauthority){
		return usershopauthorityMapper.insert(usershopauthority);
	}
	public int insertSelective(Usershopauthority usershopauthority){
		return usershopauthorityMapper.insertSelective(usershopauthority);
	}
	public int deleteByPrimaryKey(UsershopauthorityKey usershopauthorityKey){
		return usershopauthorityMapper.deleteByPrimaryKey(usershopauthorityKey);
	}
	public Usershopauthority selectByPrimaryKey(UsershopauthorityKey usershopauthorityKey){
		return usershopauthorityMapper.selectByPrimaryKey(usershopauthorityKey);
	}
	public int updateByPrimaryKeySelective(Usershopauthority usershopauthority){
		return usershopauthorityMapper.updateByPrimaryKeySelective(usershopauthority);
	}
	public int updateByPrimaryKey(Usershopauthority usershopauthority){
		return usershopauthorityMapper.updateByPrimaryKey(usershopauthority);
	}


}
