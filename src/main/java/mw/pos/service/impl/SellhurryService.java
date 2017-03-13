package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("SellhurryService")
public class SellhurryService implements ISellhurryService {
	@Resource
	private SellhurryMapper SellhurryMapper;

	public int insert(Sellhurry sellhurry){
		return SellhurryMapper.insert(sellhurry);
	}
	public int insertSelective(Sellhurry sellhurry){
		return SellhurryMapper.insertSelective(sellhurry);
	}
	public int deleteByPrimaryKey(SellhurryKey sellhurryKey){
		return SellhurryMapper.deleteByPrimaryKey(sellhurryKey);
	}
	public Sellhurry selectByPrimaryKey(SellhurryKey sellhurryKey){
		return SellhurryMapper.selectByPrimaryKey(sellhurryKey);
	}
	public int updateByPrimaryKey(Sellhurry sellhurry){
		return SellhurryMapper.updateByPrimaryKey(sellhurry);
	}
	public int updateByPrimaryKeySelective(Sellhurry sellhurry){
		return SellhurryMapper.updateByPrimaryKeySelective(sellhurry);
	}


}
