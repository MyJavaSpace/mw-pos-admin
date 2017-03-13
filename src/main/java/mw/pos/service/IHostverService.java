package mw.pos.service;

import com.pos.entity.*;

public interface IHostverService {
	int insert(hostver hostver);
	hostver selectByPrimaryKey(hostverKey hostverKey);
	int updateByPrimaryKeySelective(hostver hostver);
	int deleteByPrimaryKey(hostverKey hostverKey);
	int updateByPrimaryKey(hostver hostver);
	int insertSelective(hostver hostver);

}
