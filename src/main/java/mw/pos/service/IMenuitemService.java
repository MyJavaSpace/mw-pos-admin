package mw.pos.service;

import com.pos.entity.*;

public interface IMenuitemService {
	int insert(Menuitem menuitem);
	int deleteByPrimaryKey(MenuitemKey menuitemKey);
	int updateByPrimaryKey(Menuitem menuitem);
	Menuitem selectByPrimaryKey(MenuitemKey menuitemKey);
	int insertSelective(Menuitem menuitem);
	int updateByPrimaryKeySelective(Menuitem menuitem);

}
