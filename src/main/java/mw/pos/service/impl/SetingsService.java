package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("setingsService")
public class SetingsService implements ISetingsService {
	@Resource
	private setingsMapper setingsMapper;

	public int insert(setings setings){
		return setingsMapper.insert(setings);
	}
	public int insertSelective(setings setings){
		return setingsMapper.insertSelective(setings);
	}
	public setings selectByPrimaryKey(String string){
		return setingsMapper.selectByPrimaryKey(string);
	}
	public int deleteByPrimaryKey(String string){
		return setingsMapper.deleteByPrimaryKey(string);
	}
	public int updateByPrimaryKeySelective(setings setings){
		return setingsMapper.updateByPrimaryKeySelective(setings);
	}
	public int updateByPrimaryKey(setings setings){
		return setingsMapper.updateByPrimaryKey(setings);
	}


}
