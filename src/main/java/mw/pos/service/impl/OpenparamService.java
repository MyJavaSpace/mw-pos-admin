package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("OpenparamService")
public class OpenparamService implements IOpenparamService {
	@Resource
	private OpenparamMapper OpenparamMapper;

	public int insert(Openparam openparam){
		return OpenparamMapper.insert(openparam);
	}
	public int insertSelective(Openparam openparam){
		return OpenparamMapper.insertSelective(openparam);
	}
	public int deleteByPrimaryKey(Integer integer){
		return OpenparamMapper.deleteByPrimaryKey(integer);
	}
	public Openparam selectByPrimaryKey(Integer integer){
		return OpenparamMapper.selectByPrimaryKey(integer);
	}
	public int updateByPrimaryKey(Openparam openparam){
		return OpenparamMapper.updateByPrimaryKey(openparam);
	}
	public int updateByPrimaryKeySelective(Openparam openparam){
		return OpenparamMapper.updateByPrimaryKeySelective(openparam);
	}


}
