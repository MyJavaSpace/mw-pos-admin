package mw.pos.service;

import com.pos.entity.*;

public interface IMenuclsService {
	int insert(menucls menucls);
	menucls selectByPrimaryKey(menuclsKey menuclsKey);
	int updateByPrimaryKeySelective(menucls menucls);
	int deleteByPrimaryKey(menuclsKey menuclsKey);
	int updateByPrimaryKey(menucls menucls);
	int insertSelective(menucls menucls);

}
