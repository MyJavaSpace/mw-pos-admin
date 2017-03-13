package mw.pos.service;

import com.pos.entity.*;

public interface IAuthoritydtlService {
	int insert(authoritydtl authoritydtl);
	authoritydtl selectByPrimaryKey(authoritydtlKey authoritydtlKey);
	int updateByPrimaryKeySelective(authoritydtl authoritydtl);
	int deleteByPrimaryKey(authoritydtlKey authoritydtlKey);
	int updateByPrimaryKey(authoritydtl authoritydtl);
	int insertSelective(authoritydtl authoritydtl);

}
