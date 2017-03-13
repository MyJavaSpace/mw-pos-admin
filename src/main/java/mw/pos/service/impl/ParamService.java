package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("paramService")
public class ParamService implements IParamService {
	@Resource
	private paramMapper paramMapper;

	public int insert(param param){
		return paramMapper.insert(param);
	}
	public int insertSelective(param param){
		return paramMapper.insertSelective(param);
	}
	public param selectByPrimaryKey(String string){
		return paramMapper.selectByPrimaryKey(string);
	}
	public int deleteByPrimaryKey(String string){
		return paramMapper.deleteByPrimaryKey(string);
	}
	public int updateByPrimaryKeySelective(param param){
		return paramMapper.updateByPrimaryKeySelective(param);
	}
	public int updateByPrimaryKey(param param){
		return paramMapper.updateByPrimaryKey(param);
	}


}
