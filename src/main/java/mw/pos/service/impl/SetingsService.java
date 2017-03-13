package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("setingsService")
public class SetingsService implements ISetingsService {
	@Resource
	private SetingsMapper setingsMapper;

	public int insert(Setings setings){
		return setingsMapper.insert(setings);
	}
	public int insertSelective(Setings setings){
		return setingsMapper.insertSelective(setings);
	}
	public int deleteByPrimaryKey(String string){
		return setingsMapper.deleteByPrimaryKey(string);
	}
	public Setings selectByPrimaryKey(String string){
		return setingsMapper.selectByPrimaryKey(string);
	}
	public int updateByPrimaryKeySelective(Setings setings){
		return setingsMapper.updateByPrimaryKeySelective(setings);
	}
	public int updateByPrimaryKey(Setings setings){
		return setingsMapper.updateByPrimaryKey(setings);
	}


}
