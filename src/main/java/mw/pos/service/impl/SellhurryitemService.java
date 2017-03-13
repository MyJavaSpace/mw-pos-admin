package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("sellhurryitemService")
public class SellhurryitemService implements ISellhurryitemService {
	@Resource
	private sellhurryitemMapper sellhurryitemMapper;

	public int insert(sellhurryitem sellhurryitem){
		return sellhurryitemMapper.insert(sellhurryitem);
	}
	public int insertSelective(sellhurryitem sellhurryitem){
		return sellhurryitemMapper.insertSelective(sellhurryitem);
	}
	public sellhurryitem selectByPrimaryKey(sellhurryitemKey sellhurryitemKey){
		return sellhurryitemMapper.selectByPrimaryKey(sellhurryitemKey);
	}
	public int deleteByPrimaryKey(sellhurryitemKey sellhurryitemKey){
		return sellhurryitemMapper.deleteByPrimaryKey(sellhurryitemKey);
	}
	public int updateByPrimaryKeySelective(sellhurryitem sellhurryitem){
		return sellhurryitemMapper.updateByPrimaryKeySelective(sellhurryitem);
	}
	public int updateByPrimaryKey(sellhurryitem sellhurryitem){
		return sellhurryitemMapper.updateByPrimaryKey(sellhurryitem);
	}


}
