package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("cutmoneyService")
public class CutmoneyService implements ICutmoneyService {
	@Resource
	private cutmoneyMapper cutmoneyMapper;

	public int insert(cutmoney cutmoney){
		return cutmoneyMapper.insert(cutmoney);
	}
	public int insertSelective(cutmoney cutmoney){
		return cutmoneyMapper.insertSelective(cutmoney);
	}
	public cutmoney selectByPrimaryKey(cutmoneyKey cutmoneyKey){
		return cutmoneyMapper.selectByPrimaryKey(cutmoneyKey);
	}
	public int deleteByPrimaryKey(cutmoneyKey cutmoneyKey){
		return cutmoneyMapper.deleteByPrimaryKey(cutmoneyKey);
	}
	public int updateByPrimaryKeySelective(cutmoney cutmoney){
		return cutmoneyMapper.updateByPrimaryKeySelective(cutmoney);
	}
	public int updateByPrimaryKey(cutmoney cutmoney){
		return cutmoneyMapper.updateByPrimaryKey(cutmoney);
	}


}
