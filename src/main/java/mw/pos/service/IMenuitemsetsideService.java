package mw.pos.service;

import com.pos.entity.*;

public interface IMenuitemsetsideService {
	int insert(Menuitemsetside menuitemsetside);
	int deleteByPrimaryKey(MenuitemsetsideKey menuitemsetsideKey);
	int updateByPrimaryKey(Menuitemsetside menuitemsetside);
	Menuitemsetside selectByPrimaryKey(MenuitemsetsideKey menuitemsetsideKey);
	int insertSelective(Menuitemsetside menuitemsetside);
	int updateByPrimaryKeySelective(Menuitemsetside menuitemsetside);

}
