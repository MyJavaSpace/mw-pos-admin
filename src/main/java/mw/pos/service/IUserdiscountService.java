package mw.pos.service;

import com.pos.entity.*;

public interface IUserdiscountService {
	int insert(userdiscount userdiscount);
	userdiscount selectByPrimaryKey(userdiscountKey userdiscountKey);
	int updateByPrimaryKeySelective(userdiscount userdiscount);
	int deleteByPrimaryKey(userdiscountKey userdiscountKey);
	int updateByPrimaryKey(userdiscount userdiscount);
	int insertSelective(userdiscount userdiscount);

}
