package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("mtableclsService")
public class MtableclsService implements IMtableclsService {
	@Resource
	private mtableclsMapper mtableclsMapper;

	public int insert(mtablecls mtablecls){
		return mtableclsMapper.insert(mtablecls);
	}
	public int insertSelective(mtablecls mtablecls){
		return mtableclsMapper.insertSelective(mtablecls);
	}
	public mtablecls selectByPrimaryKey(mtableclsKey mtableclsKey){
		return mtableclsMapper.selectByPrimaryKey(mtableclsKey);
	}
	public int deleteByPrimaryKey(mtableclsKey mtableclsKey){
		return mtableclsMapper.deleteByPrimaryKey(mtableclsKey);
	}
	public int updateByPrimaryKeySelective(mtablecls mtablecls){
		return mtableclsMapper.updateByPrimaryKeySelective(mtablecls);
	}
	public int updateByPrimaryKey(mtablecls mtablecls){
		return mtableclsMapper.updateByPrimaryKey(mtablecls);
	}


}
