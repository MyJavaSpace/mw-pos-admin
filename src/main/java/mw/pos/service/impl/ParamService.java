package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("paramService")
public class ParamService implements IParamService {
	@Resource
	private ParamMapper paramMapper;

	public int insert(Param param){
		return paramMapper.insert(param);
	}
	public int insertSelective(Param param){
		return paramMapper.insertSelective(param);
	}
	public int deleteByPrimaryKey(String string){
		return paramMapper.deleteByPrimaryKey(string);
	}
	public Param selectByPrimaryKey(String string){
		return paramMapper.selectByPrimaryKey(string);
	}
	public int updateByPrimaryKeySelective(Param param){
		return paramMapper.updateByPrimaryKeySelective(param);
	}
	public int updateByPrimaryKey(Param param){
		return paramMapper.updateByPrimaryKey(param);
	}


}
