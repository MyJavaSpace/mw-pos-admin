package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("progService")
public class ProgService implements IProgService {
	@Resource
	private ProgMapper progMapper;

	public int insert(Prog prog){
		return progMapper.insert(prog);
	}
	public int insertSelective(Prog prog){
		return progMapper.insertSelective(prog);
	}
	public int deleteByPrimaryKey(String string){
		return progMapper.deleteByPrimaryKey(string);
	}
	public Prog selectByPrimaryKey(String string){
		return progMapper.selectByPrimaryKey(string);
	}
	public int updateByPrimaryKeySelective(Prog prog){
		return progMapper.updateByPrimaryKeySelective(prog);
	}
	public int updateByPrimaryKey(Prog prog){
		return progMapper.updateByPrimaryKey(prog);
	}


}
