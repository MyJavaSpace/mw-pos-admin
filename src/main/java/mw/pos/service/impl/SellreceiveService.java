package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("sellreceiveService")
public class SellreceiveService implements ISellreceiveService {
	@Resource
	private SellreceiveMapper sellreceiveMapper;

	public int insert(Sellreceive sellreceive){
		return sellreceiveMapper.insert(sellreceive);
	}
	public int insertSelective(Sellreceive sellreceive){
		return sellreceiveMapper.insertSelective(sellreceive);
	}
	public int deleteByPrimaryKey(SellreceiveKey sellreceiveKey){
		return sellreceiveMapper.deleteByPrimaryKey(sellreceiveKey);
	}
	public Sellreceive selectByPrimaryKey(SellreceiveKey sellreceiveKey){
		return sellreceiveMapper.selectByPrimaryKey(sellreceiveKey);
	}
	public int updateByPrimaryKeySelective(Sellreceive sellreceive){
		return sellreceiveMapper.updateByPrimaryKeySelective(sellreceive);
	}
	public int updateByPrimaryKey(Sellreceive sellreceive){
		return sellreceiveMapper.updateByPrimaryKey(sellreceive);
	}
	public int updateByPrimaryKeyWithBLOBs(Sellreceive sellreceive){
		return sellreceiveMapper.updateByPrimaryKeyWithBLOBs(sellreceive);
	}


}
