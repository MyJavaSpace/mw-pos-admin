package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("sellhurryitemService")
public class SellhurryitemService implements ISellhurryitemService {
	@Resource
	private SellhurryitemMapper sellhurryitemMapper;

	public int insert(Sellhurryitem sellhurryitem){
		return sellhurryitemMapper.insert(sellhurryitem);
	}
	public int insertSelective(Sellhurryitem sellhurryitem){
		return sellhurryitemMapper.insertSelective(sellhurryitem);
	}
	public int deleteByPrimaryKey(SellhurryitemKey sellhurryitemKey){
		return sellhurryitemMapper.deleteByPrimaryKey(sellhurryitemKey);
	}
	public Sellhurryitem selectByPrimaryKey(SellhurryitemKey sellhurryitemKey){
		return sellhurryitemMapper.selectByPrimaryKey(sellhurryitemKey);
	}
	public int updateByPrimaryKeySelective(Sellhurryitem sellhurryitem){
		return sellhurryitemMapper.updateByPrimaryKeySelective(sellhurryitem);
	}
	public int updateByPrimaryKey(Sellhurryitem sellhurryitem){
		return sellhurryitemMapper.updateByPrimaryKey(sellhurryitem);
	}


}
