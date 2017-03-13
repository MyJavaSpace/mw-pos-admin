package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("sellreceiveService")
public class SellreceiveService implements ISellreceiveService {
	@Resource
	private sellreceiveMapper sellreceiveMapper;

	public int insert(sellreceive sellreceive){
		return sellreceiveMapper.insert(sellreceive);
	}
	public int insertSelective(sellreceive sellreceive){
		return sellreceiveMapper.insertSelective(sellreceive);
	}
	public sellreceive selectByPrimaryKey(sellreceiveKey sellreceiveKey){
		return sellreceiveMapper.selectByPrimaryKey(sellreceiveKey);
	}
	public int deleteByPrimaryKey(sellreceiveKey sellreceiveKey){
		return sellreceiveMapper.deleteByPrimaryKey(sellreceiveKey);
	}
	public int updateByPrimaryKeySelective(sellreceive sellreceive){
		return sellreceiveMapper.updateByPrimaryKeySelective(sellreceive);
	}
	public int updateByPrimaryKey(sellreceive sellreceive){
		return sellreceiveMapper.updateByPrimaryKey(sellreceive);
	}
	public int updateByPrimaryKeyWithBLOBs(sellreceive sellreceive){
		return sellreceiveMapper.updateByPrimaryKeyWithBLOBs(sellreceive);
	}


}
