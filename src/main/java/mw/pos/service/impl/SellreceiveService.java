package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("SellreceiveService")
public class SellreceiveService implements ISellreceiveService {
	@Resource
	private SellreceiveMapper SellreceiveMapper;

	public int insert(Sellreceive sellreceive){
		return SellreceiveMapper.insert(sellreceive);
	}
	public int insertSelective(Sellreceive sellreceive){
		return SellreceiveMapper.insertSelective(sellreceive);
	}
	public int deleteByPrimaryKey(SellreceiveKey sellreceiveKey){
		return SellreceiveMapper.deleteByPrimaryKey(sellreceiveKey);
	}
	public Sellreceive selectByPrimaryKey(SellreceiveKey sellreceiveKey){
		return SellreceiveMapper.selectByPrimaryKey(sellreceiveKey);
	}
	public int updateByPrimaryKey(Sellreceive sellreceive){
		return SellreceiveMapper.updateByPrimaryKey(sellreceive);
	}
	public int updateByPrimaryKeySelective(Sellreceive sellreceive){
		return SellreceiveMapper.updateByPrimaryKeySelective(sellreceive);
	}
	public int updateByPrimaryKeyWithBLOBs(Sellreceive sellreceive){
		return SellreceiveMapper.updateByPrimaryKeyWithBLOBs(sellreceive);
	}


}
