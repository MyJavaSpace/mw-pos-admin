package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("MsectionService")
public class MsectionService implements IMsectionService {
	@Resource
	private MsectionMapper MsectionMapper;

	public int insert(Msection msection){
		return MsectionMapper.insert(msection);
	}
	public int insertSelective(Msection msection){
		return MsectionMapper.insertSelective(msection);
	}
	public int deleteByPrimaryKey(MsectionKey msectionKey){
		return MsectionMapper.deleteByPrimaryKey(msectionKey);
	}
	public Msection selectByPrimaryKey(MsectionKey msectionKey){
		return MsectionMapper.selectByPrimaryKey(msectionKey);
	}
	public int updateByPrimaryKey(Msection msection){
		return MsectionMapper.updateByPrimaryKey(msection);
	}
	public int updateByPrimaryKeySelective(Msection msection){
		return MsectionMapper.updateByPrimaryKeySelective(msection);
	}


}
