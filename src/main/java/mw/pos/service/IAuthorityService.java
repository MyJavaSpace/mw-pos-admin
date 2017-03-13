package mw.pos.service;

import com.pos.entity.*;

public interface IAuthorityService {
	int insert(Authority authority);
	int deleteByPrimaryKey(AuthorityKey authorityKey);
	int updateByPrimaryKey(Authority authority);
	Authority selectByPrimaryKey(AuthorityKey authorityKey);
	int insertSelective(Authority authority);
	int updateByPrimaryKeySelective(Authority authority);

}
