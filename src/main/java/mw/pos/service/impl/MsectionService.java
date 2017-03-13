package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("msectionService")
public class MsectionService implements IMsectionService {
	@Resource
	private MsectionMapper msectionMapper;

	public int insert(Msection msection){
		return msectionMapper.insert(msection);
	}
	public int insertSelective(Msection msection){
		return msectionMapper.insertSelective(msection);
	}
	public int deleteByPrimaryKey(MsectionKey msectionKey){
		return msectionMapper.deleteByPrimaryKey(msectionKey);
	}
	public Msection selectByPrimaryKey(MsectionKey msectionKey){
		return msectionMapper.selectByPrimaryKey(msectionKey);
	}
	public int updateByPrimaryKeySelective(Msection msection){
		return msectionMapper.updateByPrimaryKeySelective(msection);
	}
	public int updateByPrimaryKey(Msection msection){
		return msectionMapper.updateByPrimaryKey(msection);
	}


}
