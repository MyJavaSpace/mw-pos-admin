package mw.pos.service;

import com.pos.entity.*;

public interface IParamService {
	int insert(param param);
	param selectByPrimaryKey(String string);
	int updateByPrimaryKeySelective(param param);
	int deleteByPrimaryKey(String string);
	int updateByPrimaryKey(param param);
	int insertSelective(param param);

}
