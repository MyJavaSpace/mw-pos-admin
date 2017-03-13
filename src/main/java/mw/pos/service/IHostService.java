package mw.pos.service;

import com.pos.entity.*;

public interface IHostService {
	int insert(Host host);
	int deleteByPrimaryKey(HostKey hostKey);
	int updateByPrimaryKey(Host host);
	Host selectByPrimaryKey(HostKey hostKey);
	int insertSelective(Host host);
	int updateByPrimaryKeySelective(Host host);

}
