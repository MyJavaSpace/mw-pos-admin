package mw.pos.service;

import com.pos.entity.*;

public interface IMenuitemuintService {
	int insert(menuitemuint menuitemuint);
	menuitemuint selectByPrimaryKey(Integer integer);
	int updateByPrimaryKeySelective(menuitemuint menuitemuint);
	int deleteByPrimaryKey(Integer integer);
	int updateByPrimaryKey(menuitemuint menuitemuint);
	int insertSelective(menuitemuint menuitemuint);

}
