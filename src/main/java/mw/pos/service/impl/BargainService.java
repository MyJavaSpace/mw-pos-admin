package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("BargainService")
public class BargainService implements IBargainService {
	@Resource
	private BargainMapper BargainMapper;

	public int insert(Bargain bargain){
		return BargainMapper.insert(bargain);
	}
	public int insertSelective(Bargain bargain){
		return BargainMapper.insertSelective(bargain);
	}
	public int deleteByPrimaryKey(BargainKey bargainKey){
		return BargainMapper.deleteByPrimaryKey(bargainKey);
	}
	public Bargain selectByPrimaryKey(BargainKey bargainKey){
		return BargainMapper.selectByPrimaryKey(bargainKey);
	}
	public int updateByPrimaryKey(Bargain bargain){
		return BargainMapper.updateByPrimaryKey(bargain);
	}
	public int updateByPrimaryKeySelective(Bargain bargain){
		return BargainMapper.updateByPrimaryKeySelective(bargain);
	}


}
