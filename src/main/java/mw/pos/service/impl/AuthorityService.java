package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("authorityService")
public class AuthorityService implements IAuthorityService {
	@Resource
	private authorityMapper authorityMapper;

	public int insert(authority authority){
		return authorityMapper.insert(authority);
	}
	public int insertSelective(authority authority){
		return authorityMapper.insertSelective(authority);
	}
	public authority selectByPrimaryKey(authorityKey authorityKey){
		return authorityMapper.selectByPrimaryKey(authorityKey);
	}
	public int deleteByPrimaryKey(authorityKey authorityKey){
		return authorityMapper.deleteByPrimaryKey(authorityKey);
	}
	public int updateByPrimaryKeySelective(authority authority){
		return authorityMapper.updateByPrimaryKeySelective(authority);
	}
	public int updateByPrimaryKey(authority authority){
		return authorityMapper.updateByPrimaryKey(authority);
	}


}
