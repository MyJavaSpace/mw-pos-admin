package mw.pos.service;

import com.pos.entity.*;

public interface IHostService {
	int insert(host host);
	host selectByPrimaryKey(hostKey hostKey);
	int updateByPrimaryKeySelective(host host);
	int deleteByPrimaryKey(hostKey hostKey);
	int updateByPrimaryKey(host host);
	int insertSelective(host host);

}
