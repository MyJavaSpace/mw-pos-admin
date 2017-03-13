package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("ProgService")
public class ProgService implements IProgService {
	@Resource
	private ProgMapper ProgMapper;

	public int insert(Prog prog){
		return ProgMapper.insert(prog);
	}
	public int insertSelective(Prog prog){
		return ProgMapper.insertSelective(prog);
	}
	public int deleteByPrimaryKey(String string){
		return ProgMapper.deleteByPrimaryKey(string);
	}
	public Prog selectByPrimaryKey(String string){
		return ProgMapper.selectByPrimaryKey(string);
	}
	public int updateByPrimaryKey(Prog prog){
		return ProgMapper.updateByPrimaryKey(prog);
	}
	public int updateByPrimaryKeySelective(Prog prog){
		return ProgMapper.updateByPrimaryKeySelective(prog);
	}


}
