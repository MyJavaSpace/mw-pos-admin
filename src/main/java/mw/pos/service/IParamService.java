package mw.pos.service;

import com.pos.entity.*;

public interface IParamService {
	int insert(Param param);
	int deleteByPrimaryKey(String string);
	int updateByPrimaryKey(Param param);
	Param selectByPrimaryKey(String string);
	int insertSelective(Param param);
	int updateByPrimaryKeySelective(Param param);

}
