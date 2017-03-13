package mw.pos.service;

import com.pos.entity.*;

public interface IMenuitemsetsideService {
	int insert(menuitemsetside menuitemsetside);
	menuitemsetside selectByPrimaryKey(menuitemsetsideKey menuitemsetsideKey);
	int updateByPrimaryKeySelective(menuitemsetside menuitemsetside);
	int deleteByPrimaryKey(menuitemsetsideKey menuitemsetsideKey);
	int updateByPrimaryKey(menuitemsetside menuitemsetside);
	int insertSelective(menuitemsetside menuitemsetside);

}
