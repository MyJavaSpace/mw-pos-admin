package mw.pos.service;

import com.pos.entity.*;

public interface ICustlinkService {
	int insert(CustlinkKey custlinkKey);
	int deleteByPrimaryKey(CustlinkKey custlinkKey);
	int insertSelective(CustlinkKey custlinkKey);

}
