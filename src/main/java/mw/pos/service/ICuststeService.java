package mw.pos.service;

import com.pos.entity.*;

public interface ICuststeService {
	int insert(custste custste);
	custste selectByPrimaryKey(custsteKey custsteKey);
	int updateByPrimaryKeySelective(custste custste);
	int deleteByPrimaryKey(custsteKey custsteKey);
	int updateByPrimaryKey(custste custste);
	int insertSelective(custste custste);

}
