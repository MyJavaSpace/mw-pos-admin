package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("MtableclsService")
public class MtableclsService implements IMtableclsService {
	@Resource
	private MtableclsMapper MtableclsMapper;

	public int insert(Mtablecls mtablecls){
		return MtableclsMapper.insert(mtablecls);
	}
	public int insertSelective(Mtablecls mtablecls){
		return MtableclsMapper.insertSelective(mtablecls);
	}
	public int deleteByPrimaryKey(MtableclsKey mtableclsKey){
		return MtableclsMapper.deleteByPrimaryKey(mtableclsKey);
	}
	public Mtablecls selectByPrimaryKey(MtableclsKey mtableclsKey){
		return MtableclsMapper.selectByPrimaryKey(mtableclsKey);
	}
	public int updateByPrimaryKey(Mtablecls mtablecls){
		return MtableclsMapper.updateByPrimaryKey(mtablecls);
	}
	public int updateByPrimaryKeySelective(Mtablecls mtablecls){
		return MtableclsMapper.updateByPrimaryKeySelective(mtablecls);
	}


}
