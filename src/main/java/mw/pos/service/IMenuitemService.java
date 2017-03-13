package mw.pos.service;

import com.pos.entity.*;

public interface IMenuitemService {
	int insert(menuitem menuitem);
	menuitem selectByPrimaryKey(menuitemKey menuitemKey);
	int updateByPrimaryKeySelective(menuitem menuitem);
	int deleteByPrimaryKey(menuitemKey menuitemKey);
	int updateByPrimaryKey(menuitem menuitem);
	int insertSelective(menuitem menuitem);

}
