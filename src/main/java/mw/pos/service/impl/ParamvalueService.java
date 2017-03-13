package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("paramvalueService")
public class ParamvalueService implements IParamvalueService {
	@Resource
	private ParamvalueMapper paramvalueMapper;

	public int insert(Paramvalue paramvalue){
		return paramvalueMapper.insert(paramvalue);
	}
	public int insertSelective(Paramvalue paramvalue){
		return paramvalueMapper.insertSelective(paramvalue);
	}
	public int deleteByPrimaryKey(ParamvalueKey paramvalueKey){
		return paramvalueMapper.deleteByPrimaryKey(paramvalueKey);
	}
	public Paramvalue selectByPrimaryKey(ParamvalueKey paramvalueKey){
		return paramvalueMapper.selectByPrimaryKey(paramvalueKey);
	}
	public int updateByPrimaryKeySelective(Paramvalue paramvalue){
		return paramvalueMapper.updateByPrimaryKeySelective(paramvalue);
	}
	public int updateByPrimaryKey(Paramvalue paramvalue){
		return paramvalueMapper.updateByPrimaryKey(paramvalue);
	}


}
