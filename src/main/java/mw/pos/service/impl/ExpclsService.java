package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("expclsService")
public class ExpclsService implements IExpclsService {
	@Resource
	private expclsMapper expclsMapper;

	public int insert(expcls expcls){
		return expclsMapper.insert(expcls);
	}
	public int insertSelective(expcls expcls){
		return expclsMapper.insertSelective(expcls);
	}
	public expcls selectByPrimaryKey(expclsKey expclsKey){
		return expclsMapper.selectByPrimaryKey(expclsKey);
	}
	public int deleteByPrimaryKey(expclsKey expclsKey){
		return expclsMapper.deleteByPrimaryKey(expclsKey);
	}
	public int updateByPrimaryKeySelective(expcls expcls){
		return expclsMapper.updateByPrimaryKeySelective(expcls);
	}
	public int updateByPrimaryKey(expcls expcls){
		return expclsMapper.updateByPrimaryKey(expcls);
	}


}
