package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("tableinfoService")
public class TableinfoService implements ITableinfoService {
	@Resource
	private tableinfoMapper tableinfoMapper;

	public int insert(tableinfo tableinfo){
		return tableinfoMapper.insert(tableinfo);
	}
	public int insertSelective(tableinfo tableinfo){
		return tableinfoMapper.insertSelective(tableinfo);
	}
	public tableinfo selectByPrimaryKey(tableinfoKey tableinfoKey){
		return tableinfoMapper.selectByPrimaryKey(tableinfoKey);
	}
	public int deleteByPrimaryKey(tableinfoKey tableinfoKey){
		return tableinfoMapper.deleteByPrimaryKey(tableinfoKey);
	}
	public int updateByPrimaryKeySelective(tableinfo tableinfo){
		return tableinfoMapper.updateByPrimaryKeySelective(tableinfo);
	}
	public int updateByPrimaryKey(tableinfo tableinfo){
		return tableinfoMapper.updateByPrimaryKey(tableinfo);
	}


}
