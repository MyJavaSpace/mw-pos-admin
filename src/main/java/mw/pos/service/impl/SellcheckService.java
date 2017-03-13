package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("sellcheckService")
public class SellcheckService implements ISellcheckService {
	@Resource
	private SellcheckMapper sellcheckMapper;

	public int insert(Sellcheck sellcheck){
		return sellcheckMapper.insert(sellcheck);
	}
	public int insertSelective(Sellcheck sellcheck){
		return sellcheckMapper.insertSelective(sellcheck);
	}
	public int deleteByPrimaryKey(SellcheckKey sellcheckKey){
		return sellcheckMapper.deleteByPrimaryKey(sellcheckKey);
	}
	public Sellcheck selectByPrimaryKey(SellcheckKey sellcheckKey){
		return sellcheckMapper.selectByPrimaryKey(sellcheckKey);
	}
	public int updateByPrimaryKeySelective(Sellcheck sellcheck){
		return sellcheckMapper.updateByPrimaryKeySelective(sellcheck);
	}
	public int updateByPrimaryKey(Sellcheck sellcheck){
		return sellcheckMapper.updateByPrimaryKey(sellcheck);
	}


}
