package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("sellcheckService")
public class SellcheckService implements ISellcheckService {
	@Resource
	private sellcheckMapper sellcheckMapper;

	public int insert(sellcheck sellcheck){
		return sellcheckMapper.insert(sellcheck);
	}
	public int insertSelective(sellcheck sellcheck){
		return sellcheckMapper.insertSelective(sellcheck);
	}
	public sellcheck selectByPrimaryKey(sellcheckKey sellcheckKey){
		return sellcheckMapper.selectByPrimaryKey(sellcheckKey);
	}
	public int deleteByPrimaryKey(sellcheckKey sellcheckKey){
		return sellcheckMapper.deleteByPrimaryKey(sellcheckKey);
	}
	public int updateByPrimaryKeySelective(sellcheck sellcheck){
		return sellcheckMapper.updateByPrimaryKeySelective(sellcheck);
	}
	public int updateByPrimaryKey(sellcheck sellcheck){
		return sellcheckMapper.updateByPrimaryKey(sellcheck);
	}


}
