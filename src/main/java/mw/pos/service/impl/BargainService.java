package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("bargainService")
public class BargainService implements IBargainService {
	@Resource
	private bargainMapper bargainMapper;

	public int insert(bargain bargain){
		return bargainMapper.insert(bargain);
	}
	public int insertSelective(bargain bargain){
		return bargainMapper.insertSelective(bargain);
	}
	public bargain selectByPrimaryKey(bargainKey bargainKey){
		return bargainMapper.selectByPrimaryKey(bargainKey);
	}
	public int deleteByPrimaryKey(bargainKey bargainKey){
		return bargainMapper.deleteByPrimaryKey(bargainKey);
	}
	public int updateByPrimaryKeySelective(bargain bargain){
		return bargainMapper.updateByPrimaryKeySelective(bargain);
	}
	public int updateByPrimaryKey(bargain bargain){
		return bargainMapper.updateByPrimaryKey(bargain);
	}


}
