package mw.pos.service;

import com.pos.entity.*;

public interface IMenuingredgprelService {
	int insert(Menuingredgprel menuingredgprel);
	int deleteByPrimaryKey(MenuingredgprelKey menuingredgprelKey);
	int updateByPrimaryKey(Menuingredgprel menuingredgprel);
	Menuingredgprel selectByPrimaryKey(MenuingredgprelKey menuingredgprelKey);
	int insertSelective(Menuingredgprel menuingredgprel);
	int updateByPrimaryKeySelective(Menuingredgprel menuingredgprel);

}
