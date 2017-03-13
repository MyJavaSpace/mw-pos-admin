package mw.pos.service;

import com.pos.entity.*;

public interface IMareaService {
	int insert(marea marea);
	marea selectByPrimaryKey(mareaKey mareaKey);
	int updateByPrimaryKeySelective(marea marea);
	int deleteByPrimaryKey(mareaKey mareaKey);
	int updateByPrimaryKey(marea marea);
	int insertSelective(marea marea);

}
