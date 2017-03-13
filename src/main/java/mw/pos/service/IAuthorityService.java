package mw.pos.service;

import com.pos.entity.*;

public interface IAuthorityService {
	int insert(authority authority);
	authority selectByPrimaryKey(authorityKey authorityKey);
	int updateByPrimaryKeySelective(authority authority);
	int deleteByPrimaryKey(authorityKey authorityKey);
	int updateByPrimaryKey(authority authority);
	int insertSelective(authority authority);

}
