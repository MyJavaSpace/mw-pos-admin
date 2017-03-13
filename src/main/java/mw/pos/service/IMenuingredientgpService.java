package mw.pos.service;

import com.pos.entity.*;

public interface IMenuingredientgpService {
	int insert(Menuingredientgp menuingredientgp);
	int deleteByPrimaryKey(MenuingredientgpKey menuingredientgpKey);
	int updateByPrimaryKey(Menuingredientgp menuingredientgp);
	Menuingredientgp selectByPrimaryKey(MenuingredientgpKey menuingredientgpKey);
	int insertSelective(Menuingredientgp menuingredientgp);
	int updateByPrimaryKeySelective(Menuingredientgp menuingredientgp);

}
