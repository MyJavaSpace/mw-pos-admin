package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("mtableclsService")
public class MtableclsService implements IMtableclsService {
	@Resource
	private MtableclsMapper mtableclsMapper;

	public int insert(Mtablecls mtablecls){
		return mtableclsMapper.insert(mtablecls);
	}
	public int insertSelective(Mtablecls mtablecls){
		return mtableclsMapper.insertSelective(mtablecls);
	}
	public int deleteByPrimaryKey(MtableclsKey mtableclsKey){
		return mtableclsMapper.deleteByPrimaryKey(mtableclsKey);
	}
	public Mtablecls selectByPrimaryKey(MtableclsKey mtableclsKey){
		return mtableclsMapper.selectByPrimaryKey(mtableclsKey);
	}
	public int updateByPrimaryKeySelective(Mtablecls mtablecls){
		return mtableclsMapper.updateByPrimaryKeySelective(mtablecls);
	}
	public int updateByPrimaryKey(Mtablecls mtablecls){
		return mtableclsMapper.updateByPrimaryKey(mtablecls);
	}


}
