package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("AuthorityService")
public class AuthorityService implements IAuthorityService {
	@Resource
	private AuthorityMapper AuthorityMapper;

	public int insert(Authority authority){
		return AuthorityMapper.insert(authority);
	}
	public int insertSelective(Authority authority){
		return AuthorityMapper.insertSelective(authority);
	}
	public int deleteByPrimaryKey(AuthorityKey authorityKey){
		return AuthorityMapper.deleteByPrimaryKey(authorityKey);
	}
	public Authority selectByPrimaryKey(AuthorityKey authorityKey){
		return AuthorityMapper.selectByPrimaryKey(authorityKey);
	}
	public int updateByPrimaryKey(Authority authority){
		return AuthorityMapper.updateByPrimaryKey(authority);
	}
	public int updateByPrimaryKeySelective(Authority authority){
		return AuthorityMapper.updateByPrimaryKeySelective(authority);
	}


}
