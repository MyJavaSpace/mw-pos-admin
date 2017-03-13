package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("SellcheckService")
public class SellcheckService implements ISellcheckService {
	@Resource
	private SellcheckMapper SellcheckMapper;

	public int insert(Sellcheck sellcheck){
		return SellcheckMapper.insert(sellcheck);
	}
	public int insertSelective(Sellcheck sellcheck){
		return SellcheckMapper.insertSelective(sellcheck);
	}
	public int deleteByPrimaryKey(SellcheckKey sellcheckKey){
		return SellcheckMapper.deleteByPrimaryKey(sellcheckKey);
	}
	public Sellcheck selectByPrimaryKey(SellcheckKey sellcheckKey){
		return SellcheckMapper.selectByPrimaryKey(sellcheckKey);
	}
	public int updateByPrimaryKey(Sellcheck sellcheck){
		return SellcheckMapper.updateByPrimaryKey(sellcheck);
	}
	public int updateByPrimaryKeySelective(Sellcheck sellcheck){
		return SellcheckMapper.updateByPrimaryKeySelective(sellcheck);
	}


}
