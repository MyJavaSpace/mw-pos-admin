package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("SellhurryitemService")
public class SellhurryitemService implements ISellhurryitemService {
	@Resource
	private SellhurryitemMapper SellhurryitemMapper;

	public int insert(Sellhurryitem sellhurryitem){
		return SellhurryitemMapper.insert(sellhurryitem);
	}
	public int insertSelective(Sellhurryitem sellhurryitem){
		return SellhurryitemMapper.insertSelective(sellhurryitem);
	}
	public int deleteByPrimaryKey(SellhurryitemKey sellhurryitemKey){
		return SellhurryitemMapper.deleteByPrimaryKey(sellhurryitemKey);
	}
	public Sellhurryitem selectByPrimaryKey(SellhurryitemKey sellhurryitemKey){
		return SellhurryitemMapper.selectByPrimaryKey(sellhurryitemKey);
	}
	public int updateByPrimaryKey(Sellhurryitem sellhurryitem){
		return SellhurryitemMapper.updateByPrimaryKey(sellhurryitem);
	}
	public int updateByPrimaryKeySelective(Sellhurryitem sellhurryitem){
		return SellhurryitemMapper.updateByPrimaryKeySelective(sellhurryitem);
	}


}
