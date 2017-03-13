package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("UsershopauthorityService")
public class UsershopauthorityService implements IUsershopauthorityService {
	@Resource
	private UsershopauthorityMapper UsershopauthorityMapper;

	public int insert(Usershopauthority usershopauthority){
		return UsershopauthorityMapper.insert(usershopauthority);
	}
	public int insertSelective(Usershopauthority usershopauthority){
		return UsershopauthorityMapper.insertSelective(usershopauthority);
	}
	public int deleteByPrimaryKey(UsershopauthorityKey usershopauthorityKey){
		return UsershopauthorityMapper.deleteByPrimaryKey(usershopauthorityKey);
	}
	public Usershopauthority selectByPrimaryKey(UsershopauthorityKey usershopauthorityKey){
		return UsershopauthorityMapper.selectByPrimaryKey(usershopauthorityKey);
	}
	public int updateByPrimaryKey(Usershopauthority usershopauthority){
		return UsershopauthorityMapper.updateByPrimaryKey(usershopauthority);
	}
	public int updateByPrimaryKeySelective(Usershopauthority usershopauthority){
		return UsershopauthorityMapper.updateByPrimaryKeySelective(usershopauthority);
	}


}
