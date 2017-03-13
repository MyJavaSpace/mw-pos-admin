package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("bargainService")
public class BargainService implements IBargainService {
	@Resource
	private BargainMapper bargainMapper;

	public int insert(Bargain bargain){
		return bargainMapper.insert(bargain);
	}
	public int insertSelective(Bargain bargain){
		return bargainMapper.insertSelective(bargain);
	}
	public int deleteByPrimaryKey(BargainKey bargainKey){
		return bargainMapper.deleteByPrimaryKey(bargainKey);
	}
	public Bargain selectByPrimaryKey(BargainKey bargainKey){
		return bargainMapper.selectByPrimaryKey(bargainKey);
	}
	public int updateByPrimaryKeySelective(Bargain bargain){
		return bargainMapper.updateByPrimaryKeySelective(bargain);
	}
	public int updateByPrimaryKey(Bargain bargain){
		return bargainMapper.updateByPrimaryKey(bargain);
	}


}
