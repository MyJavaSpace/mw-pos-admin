package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("tableinfoService")
public class TableinfoService implements ITableinfoService {
	@Resource
	private TableinfoMapper tableinfoMapper;

	public int insert(Tableinfo tableinfo){
		return tableinfoMapper.insert(tableinfo);
	}
	public int insertSelective(Tableinfo tableinfo){
		return tableinfoMapper.insertSelective(tableinfo);
	}
	public int deleteByPrimaryKey(TableinfoKey tableinfoKey){
		return tableinfoMapper.deleteByPrimaryKey(tableinfoKey);
	}
	public Tableinfo selectByPrimaryKey(TableinfoKey tableinfoKey){
		return tableinfoMapper.selectByPrimaryKey(tableinfoKey);
	}
	public int updateByPrimaryKeySelective(Tableinfo tableinfo){
		return tableinfoMapper.updateByPrimaryKeySelective(tableinfo);
	}
	public int updateByPrimaryKey(Tableinfo tableinfo){
		return tableinfoMapper.updateByPrimaryKey(tableinfo);
	}


}
