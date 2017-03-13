package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("openparamService")
public class OpenparamService implements IOpenparamService {
	@Resource
	private openparamMapper openparamMapper;

	public int insert(openparam openparam){
		return openparamMapper.insert(openparam);
	}
	public int insertSelective(openparam openparam){
		return openparamMapper.insertSelective(openparam);
	}
	public openparam selectByPrimaryKey(Integer integer){
		return openparamMapper.selectByPrimaryKey(integer);
	}
	public int deleteByPrimaryKey(Integer integer){
		return openparamMapper.deleteByPrimaryKey(integer);
	}
	public int updateByPrimaryKeySelective(openparam openparam){
		return openparamMapper.updateByPrimaryKeySelective(openparam);
	}
	public int updateByPrimaryKey(openparam openparam){
		return openparamMapper.updateByPrimaryKey(openparam);
	}


}
