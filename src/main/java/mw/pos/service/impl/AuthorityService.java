package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("authorityService")
public class AuthorityService implements IAuthorityService {
	@Resource
	private AuthorityMapper authorityMapper;

	public int insert(Authority authority){
		return authorityMapper.insert(authority);
	}
	public int insertSelective(Authority authority){
		return authorityMapper.insertSelective(authority);
	}
	public int deleteByPrimaryKey(AuthorityKey authorityKey){
		return authorityMapper.deleteByPrimaryKey(authorityKey);
	}
	public Authority selectByPrimaryKey(AuthorityKey authorityKey){
		return authorityMapper.selectByPrimaryKey(authorityKey);
	}
	public int updateByPrimaryKeySelective(Authority authority){
		return authorityMapper.updateByPrimaryKeySelective(authority);
	}
	public int updateByPrimaryKey(Authority authority){
		return authorityMapper.updateByPrimaryKey(authority);
	}


}
