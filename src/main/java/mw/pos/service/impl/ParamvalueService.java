package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("paramvalueService")
public class ParamvalueService implements IParamvalueService {
	@Resource
	private paramvalueMapper paramvalueMapper;

	public int insert(paramvalue paramvalue){
		return paramvalueMapper.insert(paramvalue);
	}
	public int insertSelective(paramvalue paramvalue){
		return paramvalueMapper.insertSelective(paramvalue);
	}
	public paramvalue selectByPrimaryKey(paramvalueKey paramvalueKey){
		return paramvalueMapper.selectByPrimaryKey(paramvalueKey);
	}
	public int deleteByPrimaryKey(paramvalueKey paramvalueKey){
		return paramvalueMapper.deleteByPrimaryKey(paramvalueKey);
	}
	public int updateByPrimaryKeySelective(paramvalue paramvalue){
		return paramvalueMapper.updateByPrimaryKeySelective(paramvalue);
	}
	public int updateByPrimaryKey(paramvalue paramvalue){
		return paramvalueMapper.updateByPrimaryKey(paramvalue);
	}


}
