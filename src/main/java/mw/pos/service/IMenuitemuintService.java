package mw.pos.service;

import com.pos.entity.*;

public interface IMenuitemuintService {
	int insert(Menuitemuint menuitemuint);
	int deleteByPrimaryKey(Integer integer);
	int updateByPrimaryKey(Menuitemuint menuitemuint);
	Menuitemuint selectByPrimaryKey(Integer integer);
	int insertSelective(Menuitemuint menuitemuint);
	int updateByPrimaryKeySelective(Menuitemuint menuitemuint);

}
