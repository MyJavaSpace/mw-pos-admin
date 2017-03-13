package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("MtableService")
public class MtableService implements IMtableService {
	@Resource
	private MtableMapper MtableMapper;

	public int insert(Mtable mtable){
		return MtableMapper.insert(mtable);
	}
	public int insertSelective(Mtable mtable){
		return MtableMapper.insertSelective(mtable);
	}
	public int deleteByPrimaryKey(MtableKey mtableKey){
		return MtableMapper.deleteByPrimaryKey(mtableKey);
	}
	public Mtable selectByPrimaryKey(MtableKey mtableKey){
		return MtableMapper.selectByPrimaryKey(mtableKey);
	}
	public int updateByPrimaryKey(Mtable mtable){
		return MtableMapper.updateByPrimaryKey(mtable);
	}
	public int updateByPrimaryKeySelective(Mtable mtable){
		return MtableMapper.updateByPrimaryKeySelective(mtable);
	}


}
