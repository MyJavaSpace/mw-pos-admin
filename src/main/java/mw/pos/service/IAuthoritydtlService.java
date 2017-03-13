package mw.pos.service;

import com.pos.entity.*;

public interface IAuthoritydtlService {
	int insert(Authoritydtl authoritydtl);
	int deleteByPrimaryKey(AuthoritydtlKey authoritydtlKey);
	int updateByPrimaryKey(Authoritydtl authoritydtl);
	Authoritydtl selectByPrimaryKey(AuthoritydtlKey authoritydtlKey);
	int insertSelective(Authoritydtl authoritydtl);
	int updateByPrimaryKeySelective(Authoritydtl authoritydtl);

}
