package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("mtablesteService")
public class MtablesteService implements IMtablesteService {
	@Resource
	private mtablesteMapper mtablesteMapper;

	public int insert(mtableste mtableste){
		return mtablesteMapper.insert(mtableste);
	}
	public int insertSelective(mtableste mtableste){
		return mtablesteMapper.insertSelective(mtableste);
	}
	public mtableste selectByPrimaryKey(mtablesteKey mtablesteKey){
		return mtablesteMapper.selectByPrimaryKey(mtablesteKey);
	}
	public int deleteByPrimaryKey(mtablesteKey mtablesteKey){
		return mtablesteMapper.deleteByPrimaryKey(mtablesteKey);
	}
	public int updateByPrimaryKeySelective(mtableste mtableste){
		return mtablesteMapper.updateByPrimaryKeySelective(mtableste);
	}
	public int updateByPrimaryKey(mtableste mtableste){
		return mtablesteMapper.updateByPrimaryKey(mtableste);
	}


}
