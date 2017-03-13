package mw.pos.service;

import com.pos.entity.*;

public interface IParamvalueService {
	int insert(paramvalue paramvalue);
	paramvalue selectByPrimaryKey(paramvalueKey paramvalueKey);
	int updateByPrimaryKeySelective(paramvalue paramvalue);
	int deleteByPrimaryKey(paramvalueKey paramvalueKey);
	int updateByPrimaryKey(paramvalue paramvalue);
	int insertSelective(paramvalue paramvalue);

}
