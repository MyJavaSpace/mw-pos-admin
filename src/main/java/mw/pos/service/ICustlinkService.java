package mw.pos.service;

import com.pos.entity.*;

public interface ICustlinkService {
	int insert(custlinkKey custlinkKey);
	int deleteByPrimaryKey(custlinkKey custlinkKey);
	int insertSelective(custlinkKey custlinkKey);

}
