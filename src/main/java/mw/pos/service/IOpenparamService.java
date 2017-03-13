package mw.pos.service;

import com.pos.entity.*;

public interface IOpenparamService {
	int insert(openparam openparam);
	openparam selectByPrimaryKey(Integer integer);
	int updateByPrimaryKeySelective(openparam openparam);
	int deleteByPrimaryKey(Integer integer);
	int updateByPrimaryKey(openparam openparam);
	int insertSelective(openparam openparam);

}
