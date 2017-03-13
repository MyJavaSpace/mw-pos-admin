package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("ParamvalueService")
public class ParamvalueService implements IParamvalueService {
	@Resource
	private ParamvalueMapper ParamvalueMapper;

	public int insert(Paramvalue paramvalue){
		return ParamvalueMapper.insert(paramvalue);
	}
	public int insertSelective(Paramvalue paramvalue){
		return ParamvalueMapper.insertSelective(paramvalue);
	}
	public int deleteByPrimaryKey(ParamvalueKey paramvalueKey){
		return ParamvalueMapper.deleteByPrimaryKey(paramvalueKey);
	}
	public Paramvalue selectByPrimaryKey(ParamvalueKey paramvalueKey){
		return ParamvalueMapper.selectByPrimaryKey(paramvalueKey);
	}
	public int updateByPrimaryKey(Paramvalue paramvalue){
		return ParamvalueMapper.updateByPrimaryKey(paramvalue);
	}
	public int updateByPrimaryKeySelective(Paramvalue paramvalue){
		return ParamvalueMapper.updateByPrimaryKeySelective(paramvalue);
	}


}
