package mw.pos.service;

import com.pos.entity.*;

public interface ICookbookmenuService {
	int insert(Cookbookmenu cookbookmenu);
	int deleteByPrimaryKey(CookbookmenuKey cookbookmenuKey);
	int updateByPrimaryKey(Cookbookmenu cookbookmenu);
	Cookbookmenu selectByPrimaryKey(CookbookmenuKey cookbookmenuKey);
	int insertSelective(Cookbookmenu cookbookmenu);
	int updateByPrimaryKeySelective(Cookbookmenu cookbookmenu);

}
