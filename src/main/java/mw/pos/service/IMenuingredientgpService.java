package mw.pos.service;

import com.pos.entity.*;

public interface IMenuingredientgpService {
	int insert(menuingredientgp menuingredientgp);
	menuingredientgp selectByPrimaryKey(menuingredientgpKey menuingredientgpKey);
	int updateByPrimaryKeySelective(menuingredientgp menuingredientgp);
	int deleteByPrimaryKey(menuingredientgpKey menuingredientgpKey);
	int updateByPrimaryKey(menuingredientgp menuingredientgp);
	int insertSelective(menuingredientgp menuingredientgp);

}
