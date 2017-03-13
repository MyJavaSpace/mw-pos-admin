package mw.pos.service;

import com.pos.entity.*;

public interface IPrinttaskService {
	int insert(PrinttaskWithBLOBs printtaskWithBLOBs);
	int updateByPrimaryKeyWithBLOBs(PrinttaskWithBLOBs printtaskWithBLOBs);
	int deleteByPrimaryKey(Integer integer);
	int updateByPrimaryKey(Printtask printtask);
	PrinttaskWithBLOBs selectByPrimaryKey(Integer integer);
	int insertSelective(PrinttaskWithBLOBs printtaskWithBLOBs);
	int updateByPrimaryKeySelective(PrinttaskWithBLOBs printtaskWithBLOBs);

}
