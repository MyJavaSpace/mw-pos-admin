package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("SetingsService")
public class SetingsService implements ISetingsService {
	@Resource
	private SetingsMapper SetingsMapper;

	public int insert(Setings setings){
		return SetingsMapper.insert(setings);
	}
	public int insertSelective(Setings setings){
		return SetingsMapper.insertSelective(setings);
	}
	public int deleteByPrimaryKey(String string){
		return SetingsMapper.deleteByPrimaryKey(string);
	}
	public Setings selectByPrimaryKey(String string){
		return SetingsMapper.selectByPrimaryKey(string);
	}
	public int updateByPrimaryKey(Setings setings){
		return SetingsMapper.updateByPrimaryKey(setings);
	}
	public int updateByPrimaryKeySelective(Setings setings){
		return SetingsMapper.updateByPrimaryKeySelective(setings);
	}


}
