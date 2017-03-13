package mw.pos.service;

import com.pos.entity.*;

public interface IMenuclsService {
	int insert(Menucls menucls);
	int deleteByPrimaryKey(MenuclsKey menuclsKey);
	int updateByPrimaryKey(Menucls menucls);
	Menucls selectByPrimaryKey(MenuclsKey menuclsKey);
	int insertSelective(Menucls menucls);
	int updateByPrimaryKeySelective(Menucls menucls);

}
