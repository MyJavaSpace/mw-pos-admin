package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("CutmoneyService")
public class CutmoneyService implements ICutmoneyService {
	@Resource
	private CutmoneyMapper CutmoneyMapper;

	public int insert(Cutmoney cutmoney){
		return CutmoneyMapper.insert(cutmoney);
	}
	public int insertSelective(Cutmoney cutmoney){
		return CutmoneyMapper.insertSelective(cutmoney);
	}
	public int deleteByPrimaryKey(CutmoneyKey cutmoneyKey){
		return CutmoneyMapper.deleteByPrimaryKey(cutmoneyKey);
	}
	public Cutmoney selectByPrimaryKey(CutmoneyKey cutmoneyKey){
		return CutmoneyMapper.selectByPrimaryKey(cutmoneyKey);
	}
	public int updateByPrimaryKey(Cutmoney cutmoney){
		return CutmoneyMapper.updateByPrimaryKey(cutmoney);
	}
	public int updateByPrimaryKeySelective(Cutmoney cutmoney){
		return CutmoneyMapper.updateByPrimaryKeySelective(cutmoney);
	}


}
