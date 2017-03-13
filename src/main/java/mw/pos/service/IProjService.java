package mw.pos.service;

import com.pos.entity.*;

public interface IProjService {
	int insert(proj proj);
	proj selectByPrimaryKey(String string);
	int updateByPrimaryKeySelective(proj proj);
	int deleteByPrimaryKey(String string);
	int updateByPrimaryKey(proj proj);
	int insertSelective(proj proj);

}
