package mw.pos.service;

import com.pos.entity.*;

public interface ICookbookService {
	int insert(Cookbook cookbook);
	int deleteByPrimaryKey(CookbookKey cookbookKey);
	int updateByPrimaryKey(Cookbook cookbook);
	Cookbook selectByPrimaryKey(CookbookKey cookbookKey);
	int insertSelective(Cookbook cookbook);
	int updateByPrimaryKeySelective(Cookbook cookbook);

}
