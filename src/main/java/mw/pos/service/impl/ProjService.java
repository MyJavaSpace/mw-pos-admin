package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("projService")
public class ProjService implements IProjService {
	@Resource
	private ProjMapper projMapper;

	public int insert(Proj proj){
		return projMapper.insert(proj);
	}
	public int insertSelective(Proj proj){
		return projMapper.insertSelective(proj);
	}
	public int deleteByPrimaryKey(String string){
		return projMapper.deleteByPrimaryKey(string);
	}
	public Proj selectByPrimaryKey(String string){
		return projMapper.selectByPrimaryKey(string);
	}
	public int updateByPrimaryKeySelective(Proj proj){
		return projMapper.updateByPrimaryKeySelective(proj);
	}
	public int updateByPrimaryKey(Proj proj){
		return projMapper.updateByPrimaryKey(proj);
	}


}
