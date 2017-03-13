package mw.pos.service;

import com.pos.entity.*;

public interface IExpclsService {
	int insert(expcls expcls);
	expcls selectByPrimaryKey(expclsKey expclsKey);
	int updateByPrimaryKeySelective(expcls expcls);
	int deleteByPrimaryKey(expclsKey expclsKey);
	int updateByPrimaryKey(expcls expcls);
	int insertSelective(expcls expcls);

}
