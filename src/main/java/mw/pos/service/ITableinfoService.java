package mw.pos.service;

import com.pos.entity.*;

public interface ITableinfoService {
	int insert(tableinfo tableinfo);
	tableinfo selectByPrimaryKey(tableinfoKey tableinfoKey);
	int updateByPrimaryKeySelective(tableinfo tableinfo);
	int deleteByPrimaryKey(tableinfoKey tableinfoKey);
	int updateByPrimaryKey(tableinfo tableinfo);
	int insertSelective(tableinfo tableinfo);

}
