package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("mtablesteService")
public class MtablesteService implements IMtablesteService {
	@Resource
	private MtablesteMapper mtablesteMapper;

	public int insert(Mtableste mtableste){
		return mtablesteMapper.insert(mtableste);
	}
	public int insertSelective(Mtableste mtableste){
		return mtablesteMapper.insertSelective(mtableste);
	}
	public int deleteByPrimaryKey(MtablesteKey mtablesteKey){
		return mtablesteMapper.deleteByPrimaryKey(mtablesteKey);
	}
	public Mtableste selectByPrimaryKey(MtablesteKey mtablesteKey){
		return mtablesteMapper.selectByPrimaryKey(mtablesteKey);
	}
	public int updateByPrimaryKeySelective(Mtableste mtableste){
		return mtablesteMapper.updateByPrimaryKeySelective(mtableste);
	}
	public int updateByPrimaryKey(Mtableste mtableste){
		return mtablesteMapper.updateByPrimaryKey(mtableste);
	}


}
