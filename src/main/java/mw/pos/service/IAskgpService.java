package mw.pos.service;

import com.pos.entity.*;

public interface IAskgpService {
	int insert(Askgp askgp);
	int deleteByPrimaryKey(AskgpKey askgpKey);
	int updateByPrimaryKey(Askgp askgp);
	Askgp selectByPrimaryKey(AskgpKey askgpKey);
	int insertSelective(Askgp askgp);
	int updateByPrimaryKeySelective(Askgp askgp);

}
