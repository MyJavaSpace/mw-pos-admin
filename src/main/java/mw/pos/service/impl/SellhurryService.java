package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("sellhurryService")
public class SellhurryService implements ISellhurryService {
	@Resource
	private SellhurryMapper sellhurryMapper;

	public int insert(Sellhurry sellhurry){
		return sellhurryMapper.insert(sellhurry);
	}
	public int insertSelective(Sellhurry sellhurry){
		return sellhurryMapper.insertSelective(sellhurry);
	}
	public int deleteByPrimaryKey(SellhurryKey sellhurryKey){
		return sellhurryMapper.deleteByPrimaryKey(sellhurryKey);
	}
	public Sellhurry selectByPrimaryKey(SellhurryKey sellhurryKey){
		return sellhurryMapper.selectByPrimaryKey(sellhurryKey);
	}
	public int updateByPrimaryKeySelective(Sellhurry sellhurry){
		return sellhurryMapper.updateByPrimaryKeySelective(sellhurry);
	}
	public int updateByPrimaryKey(Sellhurry sellhurry){
		return sellhurryMapper.updateByPrimaryKey(sellhurry);
	}


}
