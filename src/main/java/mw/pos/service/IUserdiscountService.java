package mw.pos.service;

import com.pos.entity.*;

public interface IUserdiscountService {
	int insert(Userdiscount userdiscount);
	int deleteByPrimaryKey(UserdiscountKey userdiscountKey);
	int updateByPrimaryKey(Userdiscount userdiscount);
	Userdiscount selectByPrimaryKey(UserdiscountKey userdiscountKey);
	int insertSelective(Userdiscount userdiscount);
	int updateByPrimaryKeySelective(Userdiscount userdiscount);

}
