package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("MtablesteService")
public class MtablesteService implements IMtablesteService {
	@Resource
	private MtablesteMapper MtablesteMapper;

	public int insert(Mtableste mtableste){
		return MtablesteMapper.insert(mtableste);
	}
	public int insertSelective(Mtableste mtableste){
		return MtablesteMapper.insertSelective(mtableste);
	}
	public int deleteByPrimaryKey(MtablesteKey mtablesteKey){
		return MtablesteMapper.deleteByPrimaryKey(mtablesteKey);
	}
	public Mtableste selectByPrimaryKey(MtablesteKey mtablesteKey){
		return MtablesteMapper.selectByPrimaryKey(mtablesteKey);
	}
	public int updateByPrimaryKey(Mtableste mtableste){
		return MtablesteMapper.updateByPrimaryKey(mtableste);
	}
	public int updateByPrimaryKeySelective(Mtableste mtableste){
		return MtablesteMapper.updateByPrimaryKeySelective(mtableste);
	}


}
