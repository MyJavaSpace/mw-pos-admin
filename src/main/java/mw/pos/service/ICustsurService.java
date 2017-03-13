package mw.pos.service;

import com.pos.entity.*;

public interface ICustsurService {
	int insert(custsur custsur);
	custsur selectByPrimaryKey(custsurKey custsurKey);
	int updateByPrimaryKeySelective(custsur custsur);
	int deleteByPrimaryKey(custsurKey custsurKey);
	int updateByPrimaryKey(custsur custsur);
	int insertSelective(custsur custsur);

}
