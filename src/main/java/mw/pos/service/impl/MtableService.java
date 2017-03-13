package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("mtableService")
public class MtableService implements IMtableService {
	@Resource
	private MtableMapper mtableMapper;

	public int insert(Mtable mtable){
		return mtableMapper.insert(mtable);
	}
	public int insertSelective(Mtable mtable){
		return mtableMapper.insertSelective(mtable);
	}
	public int deleteByPrimaryKey(MtableKey mtableKey){
		return mtableMapper.deleteByPrimaryKey(mtableKey);
	}
	public Mtable selectByPrimaryKey(MtableKey mtableKey){
		return mtableMapper.selectByPrimaryKey(mtableKey);
	}
	public int updateByPrimaryKeySelective(Mtable mtable){
		return mtableMapper.updateByPrimaryKeySelective(mtable);
	}
	public int updateByPrimaryKey(Mtable mtable){
		return mtableMapper.updateByPrimaryKey(mtable);
	}


}
