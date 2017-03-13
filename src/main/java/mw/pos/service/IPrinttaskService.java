package mw.pos.service;

import com.pos.entity.*;

public interface IPrinttaskService {
	int insert(printtaskWithBLOBs printtaskWithBLOBs);
	printtaskWithBLOBs selectByPrimaryKey(Integer integer);
	int updateByPrimaryKeySelective(printtaskWithBLOBs printtaskWithBLOBs);
	int deleteByPrimaryKey(Integer integer);
	int updateByPrimaryKey(printtask printtask);
	int insertSelective(printtaskWithBLOBs printtaskWithBLOBs);
	int updateByPrimaryKeyWithBLOBs(printtaskWithBLOBs printtaskWithBLOBs);

}
