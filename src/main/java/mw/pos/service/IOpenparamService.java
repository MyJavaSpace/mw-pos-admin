package mw.pos.service;

import com.pos.entity.*;

public interface IOpenparamService {
	int insert(Openparam openparam);
	int deleteByPrimaryKey(Integer integer);
	int updateByPrimaryKey(Openparam openparam);
	Openparam selectByPrimaryKey(Integer integer);
	int insertSelective(Openparam openparam);
	int updateByPrimaryKeySelective(Openparam openparam);

}
