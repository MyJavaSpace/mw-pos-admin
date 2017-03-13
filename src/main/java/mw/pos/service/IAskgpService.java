package mw.pos.service;

import com.pos.entity.*;

public interface IAskgpService {
	int insert(askgp askgp);
	askgp selectByPrimaryKey(askgpKey askgpKey);
	int updateByPrimaryKeySelective(askgp askgp);
	int deleteByPrimaryKey(askgpKey askgpKey);
	int updateByPrimaryKey(askgp askgp);
	int insertSelective(askgp askgp);

}
