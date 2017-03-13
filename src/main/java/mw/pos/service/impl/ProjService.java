package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("ProjService")
public class ProjService implements IProjService {
	@Resource
	private ProjMapper ProjMapper;

	public int insert(Proj proj){
		return ProjMapper.insert(proj);
	}
	public int insertSelective(Proj proj){
		return ProjMapper.insertSelective(proj);
	}
	public int deleteByPrimaryKey(String string){
		return ProjMapper.deleteByPrimaryKey(string);
	}
	public Proj selectByPrimaryKey(String string){
		return ProjMapper.selectByPrimaryKey(string);
	}
	public int updateByPrimaryKey(Proj proj){
		return ProjMapper.updateByPrimaryKey(proj);
	}
	public int updateByPrimaryKeySelective(Proj proj){
		return ProjMapper.updateByPrimaryKeySelective(proj);
	}


}
