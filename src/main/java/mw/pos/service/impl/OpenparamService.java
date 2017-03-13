package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("openparamService")
public class OpenparamService implements IOpenparamService {
	@Resource
	private OpenparamMapper openparamMapper;

	public int insert(Openparam openparam){
		return openparamMapper.insert(openparam);
	}
	public int insertSelective(Openparam openparam){
		return openparamMapper.insertSelective(openparam);
	}
	public int deleteByPrimaryKey(Integer integer){
		return openparamMapper.deleteByPrimaryKey(integer);
	}
	public Openparam selectByPrimaryKey(Integer integer){
		return openparamMapper.selectByPrimaryKey(integer);
	}
	public int updateByPrimaryKeySelective(Openparam openparam){
		return openparamMapper.updateByPrimaryKeySelective(openparam);
	}
	public int updateByPrimaryKey(Openparam openparam){
		return openparamMapper.updateByPrimaryKey(openparam);
	}


}
