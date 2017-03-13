package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("AuthoritydtlService")
public class AuthoritydtlService implements IAuthoritydtlService {
	@Resource
	private AuthoritydtlMapper AuthoritydtlMapper;

	public int insert(Authoritydtl authoritydtl){
		return AuthoritydtlMapper.insert(authoritydtl);
	}
	public int insertSelective(Authoritydtl authoritydtl){
		return AuthoritydtlMapper.insertSelective(authoritydtl);
	}
	public int deleteByPrimaryKey(AuthoritydtlKey authoritydtlKey){
		return AuthoritydtlMapper.deleteByPrimaryKey(authoritydtlKey);
	}
	public Authoritydtl selectByPrimaryKey(AuthoritydtlKey authoritydtlKey){
		return AuthoritydtlMapper.selectByPrimaryKey(authoritydtlKey);
	}
	public int updateByPrimaryKey(Authoritydtl authoritydtl){
		return AuthoritydtlMapper.updateByPrimaryKey(authoritydtl);
	}
	public int updateByPrimaryKeySelective(Authoritydtl authoritydtl){
		return AuthoritydtlMapper.updateByPrimaryKeySelective(authoritydtl);
	}


}
