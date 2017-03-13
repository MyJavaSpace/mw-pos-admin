package mw.pos.service;

import com.pos.entity.*;

public interface IHostexternalService {
	int insert(hostexternal hostexternal);
	hostexternal selectByPrimaryKey(hostexternalKey hostexternalKey);
	int updateByPrimaryKeySelective(hostexternal hostexternal);
	int deleteByPrimaryKey(hostexternalKey hostexternalKey);
	int updateByPrimaryKey(hostexternal hostexternal);
	int insertSelective(hostexternal hostexternal);
	int updateByPrimaryKeyWithBLOBs(hostexternal hostexternal);

}
