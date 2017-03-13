package mw.pos.service;

import com.pos.entity.*;

public interface IHostverService {
	int insert(Hostver hostver);
	int deleteByPrimaryKey(HostverKey hostverKey);
	int updateByPrimaryKey(Hostver hostver);
	Hostver selectByPrimaryKey(HostverKey hostverKey);
	int insertSelective(Hostver hostver);
	int updateByPrimaryKeySelective(Hostver hostver);

}
