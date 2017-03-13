package mw.pos.service;

import com.pos.entity.*;

public interface IMenuingredientService {
	int insert(menuingredient menuingredient);
	menuingredient selectByPrimaryKey(menuingredientKey menuingredientKey);
	int updateByPrimaryKeySelective(menuingredient menuingredient);
	int deleteByPrimaryKey(menuingredientKey menuingredientKey);
	int updateByPrimaryKey(menuingredient menuingredient);
	int insertSelective(menuingredient menuingredient);

}
