package mw.pos.service;

import com.pos.entity.*;

public interface IExpclsService {
	int insert(Expcls expcls);
	int deleteByPrimaryKey(ExpclsKey expclsKey);
	int updateByPrimaryKey(Expcls expcls);
	Expcls selectByPrimaryKey(ExpclsKey expclsKey);
	int insertSelective(Expcls expcls);
	int updateByPrimaryKeySelective(Expcls expcls);

}
