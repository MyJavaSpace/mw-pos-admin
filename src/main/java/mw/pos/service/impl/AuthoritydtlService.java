package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("authoritydtlService")
public class AuthoritydtlService implements IAuthoritydtlService {
	@Resource
	private AuthoritydtlMapper authoritydtlMapper;

	public int insert(Authoritydtl authoritydtl){
		return authoritydtlMapper.insert(authoritydtl);
	}
	public int insertSelective(Authoritydtl authoritydtl){
		return authoritydtlMapper.insertSelective(authoritydtl);
	}
	public int deleteByPrimaryKey(AuthoritydtlKey authoritydtlKey){
		return authoritydtlMapper.deleteByPrimaryKey(authoritydtlKey);
	}
	public Authoritydtl selectByPrimaryKey(AuthoritydtlKey authoritydtlKey){
		return authoritydtlMapper.selectByPrimaryKey(authoritydtlKey);
	}
	public int updateByPrimaryKeySelective(Authoritydtl authoritydtl){
		return authoritydtlMapper.updateByPrimaryKeySelective(authoritydtl);
	}
	public int updateByPrimaryKey(Authoritydtl authoritydtl){
		return authoritydtlMapper.updateByPrimaryKey(authoritydtl);
	}


}
