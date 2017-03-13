package mw.pos.service;

import com.pos.entity.*;

public interface ITableinfoService {
	int insert(Tableinfo tableinfo);
	int deleteByPrimaryKey(TableinfoKey tableinfoKey);
	int updateByPrimaryKey(Tableinfo tableinfo);
	Tableinfo selectByPrimaryKey(TableinfoKey tableinfoKey);
	int insertSelective(Tableinfo tableinfo);
	int updateByPrimaryKeySelective(Tableinfo tableinfo);

}
