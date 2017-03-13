package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("sellhurryService")
public class SellhurryService implements ISellhurryService {
	@Resource
	private sellhurryMapper sellhurryMapper;

	public int insert(sellhurry sellhurry){
		return sellhurryMapper.insert(sellhurry);
	}
	public int insertSelective(sellhurry sellhurry){
		return sellhurryMapper.insertSelective(sellhurry);
	}
	public sellhurry selectByPrimaryKey(sellhurryKey sellhurryKey){
		return sellhurryMapper.selectByPrimaryKey(sellhurryKey);
	}
	public int deleteByPrimaryKey(sellhurryKey sellhurryKey){
		return sellhurryMapper.deleteByPrimaryKey(sellhurryKey);
	}
	public int updateByPrimaryKeySelective(sellhurry sellhurry){
		return sellhurryMapper.updateByPrimaryKeySelective(sellhurry);
	}
	public int updateByPrimaryKey(sellhurry sellhurry){
		return sellhurryMapper.updateByPrimaryKey(sellhurry);
	}


}
