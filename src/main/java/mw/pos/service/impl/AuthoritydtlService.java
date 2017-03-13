package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("authoritydtlService")
public class AuthoritydtlService implements IAuthoritydtlService {
	@Resource
	private authoritydtlMapper authoritydtlMapper;

	public int insert(authoritydtl authoritydtl){
		return authoritydtlMapper.insert(authoritydtl);
	}
	public int insertSelective(authoritydtl authoritydtl){
		return authoritydtlMapper.insertSelective(authoritydtl);
	}
	public authoritydtl selectByPrimaryKey(authoritydtlKey authoritydtlKey){
		return authoritydtlMapper.selectByPrimaryKey(authoritydtlKey);
	}
	public int deleteByPrimaryKey(authoritydtlKey authoritydtlKey){
		return authoritydtlMapper.deleteByPrimaryKey(authoritydtlKey);
	}
	public int updateByPrimaryKeySelective(authoritydtl authoritydtl){
		return authoritydtlMapper.updateByPrimaryKeySelective(authoritydtl);
	}
	public int updateByPrimaryKey(authoritydtl authoritydtl){
		return authoritydtlMapper.updateByPrimaryKey(authoritydtl);
	}


}
