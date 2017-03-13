package mw.pos.service;

import com.pos.entity.*;

public interface IHostexternalService {
	int insert(Hostexternal hostexternal);
	int updateByPrimaryKeyWithBLOBs(Hostexternal hostexternal);
	int deleteByPrimaryKey(HostexternalKey hostexternalKey);
	int updateByPrimaryKey(Hostexternal hostexternal);
	Hostexternal selectByPrimaryKey(HostexternalKey hostexternalKey);
	int insertSelective(Hostexternal hostexternal);
	int updateByPrimaryKeySelective(Hostexternal hostexternal);

}
