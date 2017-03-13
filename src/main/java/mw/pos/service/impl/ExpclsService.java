package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("expclsService")
public class ExpclsService implements IExpclsService {
	@Resource
	private ExpclsMapper expclsMapper;

	public int insert(Expcls expcls){
		return expclsMapper.insert(expcls);
	}
	public int insertSelective(Expcls expcls){
		return expclsMapper.insertSelective(expcls);
	}
	public int deleteByPrimaryKey(ExpclsKey expclsKey){
		return expclsMapper.deleteByPrimaryKey(expclsKey);
	}
	public Expcls selectByPrimaryKey(ExpclsKey expclsKey){
		return expclsMapper.selectByPrimaryKey(expclsKey);
	}
	public int updateByPrimaryKeySelective(Expcls expcls){
		return expclsMapper.updateByPrimaryKeySelective(expcls);
	}
	public int updateByPrimaryKey(Expcls expcls){
		return expclsMapper.updateByPrimaryKey(expcls);
	}


}
