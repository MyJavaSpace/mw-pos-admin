package mw.pos.service;

import com.pos.entity.*;

public interface IMenuingredgprelService {
	int insert(menuingredgprel menuingredgprel);
	menuingredgprel selectByPrimaryKey(menuingredgprelKey menuingredgprelKey);
	int updateByPrimaryKeySelective(menuingredgprel menuingredgprel);
	int deleteByPrimaryKey(menuingredgprelKey menuingredgprelKey);
	int updateByPrimaryKey(menuingredgprel menuingredgprel);
	int insertSelective(menuingredgprel menuingredgprel);

}
