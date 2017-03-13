package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("cutmoneyService")
public class CutmoneyService implements ICutmoneyService {
	@Resource
	private CutmoneyMapper cutmoneyMapper;

	public int insert(Cutmoney cutmoney){
		return cutmoneyMapper.insert(cutmoney);
	}
	public int insertSelective(Cutmoney cutmoney){
		return cutmoneyMapper.insertSelective(cutmoney);
	}
	public int deleteByPrimaryKey(CutmoneyKey cutmoneyKey){
		return cutmoneyMapper.deleteByPrimaryKey(cutmoneyKey);
	}
	public Cutmoney selectByPrimaryKey(CutmoneyKey cutmoneyKey){
		return cutmoneyMapper.selectByPrimaryKey(cutmoneyKey);
	}
	public int updateByPrimaryKeySelective(Cutmoney cutmoney){
		return cutmoneyMapper.updateByPrimaryKeySelective(cutmoney);
	}
	public int updateByPrimaryKey(Cutmoney cutmoney){
		return cutmoneyMapper.updateByPrimaryKey(cutmoney);
	}


}
