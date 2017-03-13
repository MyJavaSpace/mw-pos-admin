package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("progService")
public class ProgService implements IProgService {
	@Resource
	private progMapper progMapper;

	public int insert(prog prog){
		return progMapper.insert(prog);
	}
	public int insertSelective(prog prog){
		return progMapper.insertSelective(prog);
	}
	public prog selectByPrimaryKey(String string){
		return progMapper.selectByPrimaryKey(string);
	}
	public int deleteByPrimaryKey(String string){
		return progMapper.deleteByPrimaryKey(string);
	}
	public int updateByPrimaryKeySelective(prog prog){
		return progMapper.updateByPrimaryKeySelective(prog);
	}
	public int updateByPrimaryKey(prog prog){
		return progMapper.updateByPrimaryKey(prog);
	}


}
