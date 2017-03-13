package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("msectionService")
public class MsectionService implements IMsectionService {
	@Resource
	private msectionMapper msectionMapper;

	public int insert(msection msection){
		return msectionMapper.insert(msection);
	}
	public int insertSelective(msection msection){
		return msectionMapper.insertSelective(msection);
	}
	public msection selectByPrimaryKey(msectionKey msectionKey){
		return msectionMapper.selectByPrimaryKey(msectionKey);
	}
	public int deleteByPrimaryKey(msectionKey msectionKey){
		return msectionMapper.deleteByPrimaryKey(msectionKey);
	}
	public int updateByPrimaryKeySelective(msection msection){
		return msectionMapper.updateByPrimaryKeySelective(msection);
	}
	public int updateByPrimaryKey(msection msection){
		return msectionMapper.updateByPrimaryKey(msection);
	}


}
