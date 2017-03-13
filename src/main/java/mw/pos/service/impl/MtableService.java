package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("mtableService")
public class MtableService implements IMtableService {
	@Resource
	private mtableMapper mtableMapper;

	public int insert(mtable mtable){
		return mtableMapper.insert(mtable);
	}
	public int insertSelective(mtable mtable){
		return mtableMapper.insertSelective(mtable);
	}
	public mtable selectByPrimaryKey(mtableKey mtableKey){
		return mtableMapper.selectByPrimaryKey(mtableKey);
	}
	public int deleteByPrimaryKey(mtableKey mtableKey){
		return mtableMapper.deleteByPrimaryKey(mtableKey);
	}
	public int updateByPrimaryKeySelective(mtable mtable){
		return mtableMapper.updateByPrimaryKeySelective(mtable);
	}
	public int updateByPrimaryKey(mtable mtable){
		return mtableMapper.updateByPrimaryKey(mtable);
	}


}
