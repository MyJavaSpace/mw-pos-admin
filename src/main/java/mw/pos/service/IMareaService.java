package mw.pos.service;

import com.pos.entity.*;

public interface IMareaService {
	int insert(Marea marea);
	int deleteByPrimaryKey(MareaKey mareaKey);
	int updateByPrimaryKey(Marea marea);
	Marea selectByPrimaryKey(MareaKey mareaKey);
	int insertSelective(Marea marea);
	int updateByPrimaryKeySelective(Marea marea);

}
