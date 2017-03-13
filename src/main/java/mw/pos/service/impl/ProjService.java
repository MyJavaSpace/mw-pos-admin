package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("projService")
public class ProjService implements IProjService {
	@Resource
	private projMapper projMapper;

	public int insert(proj proj){
		return projMapper.insert(proj);
	}
	public int insertSelective(proj proj){
		return projMapper.insertSelective(proj);
	}
	public proj selectByPrimaryKey(String string){
		return projMapper.selectByPrimaryKey(string);
	}
	public int deleteByPrimaryKey(String string){
		return projMapper.deleteByPrimaryKey(string);
	}
	public int updateByPrimaryKeySelective(proj proj){
		return projMapper.updateByPrimaryKeySelective(proj);
	}
	public int updateByPrimaryKey(proj proj){
		return projMapper.updateByPrimaryKey(proj);
	}


}
