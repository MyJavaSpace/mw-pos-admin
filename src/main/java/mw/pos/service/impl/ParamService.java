package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("ParamService")
public class ParamService implements IParamService {
	@Resource
	private ParamMapper ParamMapper;

	public int insert(Param param){
		return ParamMapper.insert(param);
	}
	public int insertSelective(Param param){
		return ParamMapper.insertSelective(param);
	}
	public int deleteByPrimaryKey(String string){
		return ParamMapper.deleteByPrimaryKey(string);
	}
	public Param selectByPrimaryKey(String string){
		return ParamMapper.selectByPrimaryKey(string);
	}
	public int updateByPrimaryKey(Param param){
		return ParamMapper.updateByPrimaryKey(param);
	}
	public int updateByPrimaryKeySelective(Param param){
		return ParamMapper.updateByPrimaryKeySelective(param);
	}


}
