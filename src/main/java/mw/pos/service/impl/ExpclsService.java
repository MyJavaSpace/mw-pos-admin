package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("ExpclsService")
public class ExpclsService implements IExpclsService {
	@Resource
	private ExpclsMapper ExpclsMapper;

	public int insert(Expcls expcls){
		return ExpclsMapper.insert(expcls);
	}
	public int insertSelective(Expcls expcls){
		return ExpclsMapper.insertSelective(expcls);
	}
	public int deleteByPrimaryKey(ExpclsKey expclsKey){
		return ExpclsMapper.deleteByPrimaryKey(expclsKey);
	}
	public Expcls selectByPrimaryKey(ExpclsKey expclsKey){
		return ExpclsMapper.selectByPrimaryKey(expclsKey);
	}
	public int updateByPrimaryKey(Expcls expcls){
		return ExpclsMapper.updateByPrimaryKey(expcls);
	}
	public int updateByPrimaryKeySelective(Expcls expcls){
		return ExpclsMapper.updateByPrimaryKeySelective(expcls);
	}


}
