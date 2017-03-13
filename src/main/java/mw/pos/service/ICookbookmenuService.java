package mw.pos.service;

import com.pos.entity.*;

public interface ICookbookmenuService {
	int insert(cookbookmenu cookbookmenu);
	cookbookmenu selectByPrimaryKey(cookbookmenuKey cookbookmenuKey);
	int updateByPrimaryKeySelective(cookbookmenu cookbookmenu);
	int deleteByPrimaryKey(cookbookmenuKey cookbookmenuKey);
	int updateByPrimaryKey(cookbookmenu cookbookmenu);
	int insertSelective(cookbookmenu cookbookmenu);

}
