package mw.pos.service;

import com.pos.entity.*;

public interface IParamvalueService {
	int insert(Paramvalue paramvalue);
	int deleteByPrimaryKey(ParamvalueKey paramvalueKey);
	int updateByPrimaryKey(Paramvalue paramvalue);
	Paramvalue selectByPrimaryKey(ParamvalueKey paramvalueKey);
	int insertSelective(Paramvalue paramvalue);
	int updateByPrimaryKeySelective(Paramvalue paramvalue);

}
