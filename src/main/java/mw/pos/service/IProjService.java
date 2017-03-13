package mw.pos.service;

import com.pos.entity.*;

public interface IProjService {
	int insert(Proj proj);
	int deleteByPrimaryKey(String string);
	int updateByPrimaryKey(Proj proj);
	Proj selectByPrimaryKey(String string);
	int insertSelective(Proj proj);
	int updateByPrimaryKeySelective(Proj proj);

}
