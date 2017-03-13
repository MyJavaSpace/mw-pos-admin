package mw.pos.service;

import com.pos.entity.*;

public interface ICuststeService {
	int insert(Custste custste);
	int deleteByPrimaryKey(CuststeKey custsteKey);
	int updateByPrimaryKey(Custste custste);
	Custste selectByPrimaryKey(CuststeKey custsteKey);
	int insertSelective(Custste custste);
	int updateByPrimaryKeySelective(Custste custste);

}
