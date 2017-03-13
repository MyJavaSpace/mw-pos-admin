package mw.pos.service;

import com.pos.entity.*;

public interface ICustsurService {
	int insert(Custsur custsur);
	int deleteByPrimaryKey(CustsurKey custsurKey);
	int updateByPrimaryKey(Custsur custsur);
	Custsur selectByPrimaryKey(CustsurKey custsurKey);
	int insertSelective(Custsur custsur);
	int updateByPrimaryKeySelective(Custsur custsur);

}
