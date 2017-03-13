package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("TableinfoService")
public class TableinfoService implements ITableinfoService {
	@Resource
	private TableinfoMapper TableinfoMapper;

	public int insert(Tableinfo tableinfo){
		return TableinfoMapper.insert(tableinfo);
	}
	public int insertSelective(Tableinfo tableinfo){
		return TableinfoMapper.insertSelective(tableinfo);
	}
	public int deleteByPrimaryKey(TableinfoKey tableinfoKey){
		return TableinfoMapper.deleteByPrimaryKey(tableinfoKey);
	}
	public Tableinfo selectByPrimaryKey(TableinfoKey tableinfoKey){
		return TableinfoMapper.selectByPrimaryKey(tableinfoKey);
	}
	public int updateByPrimaryKey(Tableinfo tableinfo){
		return TableinfoMapper.updateByPrimaryKey(tableinfo);
	}
	public int updateByPrimaryKeySelective(Tableinfo tableinfo){
		return TableinfoMapper.updateByPrimaryKeySelective(tableinfo);
	}


}
